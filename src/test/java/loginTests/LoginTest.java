package loginTests;

import org.junit.Test;
import parentTest.ParentTest;

public class LoginTest extends ParentTest {
    @Test
    public void validLogIn(){
        homePage.openPage();
        homePage.clickOnAvatarLink();
        loginPage.focusToNewTab();
        loginPage.checkCurrentUrl();
        loginPage.enterLogin("bsl604@gmail.com");
        loginPage.clikOnNextButton();
        loginPage.enterPass("bsl604fast");
        loginPage.clikOnSignInButton();
        homeOkkPetitions.checkCurrentUrl();

        checkAC("Avatar is not present"
                , homeOkkPage.isAvatarPresent()
                , true);
    }

    @Test
    public void unValidLogIn(){
        homePage.openPage();
        homePage.clickOnAvatarLink();
        loginPage.focusToNewTab();
        loginPage.checkCurrentUrl();
//        loginPage.enterLogin("bsl604@gmail.com");
//        loginPage.clikOnNextButton();
//        loginPage.enterPass("bsl604fast");
//        loginPage.clikOnSignInButton();
//        homeOkkPetitions.checkCurrentUrl();
//
//        checkAC("Avatar is not present"
//                , homeOkkPage.isAvatarPresent()
//                , true);
    }
}
