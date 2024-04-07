package modue3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bestbuy.com/");

        WebElement searchBar = driver.findElement(By.id("gh-search-input"));
        searchBar.sendKeys("IPhone 16");
        Thread.sleep(1000);

        searchBar.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(1000);

        searchBar.sendKeys("5 Pro Max");
        Thread.sleep(1000);

//        searchBar.sendKeys(Keys.COMMAND + "A");
        searchBar.sendKeys(Keys.chord(Keys.COMMAND, "A"));
        Thread.sleep(1000);




        searchBar.sendKeys(Keys.ENTER);
        Thread.sleep(2000);


        driver.quit();

    }
}
