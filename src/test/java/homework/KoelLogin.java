package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KoelLogin {
    @Test
    public void LoginWithValidCredentials() throws InterruptedException{
        //Arrange
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://koelapp.testpro.io/");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        //Act
        WebElement email_field = driver.findElement(By.xpath("//*[@type='email']"));
        email_field.sendKeys("koeluser21@testpro.io");
        WebElement password_filed = driver.findElement(By.xpath("//*[@type='password']"));
        password_filed.sendKeys("te$t$tudent");
        WebElement login_button = driver.findElement(By.xpath("//*[@type='submit']"));
        login_button.sendKeys(Keys.ENTER);
        //Assertion
        String title = driver.getTitle();
        Assert.assertEquals(title , "Koel");
        driver.quit();
    }
}
