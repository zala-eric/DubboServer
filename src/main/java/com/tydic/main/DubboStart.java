package com.tydic.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboStart {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:dubbo-config/*.xml" });  
        context.start();  
        System.out.println("按任意键退出"+System.getProperty("java.version"));  
        System.in.read();
        
        
	}

}
