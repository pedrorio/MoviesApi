package co.wearebo.movieinfoservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Movie {
	@Getter @Setter	private String movieId;
	@Getter @Setter private String name;
}