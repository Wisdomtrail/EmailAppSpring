package App.data.repository;

import App.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByLastName(String lastName);

    User findByEmail(String email);

    void deleteUserById(int id);

    User findById(int id);
}