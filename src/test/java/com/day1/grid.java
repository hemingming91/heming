package com.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Administrator on 2019/10/16.
 */
public class grid {
    @DataProvider(name="data")
    public Object[][] data1(){
        return new Object[][]{{"1","11"},
                {"2","22"}};
    }
    @Test(dataProvider = "data")
    public void gridTest(String a,String b) throws MalformedURLException, InterruptedException {
//        DesiredCapabilities dc = DesiredCapabilities.chrome();
//        WebDriver dr = new RemoteWebDriver(new URL("http://192.168.1.72:5558/wd/hub"),dc);
//        Thread.sleep(3);
//        dr.get("https://www.baidu.com/");
//        Thread.sleep(3);
        System.out.println("@@@@@:"+a);
        System.out.println("#####:"+b);
    }
}
