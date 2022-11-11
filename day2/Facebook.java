package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver =new ChromeDriver();
		Driver.get("https://en-gb.facebook.com/");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Driver.findElement(By.linkText("Create New Account")).click();
		Driver.findElement(By.name("firstname")).sendKeys("hari");
		Driver.findElement(By.name("lastname")).sendKeys("ganesh");
		Driver.findElement(By.name("reg_email__")).sendKeys("7708504769");
		Driver.findElement(By.name("reg_passwd__")).sendKeys("Venkatesh@8");
		WebElement birthdayday = Driver.findElement(By.name("birthday_day")); 
		Select day = new Select(birthdayday); 
		day.selectByValue("25");
		WebElement birthdaymonth = Driver.findElement(By.name("birthday_month")); 
		Select month = new Select(birthdaymonth);
		month.selectByVisibleText("Sep"); 
		WebElement birthdayyear = Driver.findElement(By.name("birthday_year")); 
		Select year = new Select(birthdayyear);
		year.selectByValue("1997"); 
		Driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		Driver.findElement(By.name("websubmit")).click();
	}


	}
	


		
	


