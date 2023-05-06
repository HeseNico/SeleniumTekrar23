package day01_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class new_ {
    public static void main(String[] args) throws InterruptedException {



        System.setProperty("Webdriver.chrome.driver","src/drivers/chromedriver_win32");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");

        Thread.sleep(3000);
        driver.close();

    }
}
