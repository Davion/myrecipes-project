package com.klajdihoxha.myrecipesproject.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klajdihoxha.myrecipesproject.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
