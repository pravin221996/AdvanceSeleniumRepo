package com.Test;

import org.testng.annotations.BeforeSuite;   
import org.testng.annotations.Test;

import com.base.BaseClass;

public class LoginTest extends BaseClass {
	
	@BeforeSuite
	public void setup() throws Exception {
		intialization();	
	}
	@Test
	public void test01() {
		
		System.out.println("i am testng");
}
}