package collection;


import java.util.ArrayList;
import java.util.List;

public class StreamsRunner {

	public static void main(String[] args) {
		List<String> streams= new ArrayList<String>();
		
		streams.add("Electronics and Communication");
		streams.add("Electrical");
		streams.add("Computer Science");
		streams.add("Mechanical");
		streams.forEach(s->System.out.println(s));
		
		System.out.println("Bike Names:");
		ArrayList<String> bikeNames=new ArrayList<String>();
		bikeNames.add("RoyalEnfield");
		bikeNames.add("KTM");
		bikeNames.add("Duke");
		bikeNames.add("Pulsur");
		bikeNames.forEach(s->System.out.println(s));
		
		System.out.println("Removing:");
		String result=bikeNames.remove(2);
	    System.out.println(result);
	    System.out.println("After Removing:");
	    
	    
	    //bikeNames.clear();
	    //System.out.println(bikeNames);
	    
	    streams.get(2);
	    streams.lastIndexOf(result);
	    streams.remove(1);
	    bikeNames.forEach(s->System.out.println(s));
	    streams.remove("KTM");
	    bikeNames.forEach(s->System.out.println(s));
	    int a=bikeNames.lastIndexOf("KTM");
	    System.out.println(a);
	    
    }

}
