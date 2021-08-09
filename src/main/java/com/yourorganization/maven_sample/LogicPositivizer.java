package com.yourorganization.maven_sample;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.BinaryExpr;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.visitor.ModifierVisitor;
import com.github.javaparser.ast.visitor.Visitable;
import com.github.javaparser.utils.CodeGenerationUtils;
import com.github.javaparser.utils.Log;
import com.github.javaparser.utils.SourceRoot;

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
	
    public static void main(String[] args) throws InterruptedException 
    {   WebDriver driver;

		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver","/usr/bin/google-chrome");
		//options.addArguments("--headless");
		driver = new ChromeDriver(options);
		  driver.get("https://corporate.monetanalytics.com/#/auth");
		  driver.manage().window().maximize();								
		     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 																				
		     driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("kewal@ashmar.in");
		     driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Monet@615");
		     Thread.sleep(1000);	
		     driver.findElement(By.xpath("//body/app-root[1]/app-authentication[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-login[1]/div[1]/div[2]/form[1]/div[1]/button[1]/span[1]")).click();
		  		
    }
}
