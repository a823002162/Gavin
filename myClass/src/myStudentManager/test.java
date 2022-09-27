package myStudentManager;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        addStudent(array);
        Student s = new Student();
        s.setSid("heima001");
        s.setAddress("xian");
        s.setAge("22");
        s.setName("gavin");
        array.add(s);
    }

    public static void addStudent(ArrayList<Student> array) {
        //键盘录入学生对象所需要的数据，显示提示信息，提示要输入何种信息
        Scanner sc = new Scanner(System.in);
        String sid;
        //为了让sid在while循环外面被访问到,我们将其定义到循环外;

        //为了让程序回到这里,使用循环实现
        while (true) {
            System.out.println("请输入学生学号：");
            sid = sc.nextLine();
            boolean flag = isUsed(array,sid);
            if (flag) {
                System.out.println("您输入的学号已经被使用,请重新输入");
            } else {
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();
        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        //将学生对象添加到集合中
        array.add(s);
        //给出添加成功提示
        System.out.println("添加学生成功");
    }

    public static boolean isUsed(ArrayList<Student> array, String sid) {
        //如果与集合中的某一个学生学号相同,返回true,如果都不相同,返回false
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);

            if (array.get(i).equals(sid)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
