package day05_relative;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_zeroWebapp {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // 1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");

        // 2. Signin buttonuna tiklayin
         driver.findElement(By.id("signin_button")).click();

        // 3. Login alanine  “username” yazdirin
        WebElement loginKutusu= driver.findElement(By.id("user_login"));
        loginKutusu.sendKeys("username");

        // 4. Password alanina “password” yazdirin
        WebElement passwordKutusu= driver.findElement(By.id("user_password"));
        passwordKutusu.sendKeys("password");
        // 5. Sign in buttonuna tiklayin
        driver.findElement(By.name("submit")).click();

        // 6. Back tusu ile sayfaya donun
        driver.navigate().back();
        // 7. Online Banking menusunden Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
        driver.findElement(By.id("pay_bills_link")).click();

        // 8. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        WebElement amaountKtusu=driver.findElement(By.id("sp_amount"));
        amaountKtusu.sendKeys("200");

        // 9. tarih kismina “2020-09-10” yazdirin
        WebElement dateKutusu=driver.findElement(By.id("sp_date"));
        dateKutusu.sendKeys("2020-09-10");

        // 10. Pay buttonuna tiklayin

        driver.findElement(By.id("pay_saved_payees")).click();
        // 11. “The payment was successfully submitted.” mesajinin ciktigini test edin
        WebElement submittedYazi= driver.findElement(By.id("alert_content"));

        if (submittedYazi.isDisplayed()){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        Thread.sleep(3000);
        driver.close();
    }
}
