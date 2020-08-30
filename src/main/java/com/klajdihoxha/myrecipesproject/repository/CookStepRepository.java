package com.klajdihoxha.myrecipesproject.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klajdihoxha.myrecipesproject.model.CookStep;

@Repository
public interface CookStepRepository extends JpaRepository<CookStep, Long>{

}
