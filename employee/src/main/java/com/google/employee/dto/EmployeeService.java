package com.google.employee.dto;

import java.util.HashMap;
import java.util.Map;

public class EmployeeService {
	
	public void details() {
		
		Map<Integer, String> map=new HashMap<>();
		map.put(80000, "Romi");
		map.put(95000, "jyothi");
		map.put(54554, "sangeetha");
		System.out.println(map);
	}

}
