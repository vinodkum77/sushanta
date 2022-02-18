package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumfirst {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nandy\\Downloads\\ChromeSetup.exe");
        WebDriver driver=new ChromeDriver();
    }
}
