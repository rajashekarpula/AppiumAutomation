package appium;
 
import io.appium.java_client.android.AndroidDriver;
 
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
 
public class AppiumDriverBase {
 
    protected AndroidDriver driver;
    //protected WebDriverWait wait;
 
    //before Test Annotation makes a java function to run every time before a TestNG test case
    @BeforeTest
    protected void createAppiumDriver() throws MalformedURLException, InterruptedException {
 
    //relative path to apk file
    /*final File classpathRoot = new File(System.getProperty("user.dir"));
    final File appDir = new File(classpathRoot, "src/test/resources/apps/");
    final File app = new File(appDir, "ApiDemos-debug.apk");*/
 
    //setting up desired capability
    DesiredCapabilities caps = new DesiredCapabilities();
    /*caps.setCapability("browserName", "");
    caps.setCapability("platform", "ANDROID");
    caps.setCapability("platformVersion", "4.2.2");
    caps.setCapability("deviceName", "ZH8000TNHK");
    caps.setCapability("appPackage", "org.openintents.shopping");
    caps.setCapability("appActivity", "org.openintents.shopping.ShoppingActivity");*/
    caps.setCapability("testobject_api_key", "B16F0B0AEB334DD384FAE69CCFC7C371");
    caps.setCapability("testobject_app_id", "1");
    caps.setCapability("testobject_device", "LG_Nexus_4_E960_real");
    caps.setCapability("testobject_appium_version", "1.5.3");
    caps.setCapability("testobject_suite_name", "Default Appium Suite");
    caps.setCapability("testobject_test_name", "Default Appium Test");
 
    //initializing driver object
    //driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    driver = new AndroidDriver(new URL("http://appium.testobject.com/wd/hub"), caps);
 
    //initializing explicit wait object
   // wait = new WebDriverWait(driver, 10);
    }
 
    //After Test Annotation makes a java function to run every time after a TestNG test case
    @AfterTest
    public void afterTest(){
 
    //quit the driver
    driver.quit();
    }
 
}
