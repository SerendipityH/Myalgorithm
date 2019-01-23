package com.algorithm.basic;
/**
 * 快速排序
 * @author gqh
 *
 */
public class QuickSort {

	public static void quickSort(int arr[]) {
		if (arr == null || arr.length < 2) {
			return;
		}
		quickSort(arr, 0, arr.length - 1);
	}

	public static void quickSort(int arr[], int left, int right) {
		if (left < right) {
			swap(arr, left + (int) (Math.random() * (right - left + 1)), right);//随机快排
			int[] p = partition(arr, left, right);
			quickSort(arr, left, p[0] - 1);
			quickSort(arr, p[1] + 1, right);
		}
	}

	public static int[] partition(int arr[], int left, int right) {
		int i = left - 1;
		int j = right;
		while (left < j) {
			if (arr[left] < arr[right]) {
				swap(arr, ++i, left++);
			} else if (arr[left] > arr[right]) {
				swap(arr, --j, left);
			} else {
				left++;
			}
		}
		swap(arr, j, right);
		return new int[] { i + 1, j };
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 4, 1, 2, 6, 7, 4, 9, 8 };
		quickSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
