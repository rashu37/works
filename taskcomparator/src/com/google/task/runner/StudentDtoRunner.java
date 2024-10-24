package com.google.task.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.google.task.dto.EmployeeDto;
import com.google.task.dto.StudentDto;

public class StudentDtoRunner {

	public static void main(String[] args) {
		
		List<StudentDto> students=new ArrayList<>();
		
		students.add(new StudentDto("Shree", 85, 20));
        students.add(new StudentDto("Gagana", 90, 22));
        students.add(new StudentDto("Cheru", 85, 21));
        students.add(new StudentDto("Daya", 95, 23));
        students.add(new StudentDto("Eswar", 90, 19));
        System.out.println(students);
		Comparator<StudentDto> ref = (StudentDto s1, StudentDto s2)-> s2.getGrade().compareTo(s1.getGrade());
		Collections.sort(students, ref);
		System.out.println(students);
        
        
        
      

	}

}
