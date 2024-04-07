package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LumaTask {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        String url = "https://magento.softwaretestingboard.com/";
        driver.get(url);

        Thread.sleep(3000);

        WebElement logo = driver.findElement(By.xpath("//a[@class = 'logo']/img"));
        WebElement cartIcon = driver.findElement(By.xpath("//a[@class = 'action showcart']"));
        WebElement searchInputBox = driver.findElement(By.xpath("//input[@id = 'search']"));
        WebElement saleLink = driver.findElement(By.xpath("//a[@id = 'ui-id-8']"));
        WebElement hoodiesAndSweatshirts = driver.findElement(By.xpath("(//ul[@class = 'items'])[2]/li[1]"));
        WebElement jakets = driver.findElement(By.xpath("(//ul[@class = 'items'])[2]/li[2]"));

    }
}
