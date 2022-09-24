package itheima_08;

import java.util.Scanner;

/*
定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制输出结果
例如，键盘录入abc，输出结果cba
思路：
1：键盘录入一个字符串，用Scanner实现
2：定义一个方法，实现字符串反转，返回值类型String，参数String s
3：在方法中用StringBuilder实现字符串的反转，并把结果转成String返回
4：调用方法，用一个变量接收结果
5：输出结果
 */
public class StringBuilderTest02 {
    public static void main(String[] args) {
        //键盘录入一个字符串，使用Scanner实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        //调用方法，用一个变量接收结果
        String ss = StringReverse(line);
        //输出结果
        System.out.println(ss);
    }

    /*
    说到方法，就需要知道两个明确：
    明确返回值类型：String
    参数： String s
     */
    //定义一个方法，实现字符串反转
    //String---StringBuilder---reverse()---toString---String
    public static String StringReverse(String s) {
        // StringBuilder x = new StringBuilder(s);//先将接收到的String类型的s转换为StringBuilder类型
        //x.reverse();//对StringBuilder类型的对象x进行反转
        //String s1 = x.toString();//将反转后的StringBuilder类型的对象ss通过toString方法转换成String类型的s1
        //return s1;//返回s1

        //链式编程，上述的4行代码可以使用如下的这一行代码进行代替
        return new StringBuilder(s).reverse().toString();
    }

}
