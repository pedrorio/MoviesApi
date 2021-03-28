package co.wearebo.moviecatalogservice.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Movie {
	@Getter @Setter	private String movieId;
	@Getter @Setter private String name;
}