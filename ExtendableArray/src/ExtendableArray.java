import java.util.Arrays;

public class ExtendableArray {

	private int[] arr;
	private int currentSize = 0;

	public ExtendableArray(int size) {
		arr = new int[size];
	}

	public void add(int inNum) {
		int[] temp = arr.clone();

		if (currentSize < arr.length) {
			for (int i = 0; i < currentSize; i++) {
				arr[i+1] = temp[i];
			}
			arr[0] = inNum;
		}
		else {
			arr = new int [(int) (arr.length * 1.5)];
			for (int i = 0; i < currentSize; i++) {
				arr[i+1] = temp[i];
			}
			arr[0] = inNum;
		}

		currentSize++;
	}

	public void display() {
		System.out.println("Array Size: " + currentSize);
		System.out.println("Array Capacity: " + arr.length);
		System.out.println("Array Contents: " + Arrays.toString(arr));
	}
}
