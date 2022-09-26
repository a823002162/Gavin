package StudentAdministerSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
       ArrayList<Student> array = new ArrayList<Student>();
    }
/*
测试这个方法使用
 */

    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除学生的学号:");
        String s1 = sc.nextLine();
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            String n = s.getNumber();
            if (n == s1) {
                array.remove(s);
            }
        }
    }
}
