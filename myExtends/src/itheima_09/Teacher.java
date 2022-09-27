package itheima_09;

public class Teacher extends Person {


    public Teacher(){}//手动给出无参构造方法

    //手动给出有参构造方法
    public Teacher (String name,int age){
        //this.name = name;
        //this.age = age;
        //此处不能直接通过this.name和this.age来赋值，因为不能直接调用父类的私有成员变量
        super(name,age);//通过super，传参数给父类，调用父类带参构造方法，实现参数赋值

    }

    public void teach(){
        System.out.println("用爱成就每一位学员");
    }


}
