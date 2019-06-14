package 类和变量;

/**
 * Java中变量分三种：成员变量、静态变量、局部变量
 * 1、成员变量的修饰符有public、private、protected、default（不写）
 * 2、修饰局部变量不能用上面的
 * 3、类的修饰符：public、abstract、final、defaul
 *
 * 补充：
 *  1、一个Java文件可以定义多个类，但只能有一个了类是public且与文件名相同。编译时会给每个类生成一个对应的.class文件
 * */
public class MyClass {
    //成员变量
    private String name;
    private Integer age;

    //静态变量也叫全局变量，被所有类的实例共用
    private static String token = "heihei";

    public int mySkill(int a, int b) {
        //局部变量只在{}内有效
        int c = 6;
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(new MyClass().mySkill(1,3));
    }

}

