package lesson6;

public class Main {
    public static void main(String[] args) {
        MyTreeMap<Integer, String> map = new MyTreeMap<>();

        map.put(4, "four");
        map.put(2, "two");
        map.put(1, "one");
        map.put(5, "five");
        map.put(3, "three");

//        System.out.println(map.size());
        System.out.println(map.get(2));
//        map.put(2, "two two");
//        System.out.println(map.get(2));

        System.out.println(map);

        map.delete(1);
        System.out.println(map);





    }
}
