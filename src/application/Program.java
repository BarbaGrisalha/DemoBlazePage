package application;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();

        //acedendo ao site .Screenshot para análise visual
        File src01 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src01, new File("/Users/altamir/Documents/scr01.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Emtrando com o utilizador e a password.
        WebElement logi = driver.findElement(By.xpath("//*[@id='login2']"));
        logi.click();
        WebElement userName = driver.findElement(By.xpath("//*[@id='loginusername']"));

        WebElement passWord = driver.findElement(By.xpath("//*[@id='loginpassword']"));

        userName.sendKeys("admin");
        passWord.sendKeys("admin");

        //Inserindo Login e Pass . Screenshot para análise visual
        File src02 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src02, new File("/Users/altamir/Documents/scr02.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Acedendo a página após clicar no ok do Login

        WebElement loginOK = driver.findElement(By.xpath("//*[@id='logInModal']//div[3]/button[2]"));
        loginOK.click();





        /*File src03 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src03, new File("/Users/altamir/Documents/scr03.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


        // driver.close();
    }
}
