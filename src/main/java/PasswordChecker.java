import java.util.Scanner;

public class PasswordChecker {
    public static String uppercase = "(.*[A-Z].*)";
    public static String lowercase = "(.*[a-z].*)";
    public static String digit = "(.*[0-9].*)";
    public static String specialChar = "(.*[! # @ $ % ^ & * ( ) - _ = + [ ] ; : ' \" , < . > / ?].*)";
    public static String space = "(.*[ ].*)";

    public static String passwordIsValid(String password) throws Exception{
        String result = "";
        if (password.isEmpty()) {
            result = "- password should exist";
            throw new Exception("- password should exist");
        } else {
            if (password.length() < 8) {
                result = "- password should be longer than than 8 characters";
                throw new Exception("- password should be longer than than 8 characters");
            } else {
                if (!password.matches(lowercase)) {
                    result = "- password should have at least one lowercase letter";
                    throw new Exception("- password should have at least one lowercase letter");
                } else {
                    if (!password.matches(uppercase)) {
                        result = "- password should have at least one uppercase letter";
                        throw new Exception("- password should have at least one uppercase letter");
                    } else {
                        if (!password.matches(digit)) {
                            result = "- password should at least have one digit";
                            throw new Exception("- password should at least have one digit");
                        } else {
                            if (!password.matches(specialChar)) {
                                result = "- password should have at least one special character";
                                throw new Exception("- password should have at least one special character");
                            } else {
                                if (password.matches(space)) {
                                    result = "- password shouldn't have spaces";
                                    throw new Exception("- password shouldn't have spaces");
                                } else {
                                    result = "Password is Valid";
                                    System.out.println("Password is Valid");
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    public static String passwordIsOk(String password) throws Exception{
        String result1 = "";
        if(password.isEmpty()){
            result1 = "the password is never OK if it doesn't exist and its" +
                    " less than 8 characters are not met.";
            throw new Exception("the password is never OK if it doesn't exist and its" +
                    " less than 8 characters are not met.");
        }
        if(password.length() < 8){
            result1 = "the password is never OK if it doesn't exist and its" +
                    " less than 8 characters are not met.";
            throw new Exception("the password is never OK if it doesn't exist and its" +
                    " less than 8 characters are not met.");
        } else {
            if (!password.matches(lowercase) || !password.matches(uppercase) ||
            !password.matches(digit) || !password.matches(specialChar)){
                result1 = "password is OK";
                throw new Exception("password is OK");
            }else {
                result1 = "Password is Valid";
                System.out.println("Password is Valid");
            }
        }
        return result1;
    }


    public static void main(String[] args) {
        String password1;
        Scanner passwordInput = new Scanner(System.in);
        System.out.println("Please Enter Password?");
        password1 = passwordInput.nextLine();


        try {
            passwordIsValid(password1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            passwordIsOk(password1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
