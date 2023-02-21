package itheima;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/*
List集合常用子类:ArrayList,Linkedlist
ArrayList:底层数据结构是数组,查询快,增删慢
LinkedList:底层数据是链表,查询慢,增删快

练习:分别使用ArrayList和LinkedList完成存储字符串并遍历
 */
public class ListDemo {
    public static void main(String[] args) {

        System.out.println("---------ArrayList演示(开始)--------------");
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");

        //遍历(通常遍历有三种方式,iterator迭代器,普通for,增强for)
        //①先来最复杂的遍历方式-增强for
        System.out.println("----------------增强for的演示----------------");
        for(String s : array){
            System.out.println(s);
        }
        //②iterator迭代器
        System.out.println("---------------iterator的演示-----------------");

        //通过集合的iterator()方法得到迭代器
        Iterator<String> it = array.iterator();

        //遍历集合
        while(it.hasNext()){
            String ss = it.next();
            System.out.println(ss);
        }

        //③普通for
        System.out.println("----------------普通for的演示------------------");
        for(int i=0;i<array.size();i++){
           String s = array.get(i);
            System.out.println(s);
        }
        System.out.println("---------ArrayList演示(结束)--------------");
        System.out.println("---------LinkedList演示(开始)--------------");
        //Linkedlist
        LinkedList<String> LinkedList = new LinkedList<String>();
        LinkedList.add("hello");
        LinkedList.add("world");
        LinkedList.add("java");

        //遍历(通常遍历有三种方式,iterator迭代器,普通for,增强for)
        //①先来最复杂的遍历方式-增强for
        System.out.println("----------------增强for的演示----------------");
        for(String x:LinkedList){
            System.out.println(x);
        }
        //②iterator遍历方式参考上面ArrayList的演示代码
        //③普通for遍历方式参考上面ArrayList的演示代码

        System.out.println("---------LinkedList演示(结束)--------------");
    }
}
