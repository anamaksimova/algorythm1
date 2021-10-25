import java.io.*;
import java.util.*;

public class Lesson1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        int c = in.nextInt();
        int d = Math.max(a, b);
         d = Math.max(d, c);
        int e = Math.min(a, b);e = Math.min(e, c);
        out.println(d-e);

        out.flush();
    }
}

