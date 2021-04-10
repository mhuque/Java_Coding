package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseConfig {
	
	public static String getConfigValue(String value) throws IOException {
		
		File file = new File("./Config.properties");
		FileInputStream fis = new FileInputStream(file);
		
		
		Properties ps = new Properties();
		ps.load(fis);
		
		//System.out.println(ps.getProperty(value));
		
		String data = ps.getProperty(value);
		return data;
		
	}
	
public static void main(String[] args) throws IOException {
	
	BaseConfig.getConfigValue("URL");
	System.out.println(BaseConfig.getConfigValue("user"));
	BaseConfig.getConfigValue("pass");
	
	
}
	
	
}
