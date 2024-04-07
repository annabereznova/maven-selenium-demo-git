package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String url = "https://magento.softwaretestingboard.com/";
        driver.get(url);

        String userName = "testautoman@email.com";
        String password = "qwerty123!";


        WebElement signInButtonLink = driver.findElement(By.xpath("(//body//li[@class = 'authorization-link']/a)[1]"));
        signInButtonLink.click();
        WebElement loginInput = driver.findElement(By.xpath("//input[@id = 'email']"));
       loginInput.sendKeys(userName);
        WebElement passwordInput = driver.findElement(By.xpath("//input[@id = 'pass']"));
        WebElement signInButtonConfirm = driver.findElement(By.xpath("//div[@class = 'primary']/button[@id = 'send2' and @class = 'action login primary']"));
        passwordInput.sendKeys(password);
        signInButtonConfirm.click();


        System.out.println(driver.getTitle());


        WebElement welcomeMessage = driver.findElement(By.xpath("//div[@class = 'panel header']//span[starts-with(text(), 'Welcome, ')]"));

        System.out.println(welcomeMessage.getText());

driver.quit();






    }
}
