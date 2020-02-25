public class PasswordChecker {
    public static String uppercase = "(.*[A-Z].*)";
    public static String lowercase = "(.*[a-z].*)";
    public static String digit = "(.*[0-9].*)";
    public static String specialChar = "(.*[! # @ $ % ^ & * ( ) - _ = + [ ] ; : ' \" , < . > / ?].*)";
    public static String space = "(.*[ ].*)";

    public static boolean passwordIsValid(String password) {
        if(password.isEmpty()) {
            System.out.println("- password should exist");
            return false;
        }else{
            if (password.length() < 8) {
                System.out.println("- password should be longer than than 8 characters");
                return false;
            }else{
                if(!password.matches(lowercase)) {
                    System.out.println("- password should have at least one lowercase letter");
                    return false;
                }else {
                    if(!password.matches(uppercase)){
                        System.out.println("- password should have at least one uppercase letter");
                        return false;
                    }else {
                        if(!password.matches(digit)){
                            System.out.println("- password should at least have one digit");
                            return false;
                        }else{
                            if(!password.matches(specialChar)){
                                System.out.println("- password should have at least one special character");
                                return false;
                            }else {
                                if(password.matches(space)){
                                    System.out.println("- password shouldn't have spaces");
                                    return false;
                                }else {
                                    System.out.println("Password is Valid");
                                    return true;
                                }
                            }
                        }

                    }
                }
            }

        }
    }

    public static boolean passwordIsOk(String password){
        if(password.isEmpty()){
            System.out.println("the password is never OK if it doesn't exist and its" +
                    " less than 8 characters are not met.");
            return false;
        }
        if(password.length() < 8){
            System.out.println("the password is never OK if it doesn't exist and its" +
                    " less than 8 characters are not met.");
            return false;
        } else {
            if (!password.matches(lowercase) || !password.matches(uppercase) ||
            !password.matches(digit) || !password.matches(specialChar)){
                System.out.println("password is OK");
                return false;
            }else {
                System.out.println("Password is Valid");
                return true;
            }
        }

    }


    public static void main(String[] args) {

        passwordIsValid("raymondsere");
        passwordIsOk("raymondsere");
    }
}
