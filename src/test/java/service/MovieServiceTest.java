package filmliste_backend.service;

import filmliste_backend.model.Movie;
import filmliste_backend.repository.MovieRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MovieServiceTest {

    @Mock
    private MovieRepository movieRepository;

    @InjectMocks
    private MovieService movieService;

    @Test
    public void testFindAllMovies() {
        // 1. Vorbereitung (Arrange)
        // Wir erstellen zwei Dummy-Filme
        Movie movie1 = new Movie("Inception", 2010, "Sci-Fi", 9.0, true, false, "");
        Movie movie2 = new Movie("The Matrix", 1999, "Action", 8.8, true, true, "");
        List<Movie> dummyMovies = List.of(movie1, movie2);

        // Wir sagen unserem "Dummy"-Repository, was es tun soll:
        // WENN die Methode `findAll()` aufgerufen wird, DANN gib unsere Dummy-Liste zurück.
        when(movieRepository.findAll()).thenReturn(dummyMovies);

        // 2. Ausführung (Act)
        // Wir rufen die Methode auf, die wir testen wollen.
        List<Movie> result = movieService.findAll();

        // 3. Überprüfung (Assert)
        // Wir überprüfen, ob das Ergebnis das ist, was wir erwarten.
        assertEquals(2, result.size()); // Erwarten wir 2 Filme?
        assertEquals("Inception", result.get(0).getTitle()); // Ist der erste Film "Inception"?
    }
}
