/*
练习减肥计划if版本,完全凭着记忆操作
笔记:
导包 import java.util.Scanner;
创建对象 Scanner sc = new Scanner(System.in);
接收数据 int week = sc.nextInt();
星期一:跑步
星期二:游泳
星期三:无氧
星期四:躺着
星期五:好好吃一顿


 */

import java.util.Scanner;

public class jianfeijihuaiflianxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数:");
        int week = sc.nextInt();
       /*
       if版本
          if (week == 1) {
            System.out.println("跑步");
        } else if (week == 2) {
            System.out.println("游泳");
        } else if (week == 3) {
            System.out.println("无氧");
        } else if (week == 4) {
            System.out.println("躺着");
        } else if (week == 5) {
            System.out.println("好好吃一顿");
        } else if (week<1 || week>5) {
            System.out.println("你输入的数据有误");

        }
*/
//switch版本,这种方式的边界条件比较好输入
        switch(week){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("无氧");
                break;
            case 4:
                System.out.println("躺着");
                break;
            case 5:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("你输入的数据有误");
                break;
        }
    }
}
