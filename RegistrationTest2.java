package FinalWork2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class RegistrationTest2 extends Data{

         private By inputUsername = By.xpath("//*[@id=\"login\"]/div[1]");
         private By inputPassword = By.xpath("//*[@id=\"login\"]/div[2]/label/input]");
         private By btnLogin = By.xpath("//*[@id=\"login\"]/div[3]/button/div");


    @Test
        public void registration() {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            options.addArguments("start-maximized");

            WebDriver driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait (5, TimeUnit.SECONDS);
            driver.get("https://test-stand.gb.ru/login");


            Data  getData = new Data();

            driver.get(getData.getUrl);

            driver.findElement(inputUsername).sendKeys(getData.username);

            driver.findElement(inputPassword).sendKeys(getData.password);


            driver.findElement(btnLogin).click();


            // driver.quit();
        }
    }

