package App.Controllers;


import App.Dto.Request.CreateUserRequest;
import App.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    UserServices userServices;

    @PostMapping("User/register")
    public void register( CreateUserRequest registerRequest){
        userServices.register(registerRequest);
    }

    @GetMapping("User/findByEmail")
    public Object findByEmail(String email) {
        try {
            return userServices.findByEmail(email);
        }catch (NullPointerException e){
            return e.getMessage();
        }
    }
    @GetMapping("User/countUsers")
    public long countUsers(){
        return userServices.countUsers();
    }

    @PostMapping("User/deleteUser")
    public void deleteUser( int id) {
        try {
            userServices.deleteUser(id);
        }catch (NullPointerException e){
            e.getMessage();
        }
    }

    @GetMapping("User/findById")
    public Object findById(int id) {
        try {
            return userServices.findById(id);
        }catch (NullPointerException e){
           return e.getMessage();
        }
    }
    @GetMapping("User/findByLastName")
    public Object findByLastName(String lastName) {
        try {
            return userServices.findByLastName(lastName);
        }catch (NullPointerException e){
            return e.getMessage();
        }
    }
}
