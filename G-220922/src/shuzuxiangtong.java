/*
需求:设计一个方法,用于比较两个数组的内容是否相同
思路:
①定义两个数组,分别使用静态初始化完成数组元素的初始化
②定义一个方法,用于比较两个数组的内容是否相同
返回值类型:Boolean
参数: int[] arr,int[] arr2
③比较两个数组的内容是否相同,按照下面的步骤实现即可
首先比较数组的长度,如果长度不相同,数组内容肯定不相同,返回false
其次遍历,比较两个数组中的每一个元素,只要有元素不同,返回false
最后循环遍历结束后,返回true
④调用方法,用变量接受
⑤输出结果
 */

public class shuzuxiangtong {
    public static void main(String[] args) {
        //定义两个数组,分别使用静态初始化完成数组元素的初始化
        int arr[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = {1, 2, 3, 4, 5, 6};

        //调用方法,用变量接受
        boolean flag = compare(arr, arr2);
        //输出结果
        System.out.println(flag);
    }

    //定义一个方法,用于比较两个数组的内容是否相同
    /*
    提到方法,要反应过来两个明确:
    1:返回值类型: boolean
    2:参数: int[] arr,int[] arr2
     */
    public static boolean compare(int[] arr, int[] arr2) {
        //首先比较数组长度,如果长度不相同,数组内容肯定不相同,返回false
        if (arr.length != arr2.length) {
            return false;
        }
        //其次遍历,比较两个数组中的每一个元素,只要有元素不相同,返回false
        for (int x = 0; x < arr2.length; x++) {
            if (arr[x] != arr2[x]) {
                return false;
            }

        }
        //如果数组元素也相同,并且遍历结束,那么这两个数组一定是相同的,直接返回true
        return true;
    }
}
