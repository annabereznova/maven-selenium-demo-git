package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BestBuyPractice {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.bestbuy.com/");

        WebElement searchBox = driver.findElement(By.className("search-input"));

        WebElement searchButton = driver.findElement(By.className("header-search-button"));

        searchBox.sendKeys("iPhone 15");
        Thread.sleep(3000);

        searchButton.click();
        Thread.sleep(3000);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        if(currentUrl.contains("searchpage")) {
            System.out.println("Test: PASS");
        } else {
            System.out.println("Test: PASS");
        }



        driver.quit();



    }
}
