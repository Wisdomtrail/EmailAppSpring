package App.Services;

import App.Dto.Request.EmailRequest;
import App.Dto.response.EmailResponse;
import App.Dto.util.Mapper;
import App.data.models.Email;
import App.data.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailServicesImpl implements EmailServices {

    @Autowired
    EmailRepository repository;
    EmailResponse response = new EmailResponse();

    @Override
    public String sendMail(EmailRequest request) {
        if (request == null){
            throw new NullPointerException();
        }
        Email email = new Email();
        repository.save(email);
        Mapper.mapEmailRequestWithResponse(request,response);
        return response.toString();
    }


    @Override
    public String checkMail(int id) {
        Email email = repository.findById(id);
        if (email == null) {
            throw new NullPointerException();
        }
        return response.toString();
    }


    @Override
    public void deleteMail(int id) {
        if (repository.findById(id) != null) {
            repository.deleteMail(id);
        } else {
            throw new IllegalArgumentException();
        }
    }


    @Override
    public int mailSize() {
        return repository.countMails();
    }
}