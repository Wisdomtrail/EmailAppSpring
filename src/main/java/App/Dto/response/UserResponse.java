package App.Dto.response;


import lombok.Data;

@Data
public class UserResponse {
    private String email;
    private String phoneNumber;
    private String fullName;
    private int id;


}