package com.google.task.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IntegerDesc {

	public static void main(String[] args) {
		List<Integer> num=new ArrayList<Integer>();
        num.add(10);
        num.add(11);
        num.add(12);
        num.add(13);
        num.add(14);
        num.add(15);
        num.add(16);
        num.add(17);
        
        Comparator<Integer> result1=(Integer s1, Integer s2) ->s2.compareTo(s1);
        Collections.sort(num,result1);
        num.forEach(s1->System.out.println(s1));
        

	}

}
