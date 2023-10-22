package homework;

public class Homework4 {
	static void bubbleSortAsc(int arr[], int n) {
		int i, j, temp;
		boolean swapped;
		for (i = 0; i < n - 1; i++) {
			swapped = false;
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap arr[j] và arr[j+1]
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			if (swapped == false)
				break;
		}
	}

	static void bubbleSortDesc(int arr[], int n) {
		int i, j, temp;
		boolean swapped;
		for (i = 0; i < n - 1; i++) {
			swapped = false;
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					// swap arr[j] và arr[j+1]
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			if (swapped == false)
				break;
		}
	}
	
	static void printArray(int arr[], int size) {
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		int arrAsc[] = { 5, 4, 8, 1, 2 };
		int ascLength = arrAsc.length;
		System.out.println("Mảng ban đầu:");
		printArray(arrAsc, ascLength);
		
		
		bubbleSortAsc(arrAsc, ascLength);
		System.out.println("Mảng sau khi sắp xếp tăng dần:");
		printArray(arrAsc, ascLength);
		
		int arrDesc[] = { 5, 4, 8, 1, 2 };
		int descLength = arrDesc.length;
		bubbleSortDesc(arrDesc, descLength);
		System.out.println("Mảng sau khi sắp xếp giảm dần:");
		printArray(arrDesc, descLength);
	}

}
