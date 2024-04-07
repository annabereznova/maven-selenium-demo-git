package modue3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropdownPractice {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Register.html");

        Thread.sleep(1000);

        WebElement dropdownSkills = driver.findElement(By.id("Skills"));

        Select dropdown = new Select(dropdownSkills);
        dropdown.selectByIndex(5);
        Thread.sleep(2000);

        dropdown.selectByValue("C++");
        Thread.sleep(2000);

        dropdown.selectByVisibleText("Java");
        Thread.sleep(2000);

        List<WebElement> allOptions = dropdown.getOptions();

        for(WebElement option: allOptions){
        System.out.println(option.getText());}

        driver.quit();



    }
}
