package bus;

import java.util.ArrayList;
import java.util.List;

public class SignupLogin {

    List<User> userList=new ArrayList<>();
    public String  signup(String name,long phone, String email,String street,String city,String state,String password){

        for (User user:userList){

            if (user.getContact().getEmail().equals(email)){
                return "SignUp unsuccessful ,Email Already taken";
            }

        }
        Contact contact=new Contact(name,phone,email);
        Address address=new Address(street,city,state);
        User user=new User(contact,address,password);
        userList.add(user);
        return "SignUp successful";

    }

    public String login(String email,String password){

        for (User user:userList){
            if (!email.equals(user.getContact().getEmail())){

                return "user email incorrect";
            }
            if (!password.equals(user.getPassword())){
                return "password incorrect";
            }

        }
        return "login successful";
    }

}
