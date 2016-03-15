package com.tydic.server.dubbo.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoServerImpl implements DemoServer {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public String sayHello(String str) {  
		log.info("客户端请求："+str);
        str = "Hello " + str + "++2:" + new Date();  
        log.info("服务端:" + str);
        return "服务端回应，你的问话是："+str;  
    }  

}
