package org7.example.encapsulation;

import java.util.Scanner;

public class LoginAuthenticate {
    private String username;
    private String password;

    // Setters
     public void setUsername(String username){
         this.username=username;
      }
      public void setPassword(String password){
         if(password.length()>=8){
            this.password=password;
         }else{
            System.out.println("Password length should be at least 8 characters");
            this.password=null;
   }
}
// Getters (optional,(though in real systems, we avoid exposing passwords like this))
//    public String getUsername(){
//         return username;
//    }
//    public String getPassword(){
//         return password;
//    }
//Simplest way of authenticate method://
//    public boolean authenticate(String inputUser, String inputPass) {
//        return username != null && password != null &&
//                username.equals(inputUser) && password.equals(inputPass);
//    }

    // Authentication method(for individual user)
    public boolean authenticate(String inputUser, String inputPassword){
         if(username!=null && password!=null){
             if (username.equals(inputUser) && password.equals(inputPassword)) {
                 return true;
             }else{
                return false;
             }
            }else{
              return false;
            }
    }
    // Method to authenticate among all users
    public static void authenticateAllUsers(LoginAuthenticate[] users, String inputUser, String inputPassword){
         boolean flag=false;
         for(LoginAuthenticate user:users)   {
          if(user.authenticate(inputUser, inputPassword)==true){
              System.out.println("Login Successful");
              System.out.println("Welcome, " + inputUser + "!");
              flag=true;
              break;
          }
      }
         if(flag==false){
             System.out.println("Login Failed");
         }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating two user accounts
        LoginAuthenticate user15 = new LoginAuthenticate();
        LoginAuthenticate user16 = new LoginAuthenticate();

        // Setting login credentials,Setting default username and password(instead of database)
        user15.setUsername("Prabisha");
        user15.setPassword("pass1234");

        user16.setUsername("Ragin");
        user16.setPassword("pass1534");

        // Store users in an array
        LoginAuthenticate[] users = {user15, user16};

        // First User input for login
        System.out.println("Enter your username: ");
        String userInputName=sc.nextLine();

        System.out.println("Enter your password: ");
        String userInputPassword=sc.nextLine();


       //static method so no need of object
        authenticateAllUsers(users,userInputName, userInputPassword);
        sc.close();

     }

}
