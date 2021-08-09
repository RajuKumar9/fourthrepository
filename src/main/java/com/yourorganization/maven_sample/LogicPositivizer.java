package com.yourorganization.maven_sample;

import com.github.javaparser.ast.expr.BinaryExpr;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.visitor.ModifierVisitor;
import com.github.javaparser.ast.visitor.Visitable;
import com.github.javaparser.utils.CodeGenerationUtils;
import com.github.javaparser.utils.Log;
import com.github.javaparser.utils.SourceRoot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Some code that uses JavaParser.
 */
public class LogicPositivizer 
{   
	
    public static void main(String[] args) throws InterruptedException, AWTException 
    {   WebDriver driver;

    ChromeOptions options = new ChromeOptions();
	 options.addArguments("--use-fake-ui-for-media-stream");
	 System.setProperty("webdriver.chrome.driver","/usr/bin/google-chrome");
	 options.addArguments("--headless");
    options.addArguments("--use-fake-device-for-media-stream");
	 options.addArguments("--start-fullscreen");
	 //options.addArguments("--use-file-for-fake-video-capture=");
	 options.addArguments("--use-file-for-fake-audio-capture=audio.wav");
	 options.addArguments("--autoplay-policy=no-user-gesture-required");
	 options.addArguments("--disable-infobars");
	 //
	 	  
	 		
	 
    driver = new ChromeDriver(options);		
    driver.get("https://live.monetanalytics.com/stu_proc/student.html#"); 				
	 		
	 System.out.println(driver.getTitle());	
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    driver.findElement(By.xpath("//input[@class='bootbox-input bootbox-input-text form-control']")).sendKeys("media8");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();	
    		
    
    Robot rb=new Robot();		
   		
    Thread.sleep(8000);			
    rb.keyPress(KeyEvent.VK_TAB);						
    rb.keyRelease(KeyEvent.VK_TAB);
  
    Thread.sleep(1000);
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(2000);
    rb.keyPress(KeyEvent.VK_TAB);			
  
    rb.keyRelease(KeyEvent.VK_TAB);
    Thread.sleep(1000);
    rb.keyPress(KeyEvent.VK_TAB);		
    rb.keyRelease(KeyEvent.VK_TAB);
    Thread.sleep(2000);
    rb.keyPress(KeyEvent.VK_ENTER);	
    rb.keyRelease(KeyEvent.VK_ENTER);
    }
}
