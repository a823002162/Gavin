package itheima_07;

import java.util.Scanner;

/*
需求：
键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数（不考虑其他字符）
思路：
1：键盘录入一个字符串，用Scanner实现
2：要统计三种类型字符个数，需定义三个统计变量，初始值为0
3：遍历字符串，得到每一个字符
4：判断该字符属于哪种类型，然后对应类型的统计变量+1
假如ch是一个字符，我要判断它属于大写字母，小写字母，还是数字，直接判断该字符是否在对应的范围内即可
大写字母：ch >= 'A' && ch <= 'Z'
小写字母：ch >= 'a' && ch <= 'z'
数字： ch >= '0' && ch <= '9'
5:输出三种类型字符的个数
 */
public class Stringtongjizifu {
    public static void main(String[] args) {
        //键盘录入一个字符串，用Scanner实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s = sc.nextLine();

        //定义三个统计变量，初始值为0
        int a = 0;
        int b = 0;
        int c = 0;
        for (int x = 0; x < s.length(); x++) {
            if (s.charAt(x) >= 'A' && s.charAt(x) <= 'Z') {
                a = a + 1;
            } else if (s.charAt(x) >= 'a' && s.charAt(x) <= 'z') {
                b = b + 1;
            } else if (s.charAt(x) >= '0' && s.charAt(x) <= '9') {
                c = c + 1;
            }
            //else{
            //  System.out.println("您输入的字符串不属于任何字母（包含大小写）或数字");
            //}
        }
        System.out.println("大写字母的个数是：" + a + "个");
        System.out.println("小写字母的个数是：" + b + "个");
        System.out.println("数字的个数是：" + c + "个");
        //System.out.println("你真聪明");

    }
}
