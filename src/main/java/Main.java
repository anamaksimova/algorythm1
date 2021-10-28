import lesson2.MyArrayList;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 100000;
        MyArrayList<Integer> mal = new MyArrayList<>(n);
        for (int i = 0; i < n; i++) {
            mal.add(random.nextInt(100));
        }
      //  System.out.println(mal);
//        long m = System.currentTimeMillis();
//        mal.bubbleSort();
//        long m1 = System.currentTimeMillis();
//        System.out.println("Пузырьковая сортировка "+ (m1-m) + " ms");

//        long m = System.currentTimeMillis();
//        mal.insertionSort();
//        long m1 = System.currentTimeMillis();
//        System.out.println("Вставкой сортировка "+ (m1-m) + " ms");
//
//        long m = System.currentTimeMillis();
//        mal.selectionSort();
//        long m1 = System.currentTimeMillis();
//        System.out.println("Выбором сортировка "+ (m1-m) + " ms");

        long m = System.currentTimeMillis();
        mal.bubbleSortOpt();
        long m1 = System.currentTimeMillis();
        System.out.println("Пузырьковая опт сортировка "+ (m1-m) + " ms");

    }
}
