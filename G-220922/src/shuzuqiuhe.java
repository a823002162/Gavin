/*
需求:有这样的一个数组,元素是{68,27,95,88,171,996,51,210} 求出该数组中满足要求的元素和
要求是:求和的元素个位和十位不能是7,并且只能是偶数

思路:
①定义一个数组,用静态初始化完成数组元素的初始化
②定义一个求和变量,初始值是0
③遍历数组,获取到数组中的每一个元素
④判断该元素是否满足条件,如果满足条件就累加
arr[x]%10!=7   arr[x]/10%10!=7   arr[x]%2==0
⑤输出求和变量的值
 */

public class shuzuqiuhe {
    public static void main(String[] args){
        int arr[]={68,27,95,88,171,996,51,210};
        int sum =0;
        for(int x=0;x<arr.length;x++){
            if(arr[x]%10!=7 && arr[x]/10%10!=7 && arr[x]%2==0){
                sum = sum + arr[x];
            }
        }
        System.out.println(sum);
    }
}
