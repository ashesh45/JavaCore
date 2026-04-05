package sorting;

public class Main {
	
	 public static void main(String[] args) {
	        int[] arr1 = {5, 2, 9, 1, 6};
	        int[] arr2 = arr1.clone();

	        Sortable bubbleSort = new BubbleSort();
	        Sortable selectionSort = new SelectionSort();

	        bubbleSort.sort(arr1);
	        selectionSort.sort(arr2);

	        System.out.println("Bubble Sort Result:");
	        printArray(arr1);

	        System.out.println("Selection Sort Result:");
	        printArray(arr2);
	    }

	    // Utility method to print array
	    public static void printArray(int[] array) {
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

}
