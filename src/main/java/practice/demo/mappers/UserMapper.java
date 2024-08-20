package practice.demo.mappers;

import org.springframework.stereotype.Component;
import org.modelmapper.*;
import practice.demo.domain.*;
import practice.demo.domain.dto.UserDto;

@Component
public class UserMapper implements Mapper<User, UserDto>{
    private final ModelMapper modelMapper;

    public UserMapper(ModelMapper modelmapper) {
        this.modelMapper = modelmapper;
    }

    @Override
    public UserDto mapTo(User user) {
        return modelMapper.map(user, UserDto.class);
    }

    @Override
    public User mapFrom(UserDto user) {
        return modelMapper.map(user, User.class);
    }

}
