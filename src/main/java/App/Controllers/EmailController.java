package App.Controllers;


import App.Dto.Request.EmailRequest;
import App.Services.EmailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmailController {

    @Autowired
    EmailServices emailServices;

    @PostMapping("Email/sendMail")
    public Object sendMail(EmailRequest request) {
        try {
            return emailServices.sendMail(request);
        }catch (NullPointerException e){
           return e.getMessage();
        }
    }

    @GetMapping("Email/checkMail")
    public String checkMail(int id) {
        try {
            return emailServices.checkMail(id);
        }catch (NullPointerException e){
            return e.getMessage();
        }
    }

    @PostMapping("Email/deleteMail")
    public void deleteMail(int id) {
        try {
            emailServices.deleteMail(id);
        }
        catch (NullPointerException e){
            e.getMessage();
        }
    }

    @PostMapping("Email/getMailSize")
    public int mailSize(){
        return emailServices.mailSize();
    }
}