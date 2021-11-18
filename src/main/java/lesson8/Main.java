package lesson8;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(5, 9999999);
//        System.out.println(map.get(5));
//        map.put(5, 77777);
//        System.out.println(map.get(5));


        ChainingHashMap<Integer, String> map = new ChainingHashMap<>(7);
        map.put(5, "9999999");
        map.put(7, "7");
        map.put(99, "99");
        map.put(89, "89");
        map.put(45, "45");
        map.put(33, "33");


        System.out.println(map);
        map.delete(77);
//        map.delete(33); System.out.println(map);  map.delete(45); System.out.println(map);
//        map.delete(5); System.out.println(map);

//        LinearProbingHashMap<Integer, String> lphm = new LinearProbingHashMap<>(97);
//        lphm.put(5, "qwe");
//        lphm.put(15, "qweerwer");
//        System.out.println(lphm.get(15));
    }
}
