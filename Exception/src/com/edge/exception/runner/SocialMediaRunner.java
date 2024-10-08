package com.edge.exception.runner;

import com.edge.exception.things.SocialMedia;

public class SocialMediaRunner {

	public static void main(String[] args) {
		
		SocialMedia media=new SocialMedia();
		media.userName="Rakshitha";
		media.userId=67987678992l;
		media.followers=450;
		media.following=500;
		media.unfollow=400;
		media.likes=600;
		media.ratings=5.3;
		System.out.println("Details:"+media);
		
		try {
			SocialMedia media1=media.clone();
			System.out.println("Before Changing details");
			System.out.println("Details:"+media1);
			media1.userName="Sneha";
			media1.userId=7653345356l;
			media1.followers=390;
			media1.following=300;
			media1.unfollow=150;
			media1.likes=400;
			media1.ratings=4.5;
			System.out.println("After Changing details");
			System.out.println("Details:"+media1);
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
