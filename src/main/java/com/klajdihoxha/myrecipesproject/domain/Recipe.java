package com.klajdihoxha.myrecipesproject.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;

import lombok.Data;

@Data
@Entity
public class Recipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	
	private Date createdAt;
	
	@ManyToMany(targetEntity = Ingredient.class)
	List<Ingredient> ingredients;
	@OneToMany(targetEntity = CookStep.class)
	List<CookStep> cookSteps;
	
	@PrePersist
	void createdAt() {
		this.createdAt = new Date();
	}
}
