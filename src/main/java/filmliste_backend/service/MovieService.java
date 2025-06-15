package filmliste_backend.service;

import filmliste_backend.model.Movie;
import filmliste_backend.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie findById(Long id) {
        return movieRepository.findById(id).orElse(null);
    }

    public List<Movie> findAll() {
        return (List<Movie>) movieRepository.findAll();
    }
}
