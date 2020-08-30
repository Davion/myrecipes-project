package com.klajdihoxha.myrecipesproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klajdihoxha.myrecipesproject.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
