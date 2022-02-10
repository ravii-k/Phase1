package arrayRotation;

import java.util.Arrays;

public class RightRotateArray {

	private static void rightRotate(int[] inputArray, int n) {
		System.out.println("Input Array Before Rotation :");

		System.out.println(Arrays.toString(inputArray));

		int temp;

		for (int i = 1; i <= n; i++) {
			temp = inputArray[inputArray.length - 1];

			for (int j = inputArray.length - 1; j > 0; j--) {
				inputArray[j] = inputArray[j - 1];
			}

			inputArray[0] = temp;
		}

		System.out.println("Input Array After Right Rotation By " + n + " Positions :");

		System.out.println(Arrays.toString(inputArray));
	}

	public static void main(String[] args) {
		rightRotate(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 2);
	}
}