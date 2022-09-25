package itheima_10;

import java.util.ArrayList;
import java.util.Scanner;

/*
需求：
创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
学生的姓名和年龄来自于键盘输入

思路：
1：定义学生类，为了键盘录入数据方便，把学生类中的成员变量都定义为String类型
2：创建集合对象
3：键盘录入学生对象所需要的数据
4：创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
5：往集合中添加学生对象
6：遍历集合，采用通用遍历格式实现
 */
public class ArrayListTest {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();
       /*
        //创建学生对象
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        //加盘录入学生对象所需要的数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输出第1位学生的姓名");
        s1.setName(sc.nextLine());
        System.out.println("请输入第1位学生的年龄");
        s1.setAge(sc.nextLine());

        System.out.println("请输出第2位学生的姓名");
        s2.setName(sc.nextLine());
        System.out.println("请输入第2位学生的年龄");
        s2.setAge(sc.nextLine());

        System.out.println("请输出第3位学生的姓名");
        s3.setName(sc.nextLine());
        System.out.println("请输入第3位学生的年龄");
        s3.setAge(sc.nextLine());
        //往集合中添加学生对象
        array.add(s1);
        array.add(s2);
        array.add(s3);
        */
        //为了提高代码的复用性，创建方法来实现这个功能
        addStudent(array);
        addStudent(array);
        addStudent(array);
        //遍历集合，采用通用遍历格式实现
        for(int i=0;i<array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }
    }
    /*
    说到方法，两个明确
    返回值类型： void
    参数： ArrayList<Student> array
     */
    public static void addStudent(ArrayList<Student> array){
        //键盘录入学生对象所需要的数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄");
        String age = sc.nextLine();
        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setName(name);
        s.setAge(age);
        //往集合中添加学生对象
        array.add(s);
    }
}
