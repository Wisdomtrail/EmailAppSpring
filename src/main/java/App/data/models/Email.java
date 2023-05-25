package App.data.models;



import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
public class Email {
    @Id
    private String id;
    private String subject;
    private String body;
    private Date timestamp;
    private String email;

}
    