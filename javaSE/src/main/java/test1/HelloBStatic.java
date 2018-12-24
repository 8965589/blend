package test1;

/**
 * @Date 2018/12/24 17:12.
 *
 *
 * 静态代码块 的执行顺序
 *
 * 父类 的 static
 * 此类的 static
 * 此类的 main  方法 开始执行
 *
 * 父类的 构造语句块
 * 父类的 构造函数
 *
 * 子类的 构造语句块
 * 子类的 构造函数
 *
 *
 *
 *
 *
 */
class HelloA {

    public HelloA() {
        System.out.println("HelloA");
    }

    {
        System.out.println("I'm A class");
    }

    static {
        System.out.println("static A");
    }

}

public class HelloBStatic extends HelloA {
    public HelloBStatic() {
        System.out.println("HelloB");
    }

    {
        System.out.println("I'm B class");
    }

    static {
        System.out.println("static B");
    }

    public static void main(String[] args) {
        System.out.println("-------main start-------");
        new HelloBStatic();
        System.out.println("-------main end-------");
    }


}