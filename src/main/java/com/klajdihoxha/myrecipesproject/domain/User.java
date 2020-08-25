package com.klajdihoxha.myrecipesproject.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;

import lombok.Data;

@Data
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Date birthday;
	
	private Date createdAt;
	
	@OneToMany(targetEntity = Recipe.class)
	private Recipe recipe;
	
	@PrePersist
	void createdAt() {
		this.createdAt = new Date();
	}

	

}
