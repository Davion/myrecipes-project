package com.klajdihoxha.myrecipesproject.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Ingredient extends AuditModel{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String icon;
	private String description;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "ingredients")
	private Set<Recipe> recipes;
	

}
