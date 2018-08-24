package practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//编写一段代码，将一个正整数N用二进制表示并转换为一个String类型的值s。
//解答：Java有一个内置方法 Integer.toBinaryString(N)专门完成这个任务，但该题的目的就
//是给出这个方法的其他实现方法。
/*
 *@author gqh
 * @date 2017/08/23
 */
public class Test3 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s="";
        String s1="";
        try {
            int N=Integer.parseInt(bufferedReader.readLine());
            for(int i=N;i>0;i/=2){
                s = (i % 2)+"";
                s1+=s;

            }
            StringBuffer stringbuffer =new StringBuffer(s1).reverse();
            System.out.println(stringbuffer);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
