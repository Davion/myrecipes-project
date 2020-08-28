package com.klajdihoxha.myrecipesproject.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klajdihoxha.myrecipesproject.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
