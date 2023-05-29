package SaitaSWAP;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.io.File;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LA {
	
    public String baseUrl = "https://testnet.stage-saitamask.com/";
//    String driverPath = "E:\\Driver\\chromedriver.exe";
     WebDriver driver = new ChromeDriver();
    
  @BeforeMethod
  public void beforeMethod() {
      driver.get(baseUrl);
      driver.manage().window().maximize();
      //Launch App
      driver.findElement(By.cssSelector("button[class='Button_CommonBtn__1J25T Header_IconBtn__3ZMyG ']")).click();  
      
      //Select Network
      driver.findElement(By.cssSelector("button[class='Button_CommonBtn__1J25T undefined ']")).click();
      WebElement network= driver.findElement(By.xpath("//button[text()='Binance']"));
      network.click();
      
      //Select Metamask Account
      driver.findElement(By.cssSelector("button[class='Button_CommonBtn__1J25T Header_IconBtn__3ZMyG ']")).click();
      WebElement metamask= driver.findElement(By.xpath("//button[text()='MetaMask']"));
      metamask.click();
  }

  @Test
  public void Test() {
	  
  }
  
  public void AfterMethod() {
  }
  

}
