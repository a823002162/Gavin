package itheima;

import java.util.LinkedList;

/*
LinkedList集合的特有功能:
public void addFirst(E e):在该列表开头插入指定的元素
public void addLast(E e):将指定的元素追加到此列表的末尾

public E getFirst():返回此列表中的第一个元素
public E getLast():返回此列表中的最后一个元素

public E removeFirst():从此列表中删除并返回第一个元素
public E removeLast():从此列表中删除并返回最后一个元素
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        //创建集合对象
        LinkedList<String> linkedList = new LinkedList<String>();
        //添加对象
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        System.out.println("------------------开头插入指定元素-----------------------");
        linkedList.addFirst("happycoding");
        System.out.println(linkedList);

        System.out.println("------------------末尾插入指定元素-----------------------");
        linkedList.addLast("unhanppycoding");
        System.out.println(linkedList);

        System.out.println("------------------返回列表中第一个元素--------------------");
        System.out.println(linkedList.getFirst());

        System.out.println("------------------返回列表中的最后一个元素-----------------");
        System.out.println(linkedList.getLast());

        System.out.println("------------------删除并返回第一个元素--------------------");
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList);

        System.out.println("------------------删除并返回最后一个元素------------------");
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);

        /*
        //下面的这些是我自己写的
        for(String  s:linkedList){
            System.out.println(s);
        }

        System.out.println("-----------------开头插入指定元素-----------------------");

        //public void addFirst(E e):在该列表开头插入指定的元素
        linkedList.addFirst("happycoding");
        //循环遍历输出集合(此处采用增强for)
        for(String  s:linkedList){
            System.out.println(s);
        }

        System.out.println("------------------末尾插入指定元素----------------------");

        //public void addLast(E e):将指定的元素追加到此列表的末尾
        linkedList.addLast("unhappycoding");
        for(String s:linkedList){
            System.out.println(s);
        }

        System.out.println("--------------------返回列表中第一个元素--------------------");
        //public E getFirst():返回此列表中的第一个元素
        String x = linkedList.getFirst();
        System.out.println(x);

        System.out.println("-------------------返回列表中的最后一个元素---------------------");
        //public E getLast():返回此列表中的最后一个元素
        String c = linkedList.getLast();
        System.out.println(c);

        System.out.println("------------------删除并返回第一个元素----------------------");
        //public E removeFirst():从此列表中删除并返回第一个元素
        String d = linkedList.removeFirst();
        System.out.println(d);
        for(String dd:linkedList){
            System.out.println(dd);
        }

        System.out.println("------------------删除并返回最后一个元素----------------------");
        //public E removeLast():从此列表中删除并返回最后一个元素
        String e =linkedList.removeLast();
        System.out.println(e);
        for(String ee:linkedList){
            System.out.println(ee);
        }
    */
    }
}
