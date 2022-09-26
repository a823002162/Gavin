package StudentAdministerSystem;
/*
构建学生类
4个成员变量
学号
姓名
年龄
家庭地址
 */
public class Student {
    private String number;
    private String name;
    private String age;
    private String address;

    public Student(){}
    public Student(String number,String name,String age,String address){
        this.number = number;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public String getNumber(){
        return number;
    }
    public void setName(String name){
        this.name = name;
    }
    public String  getName(){
        return name;
    }
    public void setAge(String age){
        this.age = age;
    }
    public String getAge(){
        return age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
}
