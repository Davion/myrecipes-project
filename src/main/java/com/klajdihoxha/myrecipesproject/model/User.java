package com.klajdihoxha.myrecipesproject.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "USERS")
//@JsonIdentityInfo(
//		  generator = ObjectIdGenerators.IntSequenceGenerator.class,
//		  property = "@id")
public class User extends AuditModel{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Date birthday;
	private String mobileNumber;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy= "user")
	@JsonBackReference
	private Set<Recipe> recipes;

	@OneToMany
	private Set<Role> roles;


	public String getFullName() {
		return firstName != null ? firstName.concat(" ").concat(lastName) : "";
	}
	
}
