package co.wearebo.ratingsdataservice.resources;

import co.wearebo.ratingsdataservice.models.Rating;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;;
import org.springframework.web.bind.annotation.PathVariable;;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

	@RequestMapping("/{movieId}")
	public Rating getRatingInfo(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);
	}
	
}