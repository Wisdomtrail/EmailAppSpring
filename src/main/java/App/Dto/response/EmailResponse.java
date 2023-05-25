package App.Dto.response;

import lombok.Data;

import java.util.Date;

@Data
public class EmailResponse {

    private String body;
    private String email;
    private Date date;
    private String subject;
    private int id;
}
