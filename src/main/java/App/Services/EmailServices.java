package App.Services;

import App.Dto.Request.EmailRequest;
public interface EmailServices  {

    String sendMail(EmailRequest request);
    String checkMail(int id);
    void deleteMail(int id);
    int mailSize();
}
