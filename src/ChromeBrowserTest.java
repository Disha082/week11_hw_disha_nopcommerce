import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String url = "https://demo.nopcommerce.com/login?returnUrl=%2F";

        //set Chrome driver path
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        //Start Chrome browser
        WebDriver driver = new ChromeDriver();

        //Open url
        driver.get(url);

        //Get title of loaded page
        System.out.println("Page Title is: " + driver.getTitle());

        //Get Current URL
        System.out.println("Current URL is:" + driver.getCurrentUrl());

        //Get web elements or page source
        System.out.println("Page Source is: "+ driver.getPageSource());

        //Find and enter email element field element
        WebElement emailField = driver.findElement(By.id("Email"));

        //Type email to email field
        emailField.sendKeys("xyz123@gmil.com");

        //Find the password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("xyz45789");

        driver.quit();




    }


}
