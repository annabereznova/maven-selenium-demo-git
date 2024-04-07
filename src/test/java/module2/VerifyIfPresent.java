package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyIfPresent {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://dev-hrm.yoll.io/index.php/auth/login");

        String username = "yoll-student";
        String password = "Bootcamp5#";

        WebElement usernameInput = driver.findElement(By.cssSelector("[id = txtUsername]"));
        WebElement passwordInput = driver.findElement(By.cssSelector("[id = txtPassword]"));
        WebElement loginButton = driver.findElement(By.cssSelector("[id = btnLogin]"));

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();

        WebElement welcomeMessage = driver.findElement(By.cssSelector("#welcome"));
        boolean isMessageDisplaied = welcomeMessage.isDisplayed();
        System.out.println("The welcome message is displaieed: " + isMessageDisplaied);

        boolean isWelcomeElementEnablaied = welcomeMessage.isEnabled();

        System.out.println("The welcome message is enaibled: " + isWelcomeElementEnablaied);

        WebElement myInfoTab = driver.findElement(By.cssSelector("#menu_pim_viewMyDetails"));
        myInfoTab.click();

        Thread.sleep(2000);
WebElement firstName = driver.findElement(By.cssSelector("#personal_txtEmpFirstName"));
boolean isFirstNmaeEnabled = firstName.isEnabled();

        System.out.println("First name is enableed: " + isFirstNmaeEnabled);

        WebElement editButton = driver.findElement(By.cssSelector("#btnSave"));
        editButton.click();
        Thread.sleep(2000);

        boolean isFirstnameBoxEnabledAfterEdit = firstName.isEnabled();
        System.out.println("First name is enabled after clicking Edit: " + isFirstnameBoxEnabledAfterEdit);



        driver.quit();







    }
}
