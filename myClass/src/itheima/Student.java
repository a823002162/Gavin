package itheima;
/*
①定义一个学生类
类名:Student
成员变量:name,age
成员方法:study(),doHomework()
②定义学生测试类
类名:StudentDemo
因为要做测试,所以有一个主方法:main方法
③在学生测试类中通过对象完成成员变量和成员方法的使用
给成员变量复制,输出成员变量的值
调用成员方法
 */
public class Student {
    //成员变量
    String name;
    int age;
    //成员方法
    public void study(){
        System.out.println("好好学习,天天向上");
    }
    public void doHomework(){
        System.out.println("键盘敲烂,月薪过万");
    }
}
