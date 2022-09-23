package itheima_07;

import java.util.Scanner;

/*
需求:已知用户名和密码,请用程序实现模拟用户登录.总共给三次机会,登录之后,给出相应的提示
思路:
①已知用户名和密码,定义两个字符串表示即可
②键盘录入要登录的用户名和密码,用Scanner实现
③拿键盘录入的用户名,密码和已知的用户名,密码进行比较,给出相应的提示.字符串的内容比较,用equals()方法实现
④用循环实现多次机会,这里的次数明确,采用for循环实现,并在登录成功的时候,使用break结束循环
 */
public class Userlogin {
    public static void main(String[] args) {
        //使用直接赋值的方式得到对象,定义用户名和密码
        String username = "root";
        String passwd = "123456";

              for (int i = 0; i < 3; i++) {
                  //键盘录入要登录的用户名和密码,用Scanner实现
                  Scanner sc = new Scanner(System.in);
                  //接受数据
                  System.out.print("请输入用户名:");
                  String username1 = sc.nextLine();
                  System.out.print("请输入密码:");
                  String passwd1 = sc.nextLine();

                  if (username.equals(username1) && passwd.equals(passwd1)) {
                      System.out.println("登录成功");
                      break;
                  } else {
                      if (2 - i == 0) {
                          System.out.println("错误次数太多,您的账户已被冻结,请与管理员联系");
                      } else {
                          System.out.println("输入错误,您还有" + (2 - i) + "次机会");
                      }
                  }
              }
        }
    }

