package com.google.bankapplication.things;

public class SocialMedia {
	
	private String name;
	private int followers;
	private int following;
	private String password;
	
	public SocialMedia() {
		System.out.println("Social media Detials");
		}
	
	public SocialMedia (String name) {
		this("@rash19",876,546,"Rash@37");
		this.name=name;
		System.out.println("Another Accountname:"+name);
	}
	
	public SocialMedia(String name,int followers,int following,String password) {
		this.name=name;
		this.followers=followers;
		this.following=following;
		this.password=password;
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFollowers(int followers) {
		this.followers = followers;
	}

	public void setFollowing(int following) {
		this.following = following;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public int getFollowers() {
		return followers;
	}

	public int getFollowing() {
		return following;
	}

	public String getPassword() {
		return password;
	}
	
	public String toString() {
		return "Details:"+"Username:"+ name +","+"Followers"+followers+","+"Following"+following+","+"Password:"+password;
	}
	

}
