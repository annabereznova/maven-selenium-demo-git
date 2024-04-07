package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SauceDemoPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        String url = "https://www.saucedemo.com/";
        driver.get(url);

        driver.manage().window().maximize();

        WebElement usernameInput = driver.findElement(By.xpath("//input[@placeholder = 'Username']"));
        WebElement passwordInput = driver.findElement(By.xpath("//input[@placeholder = 'Password']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@value = 'Login']"));

        usernameInput.sendKeys("standard_user");
        Thread.sleep(2000);
        passwordInput.sendKeys("secret_sauce");
        Thread.sleep(2000);
        loginButton.click();
        Thread.sleep(2000);

        String currentUrl = driver.getCurrentUrl();

        System.out.println("URL after loggin: " + currentUrl);

        WebElement buttonAddtoCartBackpack = driver.findElement(By.xpath("//button[@id = 'add-to-cart-sauce-labs-backpack']"));
        buttonAddtoCartBackpack.click();
        Thread.sleep(2000);
        WebElement buttonAddtoCartTshirt = driver.findElement(By.xpath("//button[@id = 'add-to-cart-sauce-labs-bolt-t-shirt']"));
        buttonAddtoCartTshirt.click();
        Thread.sleep(2000);
        WebElement shoppingCart = driver.findElement(By.xpath("//a[@class = 'shopping_cart_link']"));
        shoppingCart.click();
        Thread.sleep(2000);

        List<WebElement> products = driver.findElements(By.xpath("//div[@class = 'cart_item']"));
int expectedItemsInCart = 2;
        if(products.size() == expectedItemsInCart) {
            System.out.println("Test Passed");
        } else {
            System.err.println("Test Failed");
        }


        driver.quit();



    }



}
