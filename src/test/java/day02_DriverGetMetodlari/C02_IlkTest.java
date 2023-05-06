package day02_DriverGetMetodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkTest {
    public static void main(String[] args) throws InterruptedException {

        //     1. Yeni bir package olusturalim : day01
        //     2. Yeni bir class olusturalim : C03_GetMethods
         System.setProperty("Webdriver.chrome.driver","src/drivers/chromedriver_win32");

        WebDriver driver=new ChromeDriver(); // Once gerekli ayarlari yapip driver objesi olusturmaliyiz



        //     3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        System.out.println("Sayfa basligi : " + driver.getTitle());

        //     4. Sayfa basligini(title) yazdirin
        System.out.println("Sayfa Basligi : "+ driver.getTitle());


        //     5. Sayfa basliginin “Amazon” icerdigini test edin
        String expectedIcerik= "Amazon"; // bize teste soylenen degerlerdir
        String actualTitle= driver.getTitle(); // actual demek gerceklesen gittigimiz degerlerdir

        if (actualTitle.contains(expectedIcerik)) {
            System.out.println("Title Amazon kelimesini iceriyor ,Test PASSED");
            // Title Amazon kelimesini iceriyor ,Test PASSED
        }else {
            System.out.println("Title Amazon kelimesini icermiyor ,Test FAILED");
        }

        //     6. Sayfa adresini(url) yazdirin
        System.out.println("Sayfanin URL : "+ driver.getCurrentUrl());


        //     7. Sayfa url’inin “amazon” icerdigini test edin.
        expectedIcerik= "Amazon";
        String actualUrl= driver.getCurrentUrl();

        if (actualUrl.contains(expectedIcerik)){
            System.out.println("URL Amazon kelimesini iceriyor ,Test PASSED");

        }else {
            System.out.println("URL Amazon kelimesini icermiyor ,Test FAILED");
            // URL Amazon kelimesini icermiyor ,Test FAILED
        }



        //     8. Sayfa handle degerini yazdirin
        System.out.println("Sayfanin handle dege : " + driver.getWindowHandle());
        //Sayfanin handle dege : 3D3ADDCD463850E9662DFAB25C347823
        // her yenilendiginde bu numara degisir

        //     9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin

        expectedIcerik="alisveris";
        String actualPagesource=driver.getPageSource();

        if (actualPagesource.contains(expectedIcerik)){
            System.out.println("Sayfa kaynak kodlari alisveri iceriyor, Test PASSED");
        }else {
            System.out.println("Sayfa kaynak kodlari alisveri icermiyor, Test FAILED");
            // Sayfa kaynak kodlari alisveri icermiyor, Test FAILED
        }


//     10. Sayfayi kapatin.
        Thread.sleep(3000);
        driver.close();
    }
}
