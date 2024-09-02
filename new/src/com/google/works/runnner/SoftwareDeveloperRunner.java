package com.google.works.runnner;

import com.google.works.dto.Job;
import com.google.works.dto.SoftwareDeveloper;

public class SoftwareDeveloperRunner {
	
	public static void main(String[] args) {
		SoftwareDeveloper developer=new SoftwareDeveloper();
		SoftwareDeveloper softwaredeveloper=new SoftwareDeveloper("Software Developer","Work from home","BE","java,sql,html,css",(byte)0,30000,987654345l);
		
		SoftwareDeveloper.getjoblocation();
		SoftwareDeveloper.getjobqualification();
		SoftwareDeveloper.getjobSalary();
		
		Job job= new Job();
		job.joblocation("Work From Home");
		job.salary(30000);
		job.experience(0);
		
	}

}
