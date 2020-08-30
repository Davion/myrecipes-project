package com.klajdihoxha.myrecipesproject.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klajdihoxha.myrecipesproject.models.CookStep;

@Repository
public interface CookStepRepository extends JpaRepository<CookStep, Long>{

}
