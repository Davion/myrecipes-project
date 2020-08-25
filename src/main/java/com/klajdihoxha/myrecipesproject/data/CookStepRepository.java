package com.klajdihoxha.myrecipesproject.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klajdihoxha.myrecipesproject.domain.CookStep;

@Repository
public interface CookStepRepository extends CrudRepository<CookStep, Long>{

}
