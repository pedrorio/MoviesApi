package co.wearebo.moviecatalogservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class CatalogItem {
	@Getter @Setter private String name;
	@Getter @Setter private String description;
	@Getter @Setter private int rating;	
}