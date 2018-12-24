package test1;

/**
 * @Date 2018/12/24 16:26.
 */
class Person {
    private String name;
    private String sex;

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return name + " " + sex;
    }


    public static void swapObject(Person p1, Person p2) {
        Person p = p1;
        p1 = p2;
        p2 = p;
    }

    public static void swapInt(int a, int b) {
        a = 1000;
        b = 100;
    }


}

public class TestMain {

    public static void main(String[] args) {
        Person p1 = new Person("zs", "nan");
        Person p2 = new Person("ls", "nv");
        System.out.println("对象交换前：p1 = " + p1.toString());
        System.out.println("对象交换前：p2 = " + p2.toString());
        // 交换p1对象和p2对象
        Person.swapObject(p1, p2);
        // 从交换结果中看出，实际对象并未交换
        System.out.println("对象交换后：p1 = " + p1.toString());
        System.out.println("对象交换后：p2 = " + p2.toString());
        System.out.println("================================================");

        int a = 10, b = 20;
        Person.swapInt(a, b);
        System.out.println(a);
        System.out.println(b);


    }


}