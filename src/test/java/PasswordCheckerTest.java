import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PasswordCheckerTest {
    @Test
    public void GlobalVariablesTest(){
        assertEquals(PasswordChecker.uppercase,"(.*[A-Z].*)");
        assertEquals(PasswordChecker.lowercase,"(.*[a-z].*)");
        assertEquals(PasswordChecker.digit,"(.*[0-9].*)");
        assertEquals(PasswordChecker.specialChar,"(.*[! # @ $ % ^ & * ( ) - _ = + [ ] ; : ' \" , < . > / ?].*)");
        assertEquals(PasswordChecker.space,"(.*[ ].*)");
    }
    @Test(expected = Exception.class)
    public void passwordIsValidTest() throws Exception {

        Assert.assertEquals(PasswordChecker.passwordIsValid("Raymonds@3"),"Password is Valid");

        String expectedexist = "- password should exist";
        Assert.assertEquals(PasswordChecker.passwordIsValid(""), expectedexist);

        String expected = "- password should be longer than than 8 characters";
        Assert.assertEquals(PasswordChecker.passwordIsValid("ray"), expected);

        String expectedlower = "- password should have at least one lowercase letter";
        Assert.assertEquals(PasswordChecker.passwordIsValid("RAYMONDS@3"), expectedlower);

        String expectedupper = "- password should have at least one uppercase letter";
        Assert.assertEquals(PasswordChecker.passwordIsValid("raymonds@3"), expectedupper);

        String expecteddigit = "- password should at least have one digit";
        Assert.assertEquals(PasswordChecker.passwordIsValid("Raymonds@"), expecteddigit);

        String expectedspecial = "- password should have at least one special character";
        Assert.assertEquals(PasswordChecker.passwordIsValid("Raymonds3"), expectedspecial);

        String expectedspace = "- password shouldn't have spaces";
        Assert.assertEquals(PasswordChecker.passwordIsValid("Raymonds@ 3"), expectedspace);
    }

    @Test(expected = Exception.class)
    public void passwordIsOkTest() throws Exception {
        Assert.assertEquals(PasswordChecker.passwordIsOk("Raymonds@3"),"Password is Valid");

        String expected = "the password is never OK if it doesn't exist and its" +
                " less than 8 characters are not met.";
        Assert.assertEquals(PasswordChecker.passwordIsOk(""), expected);

        String expected1 = "the password is never OK if it doesn't exist and its" +
                " less than 8 characters are not met.";
        Assert.assertEquals(PasswordChecker.passwordIsOk("ray"), expected1);

        String expectedok = "password is OK";
        Assert.assertEquals(PasswordChecker.passwordIsOk("Raymonds3"), expectedok);
    }
}
