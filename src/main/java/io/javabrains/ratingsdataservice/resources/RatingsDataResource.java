package io.javabrains.ratingsdataservice.resources;

import io.javabrains.ratingsdataservice.model.Ratings;
import io.javabrains.ratingsdataservice.model.UserRatings;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingsDataResource {

    @RequestMapping("/{movieId}")
    public Ratings getRatings(@PathVariable String movieId){
        return new Ratings(movieId, 4);
    }

    @RequestMapping("/user/{userId}")
    public UserRatings getRatingsList(@PathVariable String userId){
        return new UserRatings(Arrays.asList(new Ratings("1234", 4), new Ratings("2345", 5)));

    }
}
