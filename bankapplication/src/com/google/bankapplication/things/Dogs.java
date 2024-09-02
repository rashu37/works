package com.google.bankapplication.things;
import java.util.Date;
public class Dogs {
	
	public String breed;
	public String colour;
	public Date date;
	public double kg;
	public String gender;
	
	public String birthdetils(String breed,String colour,Date date, double kg,String gender){
		return "Birth details:" + "Dog breed:"+ breed + ","+ "Colour:"+ colour + "," +"Date of birth:"+ date +","+"Kg:"+ kg +","+ "Gender:"+gender;
	}    
}
