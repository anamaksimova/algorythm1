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

//        long m = System.currentTimeMillis();
//        mal.bubbleSortOpt();
//        long m1 = System.currentTimeMillis();
//        System.out.println("Пузырьковая опт сортировка "+ (m1-m) + " ms");
//
//        Random random = new Random();
//        int n = 1000000;
//        MyArrayList<Integer> mal = new MyArrayList<>(n);
//        for (int i = 0; i < n; i++) {
//            mal.add(random.nextInt(100000));
//        }

        long begin = System.currentTimeMillis();
//        System.out.println(mal);

//        mal.selectionSort();//15091 ms
//        mal.insertionSort();//5836 ms
//        mal.bubbleSort();//37917 ms
//        mal.bubbleSortOpt();
        mal.quickSort();//83 ms
//        System.out.println(mal);
        long end = System.currentTimeMillis();
        System.out.printf("Time: %d ms", end - begin);


    }
}
