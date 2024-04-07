package modue3;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class practiceWebTables {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.expandtesting.com/tables");

        System.out.println("Page Title: " + driver.getTitle());

        printEmailByFullName(driver, "John", "Smith");
        double actualTotal = getTotalAmountOfDueColumn(driver);
        double expectedTotal = 251.0;
        if(actualTotal == expectedTotal){
            System.out.println("TEST: PASSED");
        } else{
            System.out.println("TEST: FAILED");
        }


        driver.quit();
    }
    public static void printEmailByFullName(WebDriver driver, String fName, String lName){
try{
    WebElement email = driver.findElement(By.xpath("//table[@id = 'table1']//tr[td[text() = '" + lName + "'] and td[text() = '" + fName + "']]/td[3]"));
    System.out.println(email.getText());
}
catch(NoSuchElementException e) {
    System.out.println("No such record found in table.");
}

    }

    public static double getTotalAmountOfDueColumn(WebDriver driver){
        List<WebElement> dueColomn = driver.findElements(By.xpath("//table[@id = 'table1']//tbody/tr/td[4]"));
        double dueTotal = 0;
        for(WebElement value: dueColomn) {
            String text = value.getText().substring(1);

            try{
        double number = Double.parseDouble(text);
        dueTotal += number;
        }
            catch (NumberFormatException e) {
                System.out.println("Unable to parse:" + text);

        }}

        return dueTotal;

    }
}
