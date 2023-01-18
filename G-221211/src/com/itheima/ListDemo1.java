package com.itheima;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
需求:
我有一个集合:List<String> list = new ArrayList<String>();
里面有三个元素: List.add("hello");list.add("world");lsit.add("java")
遍历集合,得到每一个元素,看看有没有"world"这个元素,如果有,我就添加一个"javaee"元素,请写代码实现

异常:ConcurrentModificationException

 */
public class ListDemo1 {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

//        //遍历集合,得到每一个元素,看有没有"world"这个元素,如果有,我就添加一个"javaee"元素
//        Iterator<String> it = list.iterator();
//        while(it.hasNext()){
//            String s = it.next();
//            if(s.equals("world")){
//                list.add("javaee");
//            }
//        }
        /*
        上述迭代器操作的方法会出现并发修改异常,原因是next()方法里面会判断expectmodcount和modcount是否相等
        不相等就会抛出异常:ConcurrentModificationException
        我们使用list.add("javaee")会修改modcount值但是不会改变expectmodcount的值
        所以执行到后面一定会出现异常
         */

        //使用循环遍历的方法就不会出现上述的"并发修改异常"
        for(int i =0;i<list.size();i++){
            String s = list.get(i);
            if(s.equals("world")){
                list.add("javaee");
            }
        }
        System.out.println(list);
    }
}
