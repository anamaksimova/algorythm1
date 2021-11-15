package lesson6;

import lesson2.MyArrayList;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        MyTreeMap<Integer, String> map = new MyTreeMap<>();

//        map.put(4, "four");
//        map.put(2, "two");
//        map.put(1, "one");
//        map.put(5, "five");
//        map.put(3, "three");

//        System.out.println(map.size());
//        System.out.println(map.get(2));
//        map.put(2, "two two");
//        System.out.println(map.get(2));

//        System.out.println(map);
//
//        map.delete(1);
//        System.out.println(map);

        Random random = new Random();
       int numberOfTrees = 100000;
       int numberOfBalanced=0;
        for (int n=0; n<numberOfTrees;n++){
        int numberOfNodes = random.ints(1, 17,33).findFirst().getAsInt();
            System.out.println(numberOfNodes);
           int i=0; MyTreeMap<Integer, String> map = new MyTreeMap<>();

        while (  i < numberOfNodes) {

            int randomNumber = random.ints(1, -100,101).findFirst().getAsInt();
            String randomNumberString = String.valueOf(randomNumber);
            map.put(randomNumber, randomNumberString );
            i++;

        } System.out.println(map);
            System.out.println(map.height());
            if (map.isBalanced()) {numberOfBalanced++;}


        }
        System.out.println(numberOfBalanced);
        System.out.println((double) numberOfBalanced/numberOfTrees*100 + "%");



    }
}
