package org.fasttrack.features;

import org.junit.Test;

public class LoginTest extends BaseTest{


    @Test
    public void loginWithValidCredentialsTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail("cosmin@fasttrackit.org");
        loginSteps.setPassword("123456");
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn("Cosmin Fas");
    }

    @Test
    public void loginWithInvalidPasswordTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail("cosmin@fasttrackit.org");
        loginSteps.setPassword("12345a");
        loginSteps.clickLogin();
        loginSteps.verifyUserNotLoggedIn();
    }


}
