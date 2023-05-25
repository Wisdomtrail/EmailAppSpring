package App.Dto.Request;

import lombok.Data;

import java.util.Date;
@Data
public class EmailRequest {
    private String subject;
    private String body;
    private Date timestamp;
    private String email;
    private int Id;
    private String receiver;

}