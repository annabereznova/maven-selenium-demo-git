package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DemoWebShopPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        String url = "https://demowebshop.tricentis.com/";
        driver.get(url);

        List<WebElement> topNavOptions = driver.findElements(By.xpath("//ul[@class = 'top-menu']/li"));
        System.out.println("Number of options in top navigation section " + topNavOptions.size());

        driver.quit();


    }
}
