package com.klajdihoxha.myrecipesproject.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
	
	@ManyToMany()
	private List<Ingredient> ingredients;
	@OneToMany(mappedBy = "recipe")
	private List<CookStep> cookSteps;
	
	@ManyToOne
	private User user;
	
	@PrePersist
	void createdAt() {
		this.createdAt = new Date();
	}
}
