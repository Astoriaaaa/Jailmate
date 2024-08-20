package practice.demo.service;
import org.springframework.stereotype.Component;

import practice.demo.domain.User;

@Component
public interface UserService {

    User createUser(User user);

    Iterable<User> getUsers();

}
