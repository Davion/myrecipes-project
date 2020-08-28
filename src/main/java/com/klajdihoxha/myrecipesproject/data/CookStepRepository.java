package com.klajdihoxha.myrecipesproject.data;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klajdihoxha.myrecipesproject.domain.CookStep;

@Repository
public interface CookStepRepository extends JpaRepository<CookStep, Long>{

}
