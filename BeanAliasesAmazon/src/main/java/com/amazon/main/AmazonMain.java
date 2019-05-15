package com.amazon.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amazon.beans.Address;
import com.amazon.beans.AmazonOrderService;
import com.amazon.beans.Order;

public class AmazonMain {
	public static void main(String[] args) {
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("com/amazon/cfg/beans.xml");
		AmazonOrderService am=ctxt.getBean("amazon",AmazonOrderService.class);
		Order o=ctxt.getBean("order", Order.class);
		Address addr=ctxt.getBean("address",Address.class);
		am.placeOrder(o, addr);
	}
}
