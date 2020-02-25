import org.junit.Assert;
import org.junit.Test;

public class PasswordCheckerTest {
    @Test
    public void GlobalVariables(){
        Assert.assertEquals(PasswordChecker.uppercase,"(.*[A-Z].*)");
        Assert.assertEquals(PasswordChecker.lowercase,"(.*[a-z].*)");
        Assert.assertEquals(PasswordChecker.digit,"(.*[0-9].*)");
        Assert.assertEquals(PasswordChecker.specialChar,"(.*[! # @ $ % ^ & * ( ) - _ = + [ ] ; : ' \" , < . > / ?].*)");
        Assert.assertEquals(PasswordChecker.space,"(.*[ ].*)");
    }
    @Test
    public void passwordIsValid(){
        Assert.assertEquals(PasswordChecker.passwordIsValid("Raymonds3@"),true);
        Assert.assertEquals(PasswordChecker.passwordIsValid("Raymonds3"),false);
    }
    @Test
    public void passwordIsOk(){
        Assert.assertEquals(PasswordChecker.passwordIsOk("Raymond3@"),true);
        Assert.assertEquals(PasswordChecker.passwordIsOk("Raymond3"),false);
    }
}
