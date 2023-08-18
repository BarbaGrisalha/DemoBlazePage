package application;


import jdk.jfr.Timespan;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Program {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String url = "https://www.demoblaze.com/";

        driver.get(url);
        driver.manage().window().maximize();

        //@Screenshot acedendo ao site
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

        //@Screenshot Login e Pass
        File src02 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src02, new File("/Users/altamir/Documents/scr02.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Acedendo a página após clicar no ok do Login

        WebElement loginOK = driver.findElement(By.xpath("//*[@id='logInModal']//div[3]/button[2]"));
        loginOK.click();


        //Criando variável com nome do produto celular
        String celular = "Iphone 6 32gb";

        //Aguardando renderização para clicar
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(4));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement telemovel = driver.findElement(By.xpath("//a[text()='" + celular + "']"));
        telemovel.click();
         /*
        ######################## ATÉ AQUI FUNCIONA BEM ########################
         */
        //*[@id='tbodyid']/div[2]/div/a

        WebElement chooseTelemovel = driver.findElement(By.xpath("//*[@id='tbodyid']/div[2]/div/a"));
        chooseTelemovel.click();


        //@Screenshot selecção produto.
        File src03 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src03, new File("/Users/altamir/Documents/scr03.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        driver.close();
    }
}
