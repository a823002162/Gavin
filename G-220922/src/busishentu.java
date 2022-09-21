/*
不死神兔
有一对兔子,第三个月会生一对兔子,新生的兔子第三个月也会生一对兔子,问第20个月的时候有多少对兔子
月份  兔子对数
1     1
2     1
 */
public class busishentu {
    public static void main(String[] args){
        //定义1个数组并动态初始化
        int [] arr = new int[20];
        arr[0]=1;
        arr[1]=1;
        for(int x=2;x<arr.length;x++){
            arr[x]=arr[x-2]+arr[x-1];
        }
        System.out.println(arr[19]);
    }
}
