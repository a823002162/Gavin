package itheima_04;

public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();
         //使用set方法给成员变量赋值
        s.setName("林青霞");
        s.setAge(20);

        //调用show方法
        s.show();
    }
}
