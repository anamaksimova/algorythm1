import lesson2.MyArrayList;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 20;
        MyArrayList<Integer> mal = new MyArrayList<>(n);
        for (int i = 0; i < n; i++) {
            mal.add(random.nextInt(100));
        }
        System.out.println(mal);



    }
}
