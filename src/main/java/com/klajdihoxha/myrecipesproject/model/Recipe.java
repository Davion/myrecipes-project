package com.klajdihoxha.myrecipesproject.model;

import java.util.Set;

import javax.persistence.*;


import com.fasterxml.jackson.annotation.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
//@JsonIdentityInfo(
//		  generator = ObjectIdGenerators.IntSequenceGenerator.class,
//		  property = "@id")
public class Recipe extends AuditModel{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JsonBackReference
	private Set<Ingredient> ingredients;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ID")
	@JsonIgnore
	private User user;
}
