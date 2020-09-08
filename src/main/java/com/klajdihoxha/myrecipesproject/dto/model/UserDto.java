package com.klajdihoxha.myrecipesproject.dto.model;

import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
public class UserDto {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String birthday;
    private String mobileNumber;
    private boolean isAdmin;
    private Set<RoleDto> roles;


    public String getFullName() {
        return firstName != null ? firstName.concat(" ").concat(lastName) : "";
    }
}
