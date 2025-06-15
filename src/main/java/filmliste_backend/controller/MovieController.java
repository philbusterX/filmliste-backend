package filmliste_backend.controller;

import filmliste_backend.model.Movie;
import filmliste_backend.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
}
