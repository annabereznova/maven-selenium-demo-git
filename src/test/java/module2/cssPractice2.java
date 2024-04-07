package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssPractice2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String url = "http://dev-hrm.yoll.io/index.php/auth/login";
        driver.get(url);
        driver.manage().window().maximize();

        String userName = "yoll-student";
        String password = "Bootcamp5#";

        WebElement userNameInput = driver.findElement(By.cssSelector("#txtUsername[name = txtUsername]"));
        WebElement passwordInput = driver.findElement(By.cssSelector("#divPassword>input"));
        WebElement buttonSubmit = driver.findElement(By.cssSelector(".button[name = Submit]"));
        userNameInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        buttonSubmit.click();
        Thread.sleep(3000);
String currentTitle = driver.getTitle();
        System.out.println(currentTitle);

        WebElement pageNameHeader = driver.findElement(By.cssSelector(".head>h1"));
        String actualHeader = pageNameHeader.getText();
        String expectedHeader = "Dashboard";
        if(actualHeader.equals(expectedHeader)){
            System.out.println("Test PASSED");
        } else {
            System.err.println("Test FAILED");
        }


driver.quit();


    }
}
