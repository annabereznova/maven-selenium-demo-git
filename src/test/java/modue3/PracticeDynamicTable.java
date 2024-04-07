package modue3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PracticeDynamicTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.expandtesting.com/dynamic-table");

        String pageName = driver.getTitle();
        System.out.println("Page Tittle: " + pageName);

        List<WebElement> headerList = driver.findElements(By.xpath("//table[@class = 'table table-striped']//th[text() = 'Name']/.."));
        for(WebElement header: headerList) {
            System.out.println(header.getText());
            System.out.println(headerList.indexOf("CPU"));


        }






//        WebElement actualChromeCPU = driver.findElement(By.xpath("//table[@class = 'table table-striped']/tbody/tr/td[text() = 'Chrome']/ancestor::table//thead/tr/th[text() = 'CPU']"));
//
//        WebElement expectedChromeCPU = driver.findElement(By.id("chrome-cpu"));
//
//        if(expectedChromeCPU.equals(actualChromeCPU)){
//            System.out.println("TEST: PASSSED");
//        } else{
//            System.err.println("TEST: FAILED");
//        }


        driver.quit();



    }
}
