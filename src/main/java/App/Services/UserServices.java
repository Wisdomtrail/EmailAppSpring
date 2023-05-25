package App.Services;

import App.Dto.Request.CreateUserRequest;
import App.data.models.User;
public interface UserServices {
    void register(CreateUserRequest registerRequest);
    User findByEmail(String email);
    long countUsers();
    void deleteUser(int id);
    User findById(int id);
    User findByLastName(String lasName);
}
