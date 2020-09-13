package com.klajdihoxha.myrecipesproject.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
//@JsonIdentityInfo(
//		  generator = ObjectIdGenerators.IntSequenceGenerator.class,
//		  property = "@id")
public class Ingredient extends AuditModel{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String icon;
	private String description;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "ingredients")
	@JsonBackReference
	private Set<Recipe> recipes;
	

}
