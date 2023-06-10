package Class27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;
import utils.Constants;
import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class E6ExcelSelenium {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.cssSelector("#txtUsername"));
        String userName= ConfigReader.getProperty("userName");
        username.sendKeys(userName);
        WebElement passwordField = driver.findElement(By.cssSelector("#txtPassword"));
        String password=ConfigReader.getProperty("password");
        passwordField.sendKeys(password);
        WebElement login = driver.findElement(By.cssSelector(".button"));
        login.click();


        List<Map<String,String>> excel= ExcelReader.read("Sheet1", Constants.EXCEL_FILE_PATH);
        for (Map<String,String> map:excel){
            Thread.sleep(1000);
            driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
            driver.findElement(By.xpath("  //a[@id='menu_pim_addEmployee']")).click();
            String firstname=map.get("FirstName");
            String middleName=map.get("MiddleName");
            String lastName=map.get("LastName");
            driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstname);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(middleName);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastName);
            Thread.sleep(1000);
            driver.findElement(By.xpath(" //input[@id='btnSave']")).click();

        }
    }
}