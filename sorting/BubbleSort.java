package sorting;

public class BubbleSort {

	public static void bubbleSort(int[] array) {
		
		for(int i = 0; i < array.length-1; i++) {
			
			for(int j = i+1; j < array.length; j++) {
				
				if(array[i] > array[j]) {
					
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] array = {2, 1, 8, 5, 6, 3};
		bubbleSort(array);
		
		for(Integer i : array) {
			System.out.print(i + " " );
		}
	}
}
