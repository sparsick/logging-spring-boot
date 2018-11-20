package com.github.sparsick.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("starwars")
public class StarWarsMovieController {

    private static final Logger LOGGER = LogManager.getLogger(StarWarsMovieController.class);

    @RequestMapping(value="movies", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody List<StarWarsMovie> findAllMovies(){
        LOGGER.info("INFO Star Wars Movie List");
        LOGGER.trace("TRACE Star Wars Movie List");
        LOGGER.error("ERROR Star Wars Movie List");
        LOGGER.warn("WARN Star Wars Movie List");
        LOGGER.debug("DEBUG Star Wars Movie List");
        return List.of(new StarWarsMovie("A New Hope", "George Lucas"),
                new StarWarsMovie("The Force Awakens", "J. J. Abrams"));
    }
}
