package com.klajdihoxha.myrecipesproject.dto.mapper;

//import com.klajdihoxha.myrecipesproject.dto.model.RoleDto;
import com.klajdihoxha.myrecipesproject.dto.model.UserDto;
import com.klajdihoxha.myrecipesproject.model.User;
//import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

//import java.util.HashSet;
//import java.util.stream.Collectors;

@Component
public class UserMapper {

    public static UserDto toUserDto(User user){
        UserDto userDto = new UserDto();
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        //userDto.setBirthday(user.getBirthday());
        userDto.setMobileNumber(user.getMobileNumber());
//        userDto.setRoles(new HashSet<RoleDto>(user
//                        .getRoles()
//                        .stream()
//                        .map(role -> new ModelMapper().map(role, RoleDto.class))
//                        .collect(Collectors.toSet())));

        return userDto;
    }
}
