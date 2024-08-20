package practice.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import practice.demo.domain.User;

public interface usersRepo extends CrudRepository<User, String> {
    
}
