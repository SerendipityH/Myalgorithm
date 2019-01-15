package com.algorithm.basic;

/**
 * 归并排序
 * @author gqh
 *
 */
public class MergeSort {

	public static void mergeSort(int arr[]) {
		if (arr == null || arr.length < 2) {
			return;
		}
		mergeSort(arr, 0, arr.length - 1);
	}

	public static void mergeSort(int arr[], int l, int r) {
		if (l == r) {
			return;
		}
		int mid = l + ((r - l) >> 1);
		mergeSort(arr, l, mid);
		mergeSort(arr, mid + 1, r);
		merge(arr, l, mid, r);
	}

	public static void merge(int arr[], int left, int mid, int right) {
		int temp[] = new int[right - left + 1];
		int i = 0;
		int p1 = left;
		int p2 = mid + 1;
		while (p1 <= mid && p2 <= right) {
			temp[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
		}
		while (p1 <= mid) {
			temp[i++] = arr[p1++];
		}
		while (p2 <= right) {
			temp[i++] = arr[p2++];
		}
		for (i = 0; i < temp.length; i++) {
			arr[left + i] = temp[i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 4, 1, 2, 6, 7, 4, 9, 8 };
		mergeSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
