package modue3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DemoQAPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        Thread.sleep(1000);

        WebElement firstNameInputBox = driver.findElement(By.cssSelector("[placeholder = 'First Name']"));
        firstNameInputBox.sendKeys("Omar");

        firstNameInputBox.sendKeys(Keys.chord(Keys.TAB, "Ramo",
                Keys.TAB, "111 Mason Street, Austin City",
                Keys.TAB, "omarramo@mail.com",
                Keys.TAB, "123-234-6789" ));
        Thread.sleep(1000);

//        WebElement maleRarioButton = driver.findElement(By.cssSelector("[value= 'Male']"));
//        Thread.sleep(2000);
//
//        WebElement femaleRadioButton = driver.findElement(By.cssSelector("[value= 'FeMale']"));
//        maleRarioButton.click();
//        Thread.sleep(2000);
//
//        femaleRadioButton.click();
//        Thread.sleep(2000);

        selectRadioButtonByValue(driver, "Male");
        Thread.sleep(3000);

        selectRadioButtonByValue(driver, "Female");
        Thread.sleep(3000);

//        WebElement moviesCheckBox = driver.findElement(By.cssSelector("input[value = Movies]"));
//        moviesCheckBox.click();
//        Thread.sleep(2000);
//
//        moviesCheckBox.click();
//        Thread.sleep(2000);
selectRadioButtonByValue(driver, "Hockey");
Thread.sleep(2000);

        driver.quit();
    }
    public static void selectRadioButtonByValue (WebDriver driver, String type){
        List<WebElement> genderRadioButtons = driver.findElements(By.cssSelector("input[type=radio]"));

        switch (type.toLowerCase()) {
            case "male":
            genderRadioButtons.get(0).click();
            break;
            case "female":
                genderRadioButtons.get(1).click();
                break;
            default:
                System.out.println("There is not radio button with the requested value: " + type);
        }
    }
//public static void clickCheckBoxByValue(WebDriver driver, String type){
//        List<WebElement> hobbiesOption = driver.findElements(By.cssSelector("[type = checkbox]"));
//        for(WebElement option: hobbiesOption){
//        String actualValue = option.getAttribute("value");
//        if(actualValue.equalsIgnoreCase(type)){
//            option.click();
//            break;
//        }
//        }
//}
public static void clickCheckBoxByValue(WebDriver driver, String type){
        WebElement option = driver.findElement(By.cssSelector("[type = checkbox]"));
        switch (type.toLowerCase()){
        }
}


}
