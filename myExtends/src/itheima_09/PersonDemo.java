package itheima_09;
/*
测试类
 */
public class PersonDemo {
    public static void main(String[] args) {
        //创建老师类对象，并进行测试
        Teacher t1 = new Teacher();
        t1.setName("林青霞");
        t1.setAge(20);
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach();
        Teacher t2 = new Teacher("张曼玉",22);
        System.out.println(t2.getName()+""+t2.getAge());
        t2.teach();
    }
}
