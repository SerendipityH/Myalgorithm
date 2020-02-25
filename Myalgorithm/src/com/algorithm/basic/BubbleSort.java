package src.com.algorithm.basic;

/**
 * 冒泡排序
 * 
 * @author gqh
 *
 */
public class BubbleSort {

	public static void bubbleSort(int arr[]) {
		if (arr == null || arr.length < 2) {
			return;
		}
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
	}

	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 4, 1, 2, 6, 7, 4, 9, 8 };
		bubbleSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
