package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {

    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void navigateToLoginPage() {
        homePage.clickAccountLink();
        homePage.clickLoginLink();
    }

    @Step
    public void setUserEmail(String email) {
        loginPage.setEmailField(email);
    }

    @Step
    public void setPassword(String password) {
        loginPage.setPasswordField(password);
    }

    @Step
    public void clickLogin() {
        loginPage.clickLoginButton();
    }

    @Step
    public void verifyUserIsLoggedIn(String userName) {
        Assert.assertEquals("Hello, " + userName + "!", accountPage.getWelcomeText());
    }

    @Step
    public void verifyUserNotLoggedIn(){
        Assert.assertEquals("Invalid login or password.",loginPage.getErrorMessage());
    }

    @Step
    public void doLogin(String email, String pass){
        navigateToLoginPage();
        setUserEmail(email);
        setPassword(pass);
        clickLogin();
    }
}
