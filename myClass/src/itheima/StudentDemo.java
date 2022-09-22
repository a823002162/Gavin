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
public class StudentDemo {
    //因为要做测试,所以有一个主方法:main方法
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();
        //使用对象
        System.out.println(s.name + ","+s.age);
        s.name = "林青霞";
        s.age = 30;
        System.out.println(s.name + ","+s.age);
        //调用方法
        s.study();
        s.doHomework();
    }
}
