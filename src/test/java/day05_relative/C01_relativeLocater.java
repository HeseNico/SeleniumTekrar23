package day05_relative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C01_relativeLocater {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("Webdriver.chrome.driver","src/drivers/chromedriver_win32");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        // 2 ) Berlin’i 3 farkli relative locator ile locate edin
        // A- tagi img NYC altinda

        WebElement nyc= driver.findElement(By.id("pid3_thumb"));
        WebElement berlin1= driver.findElement(RelativeLocator.with(By.tagName("img")).below(nyc));

        // Test etmek icin berlin1 webelementinin id attribute nun degerine bakalim - pid7_thump olmali

        if (berlin1.getAttribute("id").equals("pid7_thumb")){
            System.out.println("Berlin1 Locate testi PASSED");
        }else {
            System.out.println("Berlin1 Locate testi FAILED");
        }

        // B- tagi img Bostonun saginda

        WebElement boston= driver.findElement(By.id("pid6_thumb"));
        WebElement berlin2= driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(boston));

        if (berlin2.getAttribute("id").equals("pid6_thumb")){
            System.out.println("Berlin2 Locate testi PASSED");
        }else {
            System.out.println("Berlin2 Locate testi PASSED");
        }

        //C- tagi img Sailor ustunde

        WebElement silor= driver.findElement(By.id("pid11_thumb"));
        WebElement berlin3= driver.findElement(RelativeLocator.with(By.className("ui-li-aside")).above(silor));

       if (berlin3.getAttribute("id").equals("pid11_thumb")){
           System.out.println("Berlin3 Locate testi PASSED");
       }else {
           System.out.println("Berlin3 Locate testi PASSED");
       }


        // 3 ) Relative locator’larin dogru calistigini test edin

        Thread.sleep(3000);
        driver.close();
    }
}
