package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsLes2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/newtours/");

        WebElement userName = driver.findElement(By.name("userName"));
        WebElement userPassword = driver.findElement(By.name("password"));

        userName.sendKeys("test@email.com");
        userPassword.sendKeys("test");

        WebElement submitButton = driver.findElement(By.name("submit"));
        submitButton.click();

        WebElement linkVacations = driver.findElement(By.partialLinkText("Vacations"));
        linkVacations.click();
        Thread.sleep(10000);


        WebElement linkRegester = driver.findElement(By.linkText("REGISTER"));
        linkRegester.click();
        Thread.sleep(10000);

        String expectedPostFix = "/register.php";
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.endsWith(expectedPostFix)) {
            System.out.println("Registretion test: PASSED");
        } else {
            System.out.println("Registretion test: FAILED");
        }

        driver.quit();











    }
}
