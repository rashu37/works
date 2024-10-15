package collection;

import java.util.LinkedList;

public class HomeAppliences {

	public static void main(String[] args) {
		LinkedList<String> devices = new LinkedList<String>();
		System.out.println("Home Appliences");
		devices.add("TV");
		devices.add("Refrigerator");
		devices.add("Washing Machine");
		devices.add("Air cooler");

		devices.add(2, "Table");
		devices.forEach(e -> System.out.println(e));

		devices.addFirst("(Adding first) Gas Cylinder");

		devices.addLast("(Adding last) Bed");

		boolean result = devices.contains("TV");
		System.out.println("Is home Appliences present:" + result);

		devices.element();

		boolean result1 = devices.equals("air cooler");
		System.out.println("Is home Appliences present:" + result1 + " ," + "equlas to air cooler");

		int result3 = devices.indexOf("Washing Machine");
		System.out.println("Index of Washing Machine:" + result3);

		int result4 = devices.lastIndexOf("Refrigerator");
		System.out.println("last of Index:" + result4);

		boolean result5 = devices.offer("Refrigerator");
		System.out.println("Offers:" + result5);

		boolean result6 = devices.offerFirst("Air cooler");
		System.out.println("Offers first:" + result6);

		boolean result7 = devices.offerLast("AC");
		System.out.println("Offers last:" + result7);

		String result8 = devices.peek();
		System.out.println("Peek element:" + result8);

		String result9 = devices.peekFirst();
		System.out.println("Peek first element:" + result9);

		String result10 = devices.peekLast();
		System.out.println("Peek last element:" + result10);

		String result11 = devices.pop();
		System.out.println("Pop element:" + result11);

		String result12 = devices.poll();
		System.out.println("Poll element:" + result12);

		String result13 = devices.pollFirst();
		System.out.println("Poll first element:" + result13);

		String result14 = devices.pollFirst();
		System.out.println("Poll last element:" + result14);

		// devices.push("Push: TV");

		String result15 = devices.remove();
		System.out.println("Removing:" + result15);

		String result16 = devices.remove(3);
		System.out.println("Removing 3rd index:" + result16);

		boolean result17 = devices.remove("Washing Machine");
		System.out.println("Removing Washing Machine:" + result17);

		String result18 = devices.removeFirst();
		System.out.println("Removing first element:" + result18);

		String result19 = devices.removeLast();
		System.out.println("Removing last element:" + result19);

		boolean result20 = devices.removeFirstOccurrence("TV");
		System.out.println("Removing First Occurrence:" + result20);

		int result21 = devices.size();
		System.out.println("Size:" + result21);

		devices.clear();
		System.out.println("After clearing devices:" + devices);
	}

}
