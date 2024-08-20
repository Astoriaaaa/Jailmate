package practice.demo.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import practice.demo.domain.User;
import practice.demo.features.EmailValidator;
import practice.demo.repositories.usersRepo;
import practice.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    
    private final usersRepo userRepo;
    public EmailValidator emailValidator;


    public UserServiceImpl(usersRepo userRepo, EmailValidator emailValidator) {
        this.userRepo = userRepo;
        this.emailValidator = emailValidator;
    }

    @Override
    public User createUser(User user) {
        Optional<User> duplicateUser = userRepo.findById(user.getUsername());
        Optional<User> duplicateEmail = userRepo.findById(user.getEmail());
        if(user.getUsername() == null || user.getPassword() == null || user.getEmail() == null) {
            throw new IllegalArgumentException("Missing one or more feilds");
        } else if(!emailValidator.isValidEmail(user.getEmail())) {
            throw new IllegalArgumentException("Invalid Email");
        } else if(duplicateEmail.isPresent()) {
            throw new IllegalArgumentException("You already have an account with this email");
        } else if(duplicateUser.isPresent()) {
            throw new IllegalArgumentException("Someone with the username already exits. Please enter a new one.");
        }
        return userRepo.save(user);
    }

    @Override
    public Iterable<User> getUsers() {
        return userRepo.findAll();
    }
}
