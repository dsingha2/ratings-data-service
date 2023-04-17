package io.javabrains.ratingsdataservice.resources;

import io.javabrains.ratingsdataservice.model.Ratings;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class RatingsDataResource {

    @RequestMapping("/{movieId}")
    public Ratings getRatings(@PathVariable String movieId){
        return new Ratings(movieId, 4);
    }
}
