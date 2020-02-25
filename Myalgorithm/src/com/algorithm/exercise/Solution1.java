package src.com.algorithm.exercise;

import java.util.Scanner;

/**

输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为2 
输入描述:
输入为一行，n(1 ≤ n ≤ 1000)


输出描述:
输出一个整数,即题目所求
示例1
输入
10
输出
2
 * @author serendipity
 *
 */
public class Solution1 {
	
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int count=0;
		int j= scanner.nextInt();	
			for(int i=j;i>=5;i--) {
				int temp=i;
				while(temp%5==0) {
					count++;
					temp/=5;
				}
			}
			System.out.println(count);
		}
}
