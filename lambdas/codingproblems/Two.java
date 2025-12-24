package lambdas.codingproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * 2.	Create 100K bottles of different random colors( out of any 10 colors). 
 * 		Which collection will you use to store them if number of bottles may increase in future.
 * 		Write program to find number of bottles of same color.  
 */
public class Two {

	static List<String> colors = Arrays.asList("blue", "black", "white", "orange", "red", "green", "pink", "purple", "yellow", "brown");
	static List<Bottle> bottles = new ArrayList<>();
	static HashMap<String, Integer> map = new HashMap<>();
	static HashMap<String, Integer> map2 = new HashMap<>();
	static HashMap<String, Integer> map3 = new HashMap<>();
	
	static class Bottle{
		String color;
		
		public Bottle(String color) {
			this.color = color;
		}
		
		public String getColor() {
			return this.color;
		}
	}
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		for(int i = 0; i <= 100000; i++) {
			
			int num = random.nextInt(10);
			Bottle bottle = new Bottle(colors.get(num));
			bottles.add(bottle);
		}
		
		for(Bottle b : bottles) {
			
			String color = b.getColor();
			
			if(map.containsKey(color)){
				map.put(color, map.get(color)+1);
			}else {
				map.put(color,  1);
			}
			
			map2.merge(color,  1,  Integer::sum);
			
			map3.compute(color, (k, v) -> (v==null) ? 1 : v + 1);
			
		}
		
		System.out.println(map);
		System.out.println(map2);
		System.out.println(map3);
		
		
	}
}
