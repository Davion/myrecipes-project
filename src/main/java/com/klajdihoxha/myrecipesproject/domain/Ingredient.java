package com.klajdihoxha.myrecipesproject.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Ingredient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String icon;
	private String description;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "ingredients")
	private List<Recipe> recipes;
	

}
