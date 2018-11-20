package com.github.sparsick.logging;


import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StarWarsMovieControllerTest {

    @Test
    void findAllMovies() {
        StarWarsMovieController controllerUnderTest = new StarWarsMovieController();
        List<StarWarsMovie> movies = controllerUnderTest.findAllMovies();

        Assertions.assertThat(movies)
                .hasSize(2)
                .extracting("director")
                .containsExactlyInAnyOrder("George Lucas", "J. J. Abrams");
    }
}