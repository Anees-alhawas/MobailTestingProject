import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MyTestCases {
	DesiredCapabilities caps = new DesiredCapabilities();
	
	String AppiumUrl="http://127.0.0.1:4723/wd/hub";
	
	AndroidDriver driver;


	
	@BeforeTest
	public void setup() {

		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");

		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"hawaii");

		File Myapplications=new File("src/MyApplication/calculator.apk");
		
		caps.setCapability(MobileCapabilityType.APP,Myapplications.getAbsolutePath());

	}

	@Test()
	public void myFirstTest() throws MalformedURLException {

	driver=new AndroidDriver(new URL(AppiumUrl),caps);
	
	
	}

}
