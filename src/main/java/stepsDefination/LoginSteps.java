package stepsDefination;


import base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Login;

public class LoginSteps extends BaseTest {
    Login login;
    @Given("the user is on the login page")
    public void user_go_to_login_page() {
        setUp();
        login=new Login(driver);

    }
    @When("the user enters {string} and {string}")
    public void enter_user_name1_and_password1(String username,String password) {

        login.enterEmail(username);
        login.enterPassword(password);

    }
    @And("clicks on the login button")
    public void click_on_login_button() {

        login.clickLoginButton();

    }
    @Then("the user should be redirected to the home page")
    public void user_go_to_home_page() {

        Assert.assertEquals(login.dashboardText(),"Dashboard");
        close();
    }


}
