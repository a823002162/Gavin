package itheima_03;
/*
学生测试类
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        //使用set方法给成员变量赋值
        s.setName("林青霞");
        s.setAge(30);
        s.show();

        //使用get方法获取成员变量的值
        System.out.println(s.getName()+"---"+s.getAge());
    }
}
