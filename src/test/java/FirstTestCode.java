import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestCode {
    @Test
    public void openWebsite(){
        WebDriver driver = new ChromeDriver();
        System.out.println("driver sürücüsü :Chrome da browser olusturma");
        driver.manage().window().maximize();
        System.out.println("Browser ekran boyutu ayarlama");
        driver.navigate().to("https://www.w3schools.com/");
        System.out.println(" Bir Web sitesine giriş yapma");
//driver.get("https://www.w3schools.com/");
        driver.close();
        System.out.println("Browser kapatma");
    }
}
