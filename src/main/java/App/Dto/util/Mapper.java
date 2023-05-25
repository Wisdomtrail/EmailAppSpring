package App.Dto.util;


import App.Dto.Request.CreateUserRequest;
import App.Dto.Request.EmailRequest;
import App.Dto.response.EmailResponse;
import App.Dto.response.UserResponse;
import App.data.models.Email;
import App.data.models.User;

import java.util.Date;

public class Mapper {

    public static void mapUser(User user, CreateUserRequest request){
        user.setFirstName(request.getFirstName());
        user.setPhoneNumber(request.getPhoneNumber());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setId(request.getId());
    }

    public static void mapEmail(Email email, EmailRequest request) {
        request.setTimestamp(new Date());
        email.setBody(request.getBody());
        email.setSubject(request.getSubject());
        email.setTimestamp(request.getTimestamp());
        email.setId(String.valueOf(request.getId()));

    }

    public static void mapUserRequestWithUserResponse(CreateUserRequest createUserRequest, UserResponse response){
        response.setFullName(createUserRequest.getFirstName()+" "+createUserRequest.getLastName());
        response.setEmail(createUserRequest.getEmail());
        response.setPhoneNumber(createUserRequest.getPhoneNumber());
        response.setId(createUserRequest.getId());
    }

    public static void mapEmailRequestWithResponse(EmailRequest emailRequest, EmailResponse response) {
        response.setEmail(emailRequest.getEmail());
        response.setBody(emailRequest.getBody());
        response.setSubject(emailRequest.getSubject());
        response.setId(emailRequest.getId());
        response.setDate(emailRequest.getTimestamp());
    }

    public static boolean validatePhoneNumber(String phoneNumber){
       String letters = "a,b,c,d,e,f,g,h,,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
       String upperCaseLetter = "A,B,C,,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";
        return !phoneNumber.contains(letters) && !phoneNumber.contains(upperCaseLetter);
    }
}
