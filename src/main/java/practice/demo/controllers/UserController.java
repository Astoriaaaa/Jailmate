package practice.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import practice.demo.domain.User;
import practice.demo.domain.dto.UserDto;
import practice.demo.mappers.Mapper;
import practice.demo.service.UserService;



@RestController
public class UserController {

    public UserService userService;
    public Mapper<User, UserDto> userMapper;

    


    public UserController(UserService userService, Mapper<User, UserDto> userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @PostMapping("/create-userr")
    public UserDto createUser(@RequestBody UserDto user) {
        
        User user_new = userMapper.mapFrom(user);
        User user_saved = userService.createUser(user_new);
        UserDto userDto = userMapper.mapTo(user_saved);
        return userDto;
    }

    @GetMapping
    ("/get-userss")
    public Iterable<User> getUsers() {
        return userService.getUsers();
    }
    
}
