import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserTest {
    public static void main(String[] args) {
        String url = "https://demo.nopcommerce.com/login?returnUrl=%2F";

        //Set FireFox driver path
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");

        //Start FireFox browser
        WebDriver driver = new FirefoxDriver();

        //Open url
        driver.get(url);

        //Get Title of loaded page
        System.out.println("Page Title is:  " + driver.getTitle());

        //Get Current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        //Get web element or page source
        System.out.println("Page Source is: " + driver.getPageSource());

        //Find and Enter email Element Field element field element
        WebElement emailField = driver.findElement(By.id("Email"));
        //Type email to email field
        emailField.sendKeys("abc5658@gamil.com");

        //Find the password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("abc748565");

        //driver.quit();







    }
}
