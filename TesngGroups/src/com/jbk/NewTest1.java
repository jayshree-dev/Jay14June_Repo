package com.jbk;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest1 {
@Test(priority=1,groups= {"Sanity Test"})
public void testB() {
	
	
	Assert.assertEquals("aaa", "aaa");
	System.out.println("m in NewTest1 class");
	
}
}
