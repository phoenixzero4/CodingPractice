package lambdas;

import java.util.Arrays;
import java.util.List;

public class Dec21 {

	
	static List<String> places = Arrays.asList("New York", "Japan", "Tampa", "Creston", "Atlanta", "Columbus");
	
	public static void main(String[] args) {
		System.out.println(places);
		
		places.stream()
		.filter((p) -> p.startsWith("C"))
		.map((p) -> p.toUpperCase())
		.sorted()
		.forEach((p) -> System.out.println(p));
		
		places.stream().sorted().forEach( (p) -> System.out.print(p +" ") );
		
		places.stream().filter( p -> p.length() > 3).sorted().forEach(p -> System.out.println(p));
	}
	
	
}
