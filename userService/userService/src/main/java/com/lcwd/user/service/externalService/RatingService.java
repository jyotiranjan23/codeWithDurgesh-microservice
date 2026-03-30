package com.lcwd.user.service.externalService;

import com.lcwd.user.service.entity.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "RATING-SERVICE")
@Service
public interface RatingService {
    @GetMapping("/ratings/user/{userId}")
    List<Rating> getRating(@PathVariable("userId") String userId);

    @PostMapping("/ratings")
    Rating createRating(Rating values);
}
