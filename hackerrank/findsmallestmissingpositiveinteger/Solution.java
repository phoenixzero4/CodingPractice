package hackerrank.findsmallestmissingpositiveinteger;



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'findSmallestMissingPositive' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY orderNumbers as parameter.
     */

	public static int findSmallestMissingPositive(List<Integer> orderNumbers) {
		int missing = 1;
		
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		for(int i = 0; i <= orderNumbers.size(); i++) {
			map.put(i+1,  false);
		}
		
		Collections.sort(orderNumbers);
		
		for(Integer i : orderNumbers) {
			if(i > 0)
				map.put(i,  true);
		}
		
		for(int i = 1; i <= orderNumbers.size()+1; i++) {
			if(map.get(i) == false && i > 0) {
				missing = i;
				return missing;
			}
		}
		return missing;
	}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int orderNumbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> orderNumbers = IntStream.range(0, orderNumbersCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.findSmallestMissingPositive(orderNumbers);

        System.out.println(result);

        bufferedReader.close();
    }
}
