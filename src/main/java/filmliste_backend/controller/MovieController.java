package filmliste_backend.controller;

import filmliste_backend.model.Movie;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:5173", "https://filmliste-frontend.onrender.com"})
public class MovieController {

    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return List.of(
                new Movie(1L, "Inception", 2010, "Science Fiction", 9.0, true, true),
                new Movie(2L, "The Matrix", 1999, "Action", 6.6, true, false),
                new Movie(3L, "Interstellar", 2014, "Drama", 8.5, true, true)
        );
    }
}