package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAccessibility {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://haltersweb.github.io/Accessibility/submit-disabling.html");

        WebElement submitButton = driver.findElement(By.xpath("//*[text() = 'Submit']"));
        System.out.println("Submit button Disabled: " + submitButton.getAttribute("aria-disabled"));

        System.out.println("Submit text color: " + submitButton.getCssValue("color"));

        WebElement firstNameField = driver.findElement(By.id("firstName"));
        WebElement lastNameField = driver.findElement(By.id("lastName"));
        WebElement exampleForm = driver.findElement(By.xpath("//h2[text() = 'Example Form']"));

        firstNameField.sendKeys("Test");
        Thread.sleep(1000);
        lastNameField.sendKeys("Automan");
        Thread.sleep(1000);

        exampleForm.click();
        Thread.sleep(1000);

        System.out.println("Submit button Disabled: " + submitButton.getAttribute("aria-disabled"));

        System.out.println("Submit text color: " + submitButton.getCssValue("color"));



driver.quit();

    }
}
