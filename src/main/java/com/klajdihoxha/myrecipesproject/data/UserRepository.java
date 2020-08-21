package com.klajdihoxha.myrecipesproject.data;

import org.springframework.data.repository.CrudRepository;

import com.klajdihoxha.myrecipesproject.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
