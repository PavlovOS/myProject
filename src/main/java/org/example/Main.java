package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\TEMP\\Project\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

        driver.get("https://www.avito.ru/moskva/hobbi_i_otdyh");

        //WebElement textarea = (new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@title='Search']"))));
        WebElement option1 = driver.findElement(By.xpath("//option[@value='101']"));
        WebElement option2 = driver.findElement(By.xpath("//option[@value='1']"));
        String selected1 = option1.getAttribute("selected");
        String text1 = option1.getText();
        String selected2 = option2.getAttribute("selected");
        String text2 = option2.getText();
        System.out.println(text1 + " selected = " + selected1);
        System.out.println(text2 + " selected = " + selected2);

        driver.quit();
    }
}