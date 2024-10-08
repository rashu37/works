package com.edge.exception.things;

public class SocialMedia implements Cloneable{
	
	public String userName;
	public long userId;
	public int followers;
	public int following;
	public int unfollow;
	public double ratings;
	public int likes;
	
	public SocialMedia clone() throws CloneNotSupportedException {
		return (SocialMedia)super.clone();
	}

	@Override
	public String toString() {
		return "SocialMedia [userName=" + userName + ", userId=" + userId + ", followers=" + followers + ", following="
				+ following + ", unfollow=" + unfollow + ", ratings=" + ratings + ", likes=" + likes + "]";
	}
	
	

}
