package Amazon_Home;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.zeromq.ZStar.Set;

public class Search_oneplus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thasif Ahamed\\eclipse-workspace\\Amazon.in\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("vu tv" + Keys.ENTER);
        driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color-base')])[3]")).click();
        java.util.Set<String> allwindowid = driver.getWindowHandles();
        Iterator<String> seprateid = allwindowid.iterator();
        String patentid = seprateid.next();
        String childid = seprateid.next();
       
        driver.switchTo().window(childid);
        WebElement Quantity = driver.findElement(By.xpath("//select[@id='quantity']"));
        Select dropdown = new Select(Quantity);
        dropdown.selectByVisibleText("6");
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        
        WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(10));

	    Wait.until(ExpectedConditions.visibilityOfElementLocated (By.xpath("//a[@id='attach-close_sideSheet-link']")));
        driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']")).click();
        driver.switchTo().window(patentid);
        
        WebElement TV = driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_6']//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'VU 164 cm (65 inches) The GloLED Series 4K Smart L')]"));
  
        Thread.sleep(5000);
        
        TV.click();

      
        
      
       
        
      
        
	}

}
