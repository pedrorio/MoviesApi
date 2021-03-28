package co.wearebo.moviecatalogservice.resources;

import co.wearebo.moviecatalogservice.models.CatalogItem;
import co.wearebo.moviecatalogservice.models.Rating;
import co.wearebo.moviecatalogservice.models.Movie;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	@Autowired
	private RestTemplate restTemplate;


	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String itemId) {

		List<Rating> ratings = Arrays.asList(
			new Rating("12345", 4),
			new Rating("23456", 3)
		);

		return ratings.stream().map(rating -> {
			Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), Movie.class);
			return new CatalogItem(movie.getName(), "Description", rating.getRating());
		})
		.collect(Collectors.toList());
	}
	
}