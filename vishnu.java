package anu;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class vishnu {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\java.SOFTLOGICSYS.001\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		WebElement name=driver.findElement(By.id("txtUsername"));
		name.sendKeys("admin");
		WebElement passwd=driver.findElement(By.id("txtPassword"));
		passwd.sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		WebElement login=driver.findElement(By.id("firstName"));
		login.sendKeys("vishnu");
		WebElement login1=driver.findElement(By.id("lastName"));
		login1.sendKeys("varthan");
		WebElement id=driver.findElement(By.id("employeeId"));
		id.sendKeys("0047");
		WebElement photo=driver.findElement(By.id("photofile"));
		photo.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg");
		driver.findElement(By.id("chkLogin")).click();
		WebElement user=driver.findElement(By.id("user_name"));
		user.sendKeys("thalavishnu");
		WebElement password=driver.findElement(By.id("user_password"));
		password.sendKeys("vishnu123");
		WebElement repass=driver.findElement(By.id("re_password"));
		repass.sendKeys("vishnu123");
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(6000);
		File Snapshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(Snapshot11,new File("C:\\proj\\hi.png"));
				System.out.println("screenshot taken");
				Thread.sleep(3000);
				
driver.close();
	}

}
