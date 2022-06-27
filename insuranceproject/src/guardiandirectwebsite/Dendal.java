package guardiandirectwebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Dendal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\drives\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.guardiandirect.com/");
    driver.findElement(By.xpath("//button[text()='Dental']")).click();    // basic xpath
   // Thread.sleep(2000);
	//driver.findElement(By.xpath("(//button[@type='button'])[23]")).click();
   	Thread.sleep(2000);
   	//driver.findElement(By.xpath("(//button[@type='button'])[18]")).click();
    driver.findElement(By.id("firstName")).sendKeys("RP");                     //basic locator
    driver.findElement(By.xpath("(//button[@type='button'])[18]")).click();
    driver.findElement(By.xpath("(//li[@role='option'])[3]")).click();
    driver.findElement(By.id("email")).sendKeys("rp@mailinator.com");
    driver.findElement(By.xpath("//input[contains(@placeholder,'Zip')]")).sendKeys("93614");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    //driver.findElement(By.xpath("(//button[@role='button'])[18]")).click();
    WebDriverWait wait=new WebDriverWait(driver,50);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@role='button'])[8]")));
	driver.findElement(By.xpath("(//button[@id='all-plans-comparison-enroll-now'])[3]")).click();
	@SuppressWarnings("unused")
	WebDriverWait wait1=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='lastName']")));
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("LK");
	driver.findElement(By.id("dateOfBirth")).sendKeys("20/8/1978");
	driver.findElement(By.id("address.addressLine1")).sendKeys("610 N 3rd St,Chowchilla,California(CA),93610");
	driver.findElement(By.xpath("//input[@id='address.address2']")).sendKeys("31101 Hogans Mountain Rd,Coarsegold, California(CA)");
	driver.findElement(By.name("address.city")).sendKeys("california");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	@SuppressWarnings("unused")
	WebDriverWait wait2=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class,'box')]")));
	driver.findElement(By.xpath("//button[contains(@class,'box')]")).click();
	driver.findElement(By.xpath("(//li[starts-with(@class,'item')])[2]")).click();
	driver.findElement(By.xpath("//input[contains(@id,'routingNumber')]")).sendKeys("074637580");
	driver.findElement(By.id("bankInformation.accountNumber")).sendKeys("42341234568");
	driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
	driver.findElement(By.xpath("(//li[@role='option'])[2]")).click();
	driver.findElement(By.xpath("(//p[@class='informational'])[7]")).click();
	driver.manage().window().maximize();
	//driver.close();
	}

}
