package org12.example.exception.userDefined;
class ExceptionbyUser extends Exception{
    ExceptionbyUser(String m){
        super(m);
    }
}
public class MyException {
    public static void main(String[] args) {
        try{
            throw new ExceptionbyUser("This is custom exception");
        }
        catch(ExceptionbyUser e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
