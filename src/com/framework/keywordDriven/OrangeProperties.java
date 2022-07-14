package com.framework.keywordDriven;

import java.io.FileInputStream;
import java.util.Properties;

public class OrangeProperties {
	public String fetchpro(String key) throws Throwable {
	      FileInputStream fis=new FileInputStream("C:\\Users\\Hp\\Documents\\selenium\\actitime.PROPERTIES");
	       Properties pobj=new Properties();
	       pobj.load(fis);
	       String data= pobj.getProperty(key);
	       return data;
		
}
}