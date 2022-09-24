package itheima_09;

import java.util.ArrayList;

/*
ArrayList常用方法：
public boolean remove (object o)：测除指定的元素，返回删除是否成功
public E remove (int index)：删除指定素引处的元素，返回被删除的元素
public E set(int index, E element)：修改指定素引处的元素，返回被修改的元素
public E get(int index)：返回指定素引处的元素
pubLic int size()：返回集合中的元素的个数
 */
public class ArrayListDemo02 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> array = new ArrayList<>();
        //添加元素
        array.add("hellp");
        array.add("world");
        array.add("java");
        //public boolean remove (object o)：删除指定的元素，返回删除是否成功
        //System.out.println(array.remove("world"));
        //输出结果true
        //array:[hellp, java]

        //public E remove (int index)：删除指定素引处的元素，返回被删除的元素
        //System.out.println(array.remove(1));

        //public E set(int index, E element)：修改指定素引处的元素，返回被修改的元素
        //System.out.println(array.set(1,"javaee"));
        //输出的结果：world
        //array:[hellp, javaee, java]

        //public E get(int index)：返回指定素引处的元素
        //System.out.println(array.get(1));
        //System.out.println(array.get(3));//索引越界，会报错

        //pubLic int size()：返回集合中的元素的个数
        System.out.println(array.size());

        //输出集合
        System.out.println("array:"+array);
    }
}
