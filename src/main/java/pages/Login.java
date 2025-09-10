package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {
    private WebDriver driver;
    By emailTextFieldLoctor=By.xpath("//input[@id='Email']");
    By passwordTextFieldLoctot=By.xpath("//input[@id='Password']");
    By loginButtonLoctor=By.xpath("//button[text()='Log in']");
    By dashboardTextLoctor=By.xpath("//h1[contains(text(),'Dashboard')]");

    public Login(WebDriver driver)
    {
        this.driver=driver;
    }
    public WebElement explicitWait(By loctor,int seconds)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(seconds));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(loctor));
    }
    public void enterEmail(String userName)
    {
        WebElement element=explicitWait(emailTextFieldLoctor,10);
        element.clear();
        element.sendKeys(userName);
    }
    public void enterPassword(String password)
    {
        WebElement element=explicitWait(passwordTextFieldLoctot,10);
        element.clear();
        element.sendKeys(password);
    }
    public void clickLoginButton()
    {
        explicitWait(loginButtonLoctor,10).click();

    }
    public String dashboardText()
    {
        return explicitWait(dashboardTextLoctor,10).getText();
    }

}
