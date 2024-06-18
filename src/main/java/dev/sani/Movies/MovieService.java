package dev.sani.Movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }
//    public Optional<Movie> findMovieByImdbId(String imdbId) {
//        return repository.findMovieByImdbId(imdbId);
//    }

}
