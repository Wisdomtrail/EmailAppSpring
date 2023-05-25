package App.Services;

import App.Dto.Request.CreateUserRequest;
import App.Dto.response.UserResponse;
import App.Dto.util.Mapper;
import App.data.models.User;
import App.data.repository.UserRepository;
import exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServicesImpl implements UserServices {
    @Autowired
    UserRepository repository;

    @Override
    public void register(CreateUserRequest registerRequest) {
        User user = new User();
        repository.save(user);
    }


    @Override
    public User findById(int id) {
        User user = repository.findById(id);
        if (user != null) {
            return user;
        } else {
            throw new NullPointerException("User not found");
        }
    }

    @Override
    public User findByLastName(String lastName) {
        User user = repository.findByLastName(lastName);
        if (user != null) {
            return user;
        } else {
            throw new NullPointerException("User not found");
        }
    }

    @Override
    public User findByEmail(String email) {
        User user = repository.findByEmail(email);
        if (user != null) {
            return user;
        } else {
            throw new NullPointerException("User Not found");
        }
    }

    @Override
    public long countUsers() {
        return repository.count();
    }

    @Override
    public void deleteUser(int id) {
       User user = repository.findById(id);
        if (user != null) {
            repository.delete(user);
        } else {
            throw new NullPointerException("User not found");
        }
    }
}
