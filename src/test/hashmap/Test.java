package test.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xhc
 * @date 2021/3/22 15:04
 */
public class Test {

    public static void main(String[] args) {

        Map<String, Double> hashMap = new HashMap<>();
        hashMap.put("k1", 0.1);
        hashMap.put("k2", 0.2);
        hashMap.put("k3", 0.3);
        hashMap.put("k4", 0.4);
        hashMap.put("k5", 0.5);
        System.out.println(hashMap.toString());

        System.out.println("push test");

    }
}
