package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
    WebDriver dr = new ChromeDriver();
    dr.get("https://www.symboinsurance.com");
    dr.manage().window().maximize();
    dr.findElement(By.xpath("//a[@href='/product/travel']")).click();
    dr.findElement(By.xpath("//div[@class='ant-select-selection__placeholder']")).click();
    dr.findElement(By.xpath("//input[@class='ant-select-search__field']")).sendKeys("Indonesia");
    dr.findElement(By.xpath("//li[@class='ant-select-dropdown-menu-item button px3 py2 hover-bg-white-001 rounded border-white ant-select-dropdown-menu-item-active']")).click();
    dr.findElement(By.xpath("//div[@class='clearfix mxn2 mb2']")).click();
    dr.findElement(By.name("tripStartDate")).click();
    dr.findElement(By.xpath("//div[@aria-label='day-10']")).click();
    dr.findElement(By.name("tripEndDate")).click();
    dr.findElement(By.xpath("//div[@aria-label='day-16']")).click();
    dr.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    dr.findElement(By.xpath("//button[@class='ant-btn button button-clickable left-align p0 block col-12 border rounded bg-green white ant-btn-primary']")).click();
//    dr.findElement(By.xpath("//button[@class=' relative button block col-12 left-align p0 overflow-hidden rounded  border-transparent transition-border-colour bg-grey-003']")).click();
    WebElement first_dropdown= dr.findElement(By.xpath("//div[@class='right button-padding bg-green white ']"));
    Select oselect = new Select(first_dropdown);
    oselect.selectByVisibleText("Your age");
	}

}
