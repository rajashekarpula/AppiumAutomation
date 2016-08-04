package appium;
 
import io.appium.java_client.MobileBy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

 
public class SampleTestCase extends AppiumDriverBase{
     
    //Test Annotation changes any java function to TestNG test case
    @Test
    public void sampeTest(){
    	
    	driver.findElement(By.className("android.widget.EditText")).sendKeys("Hello");
     
    //click on Accessibility link
    /*driver.findElement(By.className("android.widget.Switch")).click();
    List<WebElement> test = driver.findElements(By.className("android.widget.EditText"));
    test.get(0).sendKeys("Raja Sekhar");
    test.get(1).sendKeys("Ayswarya Narasimhan");
    driver.findElement(By.className("android.widget.Button")).click();*/
    /*String result = driver.findElement(By.className("android.widget.TextView")).getText();
    System.out.println(result);
    //wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Accessibility")));
    driver.findElement(MobileBy.AccessibilityId("Accessibility")).click();
     
    //click on 'Accessibility Node Querying' link
    //wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Accessibility Node Querying")));
    driver.findElement(MobileBy.AccessibilityId("Accessibility Node Querying")).click();
     
    //back
    driver.navigate().back();
     
    //back
    driver.navigate().back();*/
    }
 
}
