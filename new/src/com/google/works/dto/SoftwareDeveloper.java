package com.google.works.dto;

public class SoftwareDeveloper {
	private String jobName;
	private String location;
	private String qualification;
	private String skills;
	private byte experience;
	private  int salary;
	private long number;
	
	
	
	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public byte getExperience() {
		return experience;
	}

	public void setExperience(byte experience) {
		this.experience = experience;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public SoftwareDeveloper(String jobName, String location, String qualification, String skills, byte experience, int salary,
			long number) {
		
		this.jobName = jobName;
		this.location = location;
		this.qualification = qualification;
		this.skills = skills;
		this.experience = experience;
		this.salary = salary;
		this.number = number;
	}
	
	public SoftwareDeveloper() {
		// TODO Auto-generated constructor stub
	}

	//static methods
	public static void getjobSalary() {
		System.out.println("JobSalary");
	}
	
	public static void getjoblocation() {
		System.out.println("Job Location");
	}
	
	public static void getjobqualification() {
		System.out.println("Job Qualification");
	}
	
	

	
	
	

}
