package com.xworkz.set.runner;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ListIteratorRunner {

	public static void main(String[] args) {
		System.out.println("Main Method Running");
		
		List<String> list=new LinkedList<String>();
		list.add("shree@gmail.com");
		list.add("mahi@gmail.com");
		
		ListIterator<String> listIterator=list.listIterator();
		listIterator.add("shree@gmail.com");
		listIterator.add("mahi@gmail.com");
		listIterator.add("sunitha@gmail.com");
		
		
		while(listIterator.hasNext()) {
			System.out.println("EmailId:"+listIterator.next());
		
		}
		
		System.out.println("---------------");
		while(listIterator.hasPrevious()) {
			System.out.println("EmailId:"+listIterator.previous());
		}
		System.out.println("---------------");
		String result1=listIterator.next();
		System.out.println("Next:"+result1);
		
		int result2=listIterator.nextIndex();
		System.out.println("NextIndex:"+result2);
		
		System.out.println("---------------");
		listIterator.forEachRemaining(s->System.out.println(s));
		
		System.out.println("------------------");
	    list.remove(2);
		list.forEach(s->System.out.println(s));
	    
	

	}

}
