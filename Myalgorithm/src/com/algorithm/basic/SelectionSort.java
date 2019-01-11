package com.algorithm.basic;
/**
 * 选择排序
 * @author gqh
 *
 */
public class SelectionSort {
	public static void selectionSort(int arr[]) {
		if(arr==null||arr.length<2) {
			return ;
		}
		for(int i=0;i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				min=arr[j]<arr[min] ? j:min;
				/*if(arr[j]<arr[min]) {
					min=j;
				}*/
			}
			swap(arr,i,min);
		}
	}
	
	public static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int arr[]= {5,4,1,2,6,7,4,9,8,0};
		selectionSort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
