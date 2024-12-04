package com.google.collection.dto;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CollectionRunner {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CollectionDto.class);
		System.out.println(context.getBeanDefinitionCount());
		String instance[]=context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(instance));
		
		Object result=context.getBean("get");
		System.out.println(result);
		
		Object result1=context.getBean("get1");
		System.out.println(result1);
		
		Object result2=context.getBean("get2");
		System.out.println(result2);
		
		Object result3=context.getBean("get3");
		System.out.println(result3);
		
		Object result4=context.getBean("get4");
		System.out.println(result2);
		
		Object result5=context.getBean("get5");
		System.out.println(result2);
		
		Object result6=context.getBean("get6");
		System.out.println(result6);
		
		Object result7=context.getBean("get7");
		System.out.println(result7);
		
		Object result8=context.getBean("get8");
		System.out.println(result8);
		
		Object result9=context.getBean("get9");
		System.out.println(result9);
		
		Object result10=context.getBean("get10");
		System.out.println(result10);
		
		
		
		
	}

}
