package loginTests;

import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

public class LoginTest extends ParentTest {
    @Test
    public void validLogIn(){
        loginPage.openPage();
        loginPage.enterLogin("bsl604@gmail.com");
        loginPage.clikOnNextButton();
        loginPage.enterPass("bsl604fast");
        loginPage.clikOnSignInButton();
//        homeOkkPage.checkCurrentUrl();

//        checkAC("Avatar is not present"
//                , homeOkkPage.isAvatarPresent()
//                , true);
    }
}
