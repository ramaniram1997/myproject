package guardiandirectwebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Accident {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\drives\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.guardiandirect.com/");
	    driver.findElement(By.id("all-home-launch-survey-Accident")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("RPLK");
	    driver.findElement(By.xpath("//button[@aria-label='Age range']")).click();
	    driver.findElement(By.xpath("//li[@aria-label='18-64']")).click();
	    driver.findElement(By.xpath("//input[contains(@placeholder,'site')]")).sendKeys("rp@site.com");
	    driver.findElement(By.xpath("//input[@id='address.zipCode']")).sendKeys("93610");
	    driver.findElement(By.xpath("(//button[starts-with(@id,'all-survey')])[1]")).click();
	    driver.findElement(By.xpath(" //input[@id='spouse.firstName']")).sendKeys("NA");
	    driver.findElement(By.xpath("(//button[@type='button'and@aria-haspopup='listbox'])[2]")).click();
		driver.findElement(By.xpath("//li[text()='65 - 80']")).click();
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@id='address.addressLine1']")).sendKeys("610 N 3rd St,Chowchilla,California(CA)");
	    driver.findElement(By.xpath("//input[@id='address.addressLine2']")).sendKeys("31101 Hogans Mountain Rd,Coarsegold, California(CA)");
	    driver.findElement(By.id("address.city")).sendKeys("california");
	    driver.findElement(By.xpath("//input[@id='address.zipCode'and@name='address.zipCode']")).sendKeys("93610");
	    driver.findElement(By.xpath("(//button[@role='button'])[16]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("accident-survey-skip")).click();
	    }
	
	
	}


