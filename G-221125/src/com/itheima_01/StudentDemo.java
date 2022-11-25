package com.itheima_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StudentDemo {
    public static void main(String[] args) {
        //创建集合对象
        Collection<Student> s = new ArrayList<Student>();

        //创建学生对象(学生类里面创建带参构造方法,可以方便的多)
        Student s1 = new Student("Gavin",20);
        Student s2 = new Student("lavin",30);
        Student s3 = new Student("kavin",40);

        s.add(s1);
        s.add(s2);
        s.add(s3);

        //通过集合的iterator()方法得到迭代器
        Iterator<Student> it = s.iterator();

        //遍历集合
        while(it.hasNext()){
            Student next = it.next();
            System.out.println(next.getName()+","+next.getAge());
        }
    }
}
