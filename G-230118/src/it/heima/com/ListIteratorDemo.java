package it.heima.com;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
ListIterator:列表迭代器
通过List集合的ListIterator()方法得到,所以说它是List集合特有的迭代器
用于允许程序员沿任意方向遍历列表的列表的迭代器,在迭代期间修改列表,并获取列表中迭代器的当前位置
List Iterator中的常用方法
E next():返回迭代中的下一个元素
Boolean hasNext():如果迭代具有更多元素,则返回true
E previous():返回列表中的上一个元素
boolean hasPrevious():如果此列表迭代器在相反方向遍历列表时具有更多元素,则返回true
void add(E e):将指定的元素插入列表

 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //通过List集合的Listiterator()方法得到   了解即可
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()){
            String s = lit.next();
            System.out.println(s);
        }
        System.out.println("---------");
        //逆向遍历   了解即可
        while(lit.hasPrevious()){
            String ss = lit.previous();
            System.out.println(ss);
        }
        System.out.println("---------");

        //add(E  a):将指定的元素插入列表
        //获取列表迭代器
        ListIterator<String> litt = list.listIterator();
        while(lit.hasNext()){
            String s = lit.next();
            if(s.equals("world")){
                lit.add("javaee");
            }
        }
        System.out.println(list);
    }
}
