package co.wearebo.moviecatalogservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Rating {
	@Getter @Setter	private String movieId;
	@Getter @Setter private int rating;
}