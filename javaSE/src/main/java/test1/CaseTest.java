package test1;

/**
 * @Date 2018/12/24 17:31.
 *
 *
 * 没有 break  会一直 执行下去
 */
public class CaseTest {
    public static void main(String[] args) {

        System.out.println(getValue(2));
    }

    public static int getValue(int i) {
        int result = 0;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
        }
        return result;
    }
}
