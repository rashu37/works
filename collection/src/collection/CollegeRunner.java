package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollegeRunner {

	public static void main(String[] args) {
		Collection<String> collegeNames = new ArrayList<>();

		collegeNames.add("PDIT");
		collegeNames.add("STJ");
		collegeNames.add("IBMR");

		System.out.println("College Names: " + collegeNames);

		Collection<String> companyNames = new ArrayList<>();
		companyNames.add("Google");
		companyNames.add("Microsoft");
		companyNames.add("Apple");

		System.out.println("Company Names: " + companyNames);

		collegeNames.addAll(companyNames);
		System.out.println("After addAll (companyNames to collegeNames): " + collegeNames);

		boolean containsAllCompanies = collegeNames.containsAll(companyNames);
		System.out.println("Contains all company names: " + containsAllCompanies);

		collegeNames.remove("IBMR");
		System.out.println("After removing IBMR: " + collegeNames);

		collegeNames.removeAll(companyNames);
		System.out.println("After removeAll (companyNames from collegeNames): " + collegeNames);

		int size = collegeNames.size();
		System.out.println("Size of collegeNames collection: " + size);

		Object[] collegeArray = collegeNames.toArray();
		System.out.println("College Names as an array:");
		for (Object college : collegeArray) {
			System.out.println(college);
		}

		collegeNames.clear();
		System.out.println("After clearing collegeNames collection: " + collegeNames);
	}

}
