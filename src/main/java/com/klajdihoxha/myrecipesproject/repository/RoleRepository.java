package com.klajdihoxha.myrecipesproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klajdihoxha.myrecipesproject.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {

    Role findByRole(String role);
}
