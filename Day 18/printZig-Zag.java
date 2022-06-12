import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args)  {
        // write your code here
        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // pzz(n);

        //another way to take input inside function.
        pzz(new Scanner(System.in).nextInt());
    }

    public static void pzz(int n){
        if(n == 0){ //base case
            return;
        }

        System.out.print(n+" ");
        pzz(n - 1);
        System.out.print(n+" ");
        pzz(n - 1);
        System.out.print(n+" ");
        
        
    }

}