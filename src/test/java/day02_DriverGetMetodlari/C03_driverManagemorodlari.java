package day02_DriverGetMetodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_driverManagemorodlari {
    public static void main(String[] args) throws InterruptedException {
        // calisir ama cok yavas calisir selenium son verisionu ile kendi driveri ekleidi
        // eger bis system driver yolu gostermezsek kendi yolundan gider
        // o yuzden biz System.
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

        System.out.println("Baslangicta konum : "+driver.manage().window().getPosition()); //Baslangicta konum : (9, 9)
        System.out.println("Baslangicta boyut : "+driver.manage().window().getSize()); // Baslangicta boyut : (1051, 798)

        Thread.sleep(2000);
        driver.manage().window().maximize();
        System.out.println("Maximize konum : "+driver.manage().window().getPosition()); //Maximize konum : (-8, -8)
        System.out.println("Maximize boyu : "+driver.manage().window().getSize());// Maximize boyut: (1552, 832)


        Thread.sleep(2000);
        driver.manage().window().fullscreen();
        System.out.println("Fullscreen konum : "+driver.manage().window().getPosition()); // Fullscreen konum : (0, 0)
        System.out.println("Fullscreen boyu : "+driver.manage().window().getSize()); // Fullscreen boyu : (1536, 864)
        Thread.sleep(3000);
        driver.close();
    }
}
