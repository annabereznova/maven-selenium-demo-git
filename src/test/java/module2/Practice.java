package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Practice {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.bestbuy.com");

        WebElement searchBar = driver.findElement(By.id("gh-search-input"));
        WebElement searchButton = driver.findElement(By.className("header-search-button"));

        searchBar.sendKeys("iPhone 15");
        Thread.sleep(3000);

        searchButton.click();
        Thread.sleep(3000);

        List<WebElement> products = driver.findElements(By.className("sku-title"));

        System.out.println("Items found: " + products.size());
        int count = 0;

        for(WebElement product : products) {
            String text = product.getText();
            count++;
            System.out.println("Title " + count + ": " + text);



            if(text.contains("iPhone Pro")) {
                System.out.println("Item Relevant");
            } else {
                System.err.println("Item Irrelevant");
            }

        }

        driver.quit();












    }
}
