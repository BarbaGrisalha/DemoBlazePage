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
        String user = "admin";
        String pass = "admin";
        String celular = "Iphone 6 32gb";
        String monitor = "ASUS Full HD";


        //Emtrando com o utilizador e a password.
        WebElement logi = driver.findElement(By.xpath("//*[@id='login2']"));
        logi.click();
        WebElement userName = driver.findElement(By.xpath("//*[@id='loginusername']"));

        WebElement passWord = driver.findElement(By.xpath("//*[@id='loginpassword']"));

        userName.sendKeys(user);
        passWord.sendKeys(pass);



        //Acedendo a página após clicar no ok do Login

        WebElement loginOK = driver.findElement(By.xpath("//*[@id='logInModal']//div[3]/button[2]"));
        loginOK.click();

        //Aguardando renderização para clicar
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(4));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement telemovel = driver.findElement(By.xpath("//a[text()='" + celular + "']"));
        telemovel.click();


        //Aguardando renderização para clicar
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(4));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement addToCart = driver.findElement(By.className("btn-success"));
        addToCart.click();

        //Entra no alert

        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(4));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Alert alert = driver.switchTo().alert();

        String alertText = alert.getText();
        System.out.println("Alert Text by Telemóvel: " + alertText);

        alert.accept();

        WebElement returnMain = driver.findElement(By.xpath(" //*[@id='navbarExample']//li[1]/a"));
        returnMain.click();



        //Aguardando renderização para clicar
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(4));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*
        ######################## ATÉ AQUI FUNCIONA BEM ########################
        */




        }


}
