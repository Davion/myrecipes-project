package com.klajdihoxha.myrecipesproject.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Role {

    @Id
    private Long id;

    private String role;


}
