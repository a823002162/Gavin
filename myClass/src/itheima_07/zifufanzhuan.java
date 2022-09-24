package itheima_07;

import java.util.Scanner;

/*
需求:定义一个方法,实现字符串反转,价盘录入一个字符串,调用该方法后,在控制台输出结果
例如,键盘录入abc,输出结果cba
思路:
①键盘录入一个字符串,用Scanner实现
②定义一个方法,实现字符串反转,返回值类型String,参数String s
③在方法中把字符串倒着遍历,然后把每一个得到的字符拼接成一个字符串并返回
④调用方法,用一个变量接收结果
⑤输出结果
 */
public class zifufanzhuan {
    public static void main(String[] args) {
        //键盘录入一个字符串,用Scanner实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输出任意字符串:");
        String line = sc.nextLine();
//调用方法,用一个变量接受结果
        String v = Reverse(line);
        System.out.println(v);
    }
    /*
    定义方法,实现字符串反转
    返回值类型:String
    参数:String s
     */
    public static String Reverse(String s) {
        String x = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            x += s.charAt(i);
        }
        return x;
    }
}
