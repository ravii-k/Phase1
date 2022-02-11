package Sorting;

public class BubbleSort {

	public static void main(String[] args) {
new BubbleSort().sortArray();
	}
	int[] arr = {5,6,5,2,8,4,7,9,6,3,0,7,1,3};
	public void sortArray() {
		int size = arr.length;
		for (int i = 1; i < size; i++) {
			for (int j = 1; j<size; j++) {
				if (arr[j-1]> arr[j])
				{
					int temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]= temp;
				}
			}
		}
	System.out.println("After Sorting");
	for (int i =0; i< arr.length; i++) {
		System.out.println(arr[i]);
	}
	}

}
