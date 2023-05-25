package App.data.repository;

import App.Dto.Request.EmailRequest;
import App.data.models.Email;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface EmailRepository extends MongoRepository<Email, EmailRequest>{

    Email findById(int id);

    void deleteMail(int id);

    int countMails();
}
