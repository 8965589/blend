package mainTest;

import java.util.HashMap;
import java.util.Map;

/**
 * @Date 2018/11/15 16:49.
 */
public class Testmap {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap();


        map.put("tttt","");


        System.out.println( map.get("tttt") == null);
        System.out.println( map.get("tttt")+"666");



    }
}
