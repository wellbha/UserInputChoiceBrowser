import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserChoiceTest {
    WebDriver driver;
    @Test
    public void browserChoice(){
    if(Main.userChoice==1){
        System.setProperty("webdriver.chrome.driver","src\\BrowserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().fullscreen();
        //test.run1();
        driver.quit();
    }else if(Main.userChoice==2){
        System.setProperty("webdriver.gecko.driver","src\\BrowserDrivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().fullscreen();
        driver.quit();
    }else{
        System.setProperty("webdriver.edge.driver","src\\BrowserDrivers\\MicrosoftWebDriver (1).exe");
        driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.quit();
    }



}

}
