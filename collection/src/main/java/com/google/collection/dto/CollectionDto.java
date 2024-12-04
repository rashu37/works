package com.google.collection.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.context.annotation.Bean;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component

public class CollectionDto {
//	public CollectionDto() {
//		System.out.println("Collection Dto");
//	}
	
	@Bean
	public List get() {
		System.out.println("List Constructor");
		List l=new ArrayList();
		l.add("hello");
		return l;
	}
	@Bean
	public LinkedList get1() {
		System.out.println("LnkedList Constructor");
		LinkedList list=new LinkedList();
		list.add("hello");
		list.add("Hii");
		list.add("GoodMorning");
		return list;
	}
	@Bean
	public Set get2() {
		System.out.println("Set Constructor");
		Set list= new HashSet();
		list.add("hello");
		list.add("Hii");
		list.add("GoodMorning");
		return list;
	}
	@Bean
	public HashSet get3() {
		System.out.println("HashSet Constructor");
		HashSet list= new HashSet();
		list.add("hello");
		list.add("Hii");
		list.add("GoodMorning");
		return list;
	}
	@Bean
	public LinkedHashSet get4() {
		System.out.println("LinkedHashSet Constructor");
		LinkedHashSet list= new LinkedHashSet();
		list.add("hello");
		list.add("Hii");
		list.add("GoodMorning");
		return list;
	}
	@Bean
	public Queue get5() {
		System.out.println("Queue Constructor");
		Queue list= new LinkedList();
		list.add("hello");
		list.add("Hii");
		list.add("GoodMorning");
		return list;
	}
	@Bean
	public ArrayList get6() {
		System.out.println("ArrayList Constructor");
		ArrayList list= new ArrayList();
		list.add("hello");
		list.add("Hii");
		list.add("GoodMorning");
		return list;
	}
	
	@Bean
	public TreeSet get7() {
		System.out.println("TreeSet Constructor");
	    TreeSet list= new TreeSet();
		list.add("hello");
		list.add("Hii");
		list.add("GoodMorning");
		return list;
	}
	
	@Bean
	public HashMap get8() {
		System.out.println("HashMap Constructor");
		return new HashMap();
	}
	
	@Bean
	public LinkedHashMap get9() {
		System.out.println("LinkedHashMap Constructor");
		return new LinkedHashMap();
	}
	
	@Bean
	public Map get10() {
		System.out.println("Map Constructor");
		return new LinkedHashMap();
	}
	
	
	
	
	

}
