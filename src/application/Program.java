package application;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Program {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //Criação das variáveis utilizadas neste cenário.
        String url = "https://www.demoblaze.com/";

        driver.get(url);
        driver.manage().window().maximize();
        String user = "admin";
        String pass = "admin";
        String celular = "Iphone 6 32gb";
        String pathMonitor = "//*[@id='next2']";
        String monitor = "ASUS Full HD";
        String name = "Altamir Rodrigues";
        String country = "Portugal";
        String city = "Leiria";
        String creditCard = "1234567891";
        String month = "09";
        String year = "23";


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

        //Agardar renderização para entrar no alert

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


        WebElement atributoMonitor = driver.findElement(By.xpath(pathMonitor));
        atributoMonitor.click();


        //Aguardando renderização para clicar
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(4));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement chooseMonitor = driver.findElement(By.xpath("//a[text()='" + monitor + "']"));
        chooseMonitor.click();

        //Aguardando renderização para clicar
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(4));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        addToCart = driver.findElement(By.className("btn-success"));
        addToCart.click();

        //Aguardando renderização para clicar
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(4));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        alert = driver.switchTo().alert();

        System.out.println("Alert Text by Monitor: " + alertText);

        alert.accept();
        //Acesso ao Carrinho de compras
        WebElement gotoCart = driver.findElement(By.xpath(" //*[@id='cartur']"));
        gotoCart.click();

        //Acesso ao local para inserir dados do cliente
        WebElement placeOrder = driver.findElement(By.xpath("//*[@id='page-wrapper']//div[2]/button"));
        placeOrder.click();


        WebElement nameOrder = driver.findElement(By.xpath("//*[@id='name']"));
        nameOrder.sendKeys(name);
        WebElement countryOrder = driver.findElement(By.xpath("//*[@id='country']"));
        countryOrder.sendKeys(country);
        WebElement cityOrder = driver.findElement(By.xpath("//*[@id='city']"));
        cityOrder.sendKeys(city);
        WebElement creditCardOrder = driver.findElement(By.xpath("//*[@id='card']"));
        creditCardOrder.sendKeys(creditCard);
        WebElement monthOrder = driver.findElement(By.xpath("//*[@id='month']"));
        monthOrder.sendKeys(month);
        WebElement yearOrder = driver.findElement(By.xpath("//*[@id='year']"));
        yearOrder.sendKeys(year);

        WebElement buttonPurchase = driver.findElement(By.xpath("//*[@id='orderModal']//div[3]/button[2]"));


        buttonPurchase.click();

        //Aguardando renderizar
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(4));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement btnOk = driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"));
        btnOk.click();
        driver.close();
        driver.quit();


    }


}
