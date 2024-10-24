package com.google.task.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.google.task.dto.TaskDto;

public class TaskDtoRunner {

	public static void main(String[] args) {
		
		  List<TaskDto> tasks = new ArrayList<TaskDto>();
	        tasks.add(new TaskDto("Task A", 3));
	        tasks.add(new TaskDto("Task B", 1));
	        tasks.add(new TaskDto("Task C", 4));
	        tasks.add(new TaskDto("Task D", 2));
	        tasks.add(new TaskDto("Task E", 5));
	        System.out.println("Befor"+tasks);
	        Comparator<TaskDto> priorityComparator = new Comparator<TaskDto>() {
	            @Override
	            public int compare(TaskDto t1, TaskDto t2) {
	                return Integer.compare(t1.getPriority(), t2.getPriority());
	            }
	        };
	        Collections.sort(tasks, priorityComparator);
	        System.out.println("After"+tasks);
			
	}

}
