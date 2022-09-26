package StudentAdministerSystem;

import java.util.ArrayList;
import java.util.Scanner;

/*
学生管理系统:
欢迎使用学生管理系统,请输入如下代码直接进入对应模块:
1.增加学生
2.删除学生
3.查看学生
4.退出学生管理系统
----------------------------------------------------------------------------------
 */
public class StudentSystem {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Student> array = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        //调用方法,输出学生管理系统欢迎界面
        for (int w = 0; w < 100; w++) {
            welcome();
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    addStudent(array);
                    break;
                case 2:
                    deleteStudent(array);
                    break;
                case 3:
                    showStudent(array);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }

    /*
    第一个模块,欢迎界面模块
    两个明确:
    返回值类型:void
    参数:无参数
     */
    public static void welcome() {
        System.out.println("---------------------------------------");
        System.out.println("学生管理系统");
        System.out.println("欢迎使用学生管理系统,请输入如下代码直接进入对应模块:");
        System.out.println("1.增加学生");
        System.out.println("2.删除学生");
        System.out.println("3.查看学生");
        System.out.println("4.退出学生管理系统");
        System.out.println("---------------------------------------");
    }

    /*
    第二个模块,增加学生的方法
    两个明确
    返回值类型:void
    参数:ArrayList<Student> array    引用类型参数,无需返回值,参数内容的修改会直接影响实际参数
     */
    public static void addStudent(ArrayList<Student> array) {
        //键盘接受数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号:");
        String number = sc.nextLine();
        System.out.println("请输入学生姓名:");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄:");
        String age = sc.nextLine();
        System.out.println("请输入学生家庭地址:");
        String address = sc.nextLine();
        //创建学生对象,把键盘输入的内容赋值给学生对象
        Student s = new Student();
        s.setNumber(number);
        s.setAge(age);
        s.setName(name);
        s.setAddress(address);
        //往集合中添加学生对象
        array.add(s);
    }

    /*
    第三个模块,删除学生
    两个明确:
    返回值类型:void
    参数: ArrayList<Student> array
     */
    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除学生的学号:");
        String ll = sc.nextLine();
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            String n = s.getNumber();
            if (n == ll) {
                array.remove(array.get(i));
            }
        }
    }

    /*
    构造一个方法,目的是查看所有的学生
    返回值类型:void
    参数: ArrayList<Student> array
     */
    public static void showStudent(ArrayList<Student> array) {
//遍历集合中的所有对象
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            System.out.println(student.getNumber() + "," + student.getName() + "," + student.getAge() + "," + student.getAddress());
        }

    }
}
