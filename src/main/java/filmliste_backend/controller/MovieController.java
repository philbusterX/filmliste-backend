package filmliste_backend.controller;

import filmliste_backend.model.Movie;
import filmliste_backend.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = {"http://localhost:5173", "https://filmliste-frontend.onrender.com"})
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/movies")
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        var savedMovie = movieService.save(movie);
        return ResponseEntity.ok(savedMovie);
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> getAllMovies() {
        return ResponseEntity.ok(movieService.findAll());
    }

    @DeleteMapping("/movies/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id) {
        movieService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/movies/{id}")
    public ResponseEntity<Movie> updateMovieStatus(@PathVariable Long id, @RequestBody Map<String, Boolean> payload) {
        Movie updatedMovie = null;
        if (payload.containsKey("watched")) {
            updatedMovie = movieService.updateWatchedStatus(id, payload.get("watched"));
        } else if (payload.containsKey("favorite")) {
            updatedMovie = movieService.updateFavoriteStatus(id, payload.get("favorite"));
        } else {
            return ResponseEntity.badRequest().build();
        }

        if (updatedMovie != null) {
            return ResponseEntity.ok(updatedMovie);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
