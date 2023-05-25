package App.Dto.Request;

import lombok.Data;

@Data
public class CreateUserRequest {
    private String FirstName;
    private String LastName;
    private int id;
    private String phoneNumber;
    private String email;
}