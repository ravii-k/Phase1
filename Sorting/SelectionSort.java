package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		new SelectionSort().sortArray();
	}
	int[] arr = {5,6,5,2,8,4,7,9,6,3,0,7,1,3};
	public void sortArray() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j<arr.length; j++) {
				if (arr[i]> arr[j])
				{
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i]= temp;
				}
			}
		}
	System.out.println("After Sorting");
	for (int i =0; i< arr.length; i++) {
		System.out.println(arr[i]);
	}
	}

}
