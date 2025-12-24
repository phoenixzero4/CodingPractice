package sorting;

public class QuickSort {

	public static void quickSort(int[] array, int low, int high) {

		if (low < high) {

			int index = partition(array, low, high);

			quickSort(array, low, index - 1);
			quickSort(array, index + 1, high);
		}
	}

	private static int partition(int[] array, int low, int high) {

		int pivot = array[high];

		int i = low - 1;

		for (int j = low; j < high; j++) {

			if (array[j] <= pivot) {
				i++;

				// swap array[i] and array[j]
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		// swap array[i+1] and array[high] (or pivot)
		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;

		return i + 1;
	}

	// Main method to test the algorithm
	public static void main(String[] args) {
		int[] arr = { 10, 80, 30, 90, 40, 50, 70 };
		int n = arr.length;
		quickSort(arr, 0, n - 1);
		System.out.println("Sorted array:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
