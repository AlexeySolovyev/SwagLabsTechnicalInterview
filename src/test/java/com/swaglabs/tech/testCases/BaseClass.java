package com.swaglabs.tech.testCases;

import com.swaglabs.tech.utils.ReadConfig;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    ReadConfig readConfig = new ReadConfig();
    public String baseURL = readConfig.getURL();
    public String standardUser = readConfig.getStandardUser();
    public String lockedUser = readConfig.getLockedUser();
    public String problemUser = readConfig.getProblemUser();
    public String performanceGlitchUser = readConfig.getPerformanceUser();
    public String password = readConfig.getPassword();
    public String firstUserName = readConfig.getFirstUserName();
    public String lastUserName = readConfig.getLastUserName();
    public String zipCode = readConfig.getZipCode();
    public static WebDriver driver;
    public static Logger logger;

    @Parameters("browser")
    @BeforeClass
    public void setup(String  browser) {
        logger = Logger.getLogger("SwagLabs");
        PropertyConfigurator.configure("log4j.properties");

        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
            driver = new ChromeDriver();
        }  else if (browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", readConfig.getFirefoxPath());
            driver = new FirefoxDriver();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public void captureScreen(WebDriver driver, String testName) throws Exception {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir") + "/screenshots/" + testName + ".png");
        FileUtils.copyFile(source, target);
        System.out.println("Screenshot has been taken");
    }
}
