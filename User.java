User
package com.OOP_1;

public class User {
    String name;
    String password;


    String login(){
      return "logged In";
    }

    String Register(){
        if(name.equals("Zara") || password.equals("123456")){
            return "Can't be empty!";
        }
        else {
            return "Successfully Registered";
        }
    }
}