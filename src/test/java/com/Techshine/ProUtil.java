package com.Techshine;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProUtil {
	private Properties prop;
	private String filePath;
	/*
	 * 构造方法
	 */
	public ProUtil(String filePath){
		this.filePath=filePath;
		this.prop=readProperties();
	}
	
	/*
	 * 读取配置文件
	 */
	private Properties readProperties(){
		Properties properties=new Properties();
		try {
			InputStream inputStream=new FileInputStream(filePath);
			BufferedInputStream in=new BufferedInputStream(inputStream);	
			properties.load(in);			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}
	
	public String getPro(String key){
		if (prop.containsKey(key)) {
			String username=prop.getProperty(key);
			return username;
		} else {
			System.out.println("获取key值不对");
			return "";
		}		
	}
	
	
}
