package collection;

import java.util.ArrayList;
import java.util.Collection;


public class StateRunner {

	public static void main(String[] args) {
		Collection<String> state=new ArrayList<String>();
		System.out.println("State names");
        state.add("Karnataka");
        state.add("Telangana");
        state.add("Tamilandu");
        state.add("Goa");
        state.add("Bihar");
        state.add("Maharastra");
        state.add("Madhya pradesh");
        state.add("Uttar pradesh");
        state.add("Delhi");
        state.add("Jammu Kashmir");
        state.add("Assam");
        state.add("Rajasthan");
        state.add("Andra pradesh");
        state.add("Kerala");
        
        state.forEach(s->System.out.println(s));
        
        Collection<String> movie=new ArrayList<String>();
        System.out.println("Movie Names:");
        movie.add("Googly");
        movie.add("Gaja");
        movie.add("RajaKumara");
        movie.add("Appu");
        movie.add("Kirathaka");
        movie.add("Mungaru male");
        movie.add("Lucky");
        movie.add("KGF");
        movie.add("Kalki");
        movie.forEach(m->System.out.println(m));
	}

}
