package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * To identify if a locator that we use is unique
 * We will open in our DOM the search selector box
 * We can do it by:
 * Win - Ctrl + F
 * MAC - Command + F
 * */


public class Locators {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // Your driver receives the html from the server and lands there
        driver.get("http://dev-hrm.yoll.io/");

        // findElement is a method that will look for a specific web element in the html
        // however, by itself it cannot do it
        // we will need to provide a locator inside
        // By.id, By.name
        Thread.sleep(5000);
        WebElement usernameInput = driver.findElement(By.name("txtUsername"));
        WebElement passwordInput = driver.findElement(By.name("txtPassword"));

        WebElement forgotPass = driver.findElement(By.partialLinkText("Forgot"));
        forgotPass.click();

        usernameInput.sendKeys("username123");
        Thread.sleep(2000);

        usernameInput.clear();
        Thread.sleep(2000);

        usernameInput.sendKeys("yoll-student");
        Thread.sleep(2000);

        passwordInput.sendKeys("Bootcamp5#");
        Thread.sleep(1000);


        // This expression returns a WebElement type
        //Opt 1
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
//
//        Opt 2 - without shoring a variable
//        driver.findElement(By.id("btnLogin")).click();

        Thread.sleep(5000);

        driver.quit();

    }

}