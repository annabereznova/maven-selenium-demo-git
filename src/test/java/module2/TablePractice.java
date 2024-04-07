package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePractice {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String url = "https://magento.softwaretestingboard.com/";

        driver.get(url);
        driver.manage().window().maximize();

        String userName = "yollstudent@email.com";
        String password = "Pa$$vv0rd";

        WebElement signInButton = driver.findElement(By.xpath("//li[@class = 'authorization-link']/a"));
        signInButton.click();
        Thread.sleep(3000);

        WebElement loginInputField = driver.findElement(By.xpath("//input[@id = 'email']"));
        loginInputField.sendKeys(userName);

        WebElement passwordField = driver.findElement(By.xpath("//input[@name = 'login[password]']"));
        passwordField.sendKeys(password);

        WebElement buttonSignIn = driver.findElement(By.xpath("//button[@id = 'send2' and @class = 'action login primary']"));
        buttonSignIn.click();
        Thread.sleep(2000);

        System.out.println(driver.getTitle());
        Thread.sleep(2000);

        WebElement welcomeMessage = driver.findElement(By.xpath("(//span[contains(text(), 'Welcome')])[1]"));
        System.out.println(welcomeMessage.getText());

        driver.quit();


    }

}
