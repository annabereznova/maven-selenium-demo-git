package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyElementAttributes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bestbuy.com/");

        WebElement searchBar = driver.findElement(By.id("gh-search-input"));

        String expectedPlaceholderValue = "What can we help you find today?";
        String actualValue = searchBar.getAttribute("placeholder");

        if(expectedPlaceholderValue.equals(actualValue)) {
            System.out.println("TEST PASSED");
        } else {
            System.err.println("TEST FAILED");
        }

        System.out.println("Value attribute BEFORE typing:" + searchBar.getAttribute("value"));
searchBar.sendKeys("iPhone 15 Pro Max");
        Thread.sleep(1000);
        System.out.println("Value attribute AFTER typing:" + searchBar.getAttribute("value"));
// boolean attribute will return true is axists but if doesn't exist will return NULL
        System.out.println("Get the value of a boolean attribute: " + searchBar.getAttribute("disabled"));

        WebElement searchButton = driver.findElement(By.cssSelector(".header-search-button"));
        searchButton.click();

        WebElement seeDetailsButton = driver.findElement(By.xpath("(//li[@class = 'sku-item'])[1]//a[text() = 'See Details']"));
        String expectedButtonColor = "rgba(0, 70, 190, 1)";

        String actualButtonColor = seeDetailsButton.getCssValue("background-color");


        System.out.println("Expected " + expectedButtonColor);
        System.out.println("Actual " + actualButtonColor);

        if(expectedButtonColor.equals(actualButtonColor)) {
            System.out.println("TESST PASSED");
        } else {
            System.err.println("TEST FAILED");
        }

        System.out.println("Font Family " + seeDetailsButton.getCssValue("font-family"));
        System.out.println("Font Color " + seeDetailsButton.getCssValue("color"));
        System.out.println("Font Size " + seeDetailsButton.getCssValue("font-size"));

        driver.quit();
    }
}
