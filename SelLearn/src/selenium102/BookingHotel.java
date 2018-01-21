package selenium102;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingHotel {
       final static String myurl = "http://www.phptravels.net";
	
       public static void main(String[] args) throws InterruptedException {
		
    	   WebDriver driver = new ChromeDriver();
    	   driver.manage().window().maximize();
//    	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	   driver.get(myurl);
    	   
    	   WebElement location = driver.findElement(By.id("citiesInput"));
    	   location.sendKeys("new york");
    	   Thread.sleep(2000);
    	 
    	   driver.findElement(By.xpath(".//*[@id='eac-container-citiesInput']/ul/li[1]/div")).click();
    	   Thread.sleep(2000);
    	  
    	   driver.findElement(By.xpath(".//*[@id='child']")).click();
    	   Thread.sleep(2000);
    	   
    	   driver.findElement(By.xpath(".//*[@id='child']/option[3]")).click();
    	   Thread.sleep(2000);
    	
    	   driver.findElement(By.xpath(".//*[@id='ages']/div/div/div[5]/button")).click();
    	   Thread.sleep(2000);
    	   
    	   driver.findElement(By.xpath(".//*[@id='EXPEDIA']/form/div[2]/div[4]/button")).click();
    	   Thread.sleep(2000);
    	   String ptitle = driver.getTitle();
    	   System.out.println(ptitle);




    	   
    	   
	}

}
