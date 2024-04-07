package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TablePractic2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement cell2row2 = driver.findElement(By.xpath("//table[@name = 'BookTable']/tbody/tr[3]/td[2]"));
        System.out.println(cell2row2.getText());

        List<WebElement> listAuthors = driver.findElements(By.xpath("//table[@name = 'BookTable']/tbody//td[2]"));

        for (WebElement author : listAuthors) {
            System.out.println(author.getText());
        }

        List<WebElement> listPrices = driver.findElements(By.xpath("//table[@id = 'productTable']/tbody//td[3]"));
        for(WebElement price : listPrices) {
            System.out.println(price.getText());
        }

        driver.quit();
    }
}
