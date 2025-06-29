package filmliste_backend.service;

import filmliste_backend.model.Movie;
import filmliste_backend.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void deleteById(Long id) {
        movieRepository.deleteById(id);
    }

    public Movie updateWatchedStatus(Long id, boolean watched) {
        Optional<Movie> movieOptional = movieRepository.findById(id);
        if (movieOptional.isPresent()) {
            Movie movie = movieOptional.get();
            movie.setWatched(watched);
            return movieRepository.save(movie);
        }
        return null;
    }

    public Movie updateFavoriteStatus(Long id, boolean favorite) {
        Optional<Movie> movieOptional = movieRepository.findById(id);
        if (movieOptional.isPresent()) {
            Movie movie = movieOptional.get();
            movie.setFavorite(favorite);
            return movieRepository.save(movie);
        }
        return null;
    }
}
