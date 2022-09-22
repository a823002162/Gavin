package itheima_06;
/*
创建对象并为其成员变量复制的两种方式
1：无参构造方法创建对象后使用setXxx()赋值
2：使用带参构造方法直接创建带有属性的对象
 */
public class StudentDemo {
    public static void main(String[] args) {
        //无参构造方法创建对象后使用set方法赋值
        Student s1 = new Student();
        s1.setAge(20);
        s1.setName("gavin");
        s1.show();

        //使用带参数构造方法之间创建带有属性的对象
        Student s2 = new Student("Gavin",26);
        s2.show();
    }
}
