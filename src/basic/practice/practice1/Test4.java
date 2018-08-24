package practice1;

/*
编写一段代码，打印出一个二维布尔数组的内容。其中，使用  *表示真，空格表示假。打印出
行号和列号
 */
/*
 *@author gqh
 * @date 2017/08/24
 */
public class Test4 {
    public static void main(String[] args) {
        boolean a[][]={{true,false,true},{true,true,false},{false,true,false}};
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                if(a[i][j]==true){
                    System.out.println(" * "+"第"+i+"行"+"第"+j+"列");
                }
                else{
                    System.out.println("   "+"第"+i+"行"+"第"+j+"列");
                }
            }
        }
    }
}
