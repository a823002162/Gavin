/*
案例反转
需求:已知一个数组arr = {19,28,37,46,50}用程序实现把数组中的元素值交换
交换后的数组arr = {50,46,37,28,19}并在控制台输出交换后的数组元素

元素交换:
加入数组开始索引叫start,结束索引叫end
int temp = arr[start];
arr[start] = arr[end];
arr[end] = temp;

思路:
①定义一个数组,用静态初始化完成数组元素的初始化
②循环遍历数组,这一次初始化语句定义两个索引变量,判断条件是开始索引小于等于结束索引
③变量交换
④遍历数组,输出显示

 */
public class fanzhuan220922 {
    public static void main(String[] args){
        //定义一个数组,用静态初始化完成数组元素的初始化
        int arr[]={19,28,37,46,50};

        //循环遍历数组,这一次初始化语句定义两个索引变量,判断条件是开始索引小于等于结束索引
        for(int start=0,end=arr.length-1;start<=end;start++,end--){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        printarr(arr);
    }
    /*
    定义一个方法,循环遍历数组,并输出显示
    谈到方法首先要有两个明确
    1.明确返回值类型 这里数组是形参,形参的改变会直接影响实参,因此返回值类型是空的void
    2.明确参数类型 int arr[]
     */
    public static void printarr(int arr[]){
        System.out.print("[");
        for(int x=0;x<arr.length;x++){
            if(x==arr.length-1){
                System.out.print(arr[x]+"]");
            }else{
                System.out.print(arr[x]+",");
            }
        }
    }//因为是void空的类型,所以不需要返回值,也就不用写return了,其他类型的返回值需要写return+参数
}
