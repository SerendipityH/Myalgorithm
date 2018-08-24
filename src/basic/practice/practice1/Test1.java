package practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//编写一个程序，从命令行得到三个整数参数。如果它们都相等则打印     equal，否则打印 not equal。
/*
*@author gqh
* @date 2017/08/23
*/
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int a = scanner.nextInt();
            int b=  scanner.nextInt();
            int c = scanner.nextInt();
            if(a==b&&b==c){
                System.out.println("equal");
                continue;
        }
             System.out.println("not equal");
        }
    }
}
