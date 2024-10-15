package collection;


import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Hero Names");
		List<String> heroNames=new ArrayList<String>();
		heroNames.add("Sudeep");
		heroNames.add("Punith");
		heroNames.add("Yash");
		heroNames.forEach(s->System.out.println(s));
		
		System.out.println("Movie list of Sudeep");
		List<String> movieList=new ArrayList<String>();
		movieList.add("Veeramadakari");
		movieList.add("Ranna");
		movieList.add("Manikya");
		movieList.forEach(s->System.out.println(s));
		
		System.out.println("Movie list of Punith");
		List<String> movieList1=new ArrayList<String>();
		movieList1.add("Rajakumar");
		movieList1.add("Appu");
		movieList1.add("Ranavikrama");
		movieList1.forEach(s->System.out.println(s));
		
		System.out.println("Movie list of Yash");
		List<String> movieList2=new ArrayList<String>();
		movieList2.add("kirathaka");
		movieList2.add("Rajahulli");
		movieList2.add("KGF");
		movieList2.forEach(s->System.out.println(s));
		
		

	}

}
