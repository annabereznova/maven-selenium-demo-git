package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CssPractice1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        String url = "https://www.ohchr.org/en/ohchr_homepage";

        driver.get(url);
        driver.manage().window().maximize();

        WebElement donateBtn = driver.findElement(By.cssSelector(".btn.btn--small.btn--bg-blue.btn-donate"));

        WebElement navBar = driver.findElement(By.cssSelector("#block-mainnavigationohchr"));

        List<WebElement> navBarElements = driver.findElements(By.cssSelector(".ml-menu.ml-menu--level-0.ml-menu--oh-main-nav"));
        for(WebElement element: navBarElements) {
        System.out.println(element.getText());}


        driver.quit();
    }
}
