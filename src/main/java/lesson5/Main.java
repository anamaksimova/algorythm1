package lesson5;

import lesson2.MyArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println(fact(5));
//        System.out.println(recFact(5));

//        System.out.println(fibo(47));
//        System.out.println(recFibo(12));

//        System.out.println(triangleNum(5));
//        System.out.println(recTriangleNum(5));

//        System.out.println(multiply(3, 8));
//        System.out.println(recMultiply(3, 8));
//        System.out.println(recExp(3,3));

       int[] m = new int[] {12,2,1,4,1};

        int[] price = new int[] {4,2,1,10,2};
        System.out.println(recBackPack(m, price, 5, 15));
    }

    public static int multiply(int a, int b) {
        int p = 0;
        for (int i = 0; i < b; i++) {
            p += a;
        }
        return p;
    }

    public static int recMultiply(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return recMultiply(a, b - 1) + a;
    }


    public static int triangleNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int recTriangleNum(int n) {
        if (n == 1) {
            return 1;
        }
        return recTriangleNum(n - 1) + n;
    }

    public static long fibo(int n) {
        long a = 1;
        long b = 1;
        for (int i = 3; i <= n; i++) {
            b = b + a;
            a = b - a;
        }
        return b;
    }

    public static long recFibo(int n) {
        System.out.print(n + " ");
        if (n < 3) {
            return 1;
        }
        return recFibo(n - 1) + recFibo(n - 2);
    }

    public static int fact(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static int recFact(int n) {
        if (n == 1) {
            return 1;
        }
        return recFact(n - 1) * n;
    }
    //дз 1
    public static int recExp(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return recExp(x, n-1 )*x;
    }

    public static int recBackPack(int[] m, int[] price, int n, int M){
      if (n<=0){
        return 0;
      } else if(m[n-1]>M){
      return recBackPack(m,price,n-1,M);
        } else{
      return  Math.max(recBackPack(m, price, n - 1, M), price[n - 1]
                  + recBackPack(m, price, n - 1, M - m[n - 1]));}
    }

}
