package itheima;

import java.util.HashSet;
import java.util.Set;

/*
Set集合特点
不包含重复元素的集合
没有带索引的方法,所以不能使用普通for循环遍历

HashSet:对集合的迭代顺序不做任何保证
 */
public class SetDemo {
    public static void main(String[] args) {
        //创建集合对象(set是一个接口,不能直接实例化,所以需要找它的实现类)
        Set<String> set= new HashSet<String>();

        //添加元素
        set.add("hello");
        set.add("world");
        set.add("java");

        //遍历,方式一,增强for
        for(String s:set){
            System.out.println(s);
        }

        //遍历,方式二,iterator迭代器

    }
}
