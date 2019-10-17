package com.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.os.Kernel32;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2019/10/13.
 */
public class demo1 {
    public static WebDriver dr = null;

    @BeforeTest
    public void BeforeTest(){
        System.out.print("BeforeTest\n");
        String path  = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",path+"\\driver\\chromedriver.exe");
        dr = new ChromeDriver();
        dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void test() throws AWTException, InterruptedException {
        System.out.print("这是demo1\n");
        dr.get("http://www.baidu.com");
        //new WebDriverWait(dr,10).until(ExpectedConditions.presenceOfElementLocated(dr.findElement(By.id("kw"))));
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_S);
        Thread.sleep(3);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_ENTER);
    }
}
