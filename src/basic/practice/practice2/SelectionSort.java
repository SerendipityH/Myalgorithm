package practice2;

public class SelectionSort {
    public static void selectionSort(int a[]){
         int temp=0;
         int index=0;
         for(int i=0;i<a.length-1;i++){
             index=i;//无序区下标
             //寻找最小的
             for(int j=i+1;j<a.length;j++){
                 if(a[j]<a[index]){
                     index=j;
                 }
             }
            temp=a[i];
            a[i]=a[index];
            a[index]=temp;
         }
    }
    public static void main(String[] args) {
            int a[]={4,0,3,1,5,9,7};
            selectionSort(a);
             for (int i:a) {
            System.out.println(i); }
    }
}
/*
1.运行时间和输入无关，每次都要扫描一遍
一个有序的数组或是主键全部相等的数组   与 一个无序数组所用排序时间相同
2.数据移动是最少的
 */