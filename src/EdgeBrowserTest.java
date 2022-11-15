import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

        //Set Edge driver path
        System.setProperty("webdriver.edeg.driver", "drivers/msedgedriver.exe");

        //Start Edge browser
        WebDriver driver = new EdgeDriver();

        //Open url
        driver.get(baseUrl);

        //Get title of loaded page
        System.out.println("Page Title is: " +driver.getTitle());

        //Get Current Url
        System.out.println("Current Url is:" +driver.getCurrentUrl());

        //Find and enter email element field
        WebElement emailFied = driver.findElement(By.id("Email"));

        //Type email to email field
        emailFied.sendKeys("abc2020@gmail.com");

        //Find the password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("abc5678");

        driver.quit();




    }
}
