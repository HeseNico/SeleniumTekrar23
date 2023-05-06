package day02_DriverGetMetodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverGetMetodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/drivers/chromedriver_win32");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com"); // get istenen url goturur. www yazmasakta calisir

        System.out.println(driver.getTitle()); // title ysoutt ile yazdirilir
        System.out.println(driver.getCurrentUrl()); // buda sout ile


       Thread.sleep(3000);
       driver.close();
    }
}
