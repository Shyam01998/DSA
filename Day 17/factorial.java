import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args)  {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int ans = factorial(n);
        System.out.println(ans);
    }

    public static int factorial(int n){

        if(n == 0){//base case
            return 1;
        }

        int factNm1 = factorial(n -1); //faith
        int factN = n * factNm1;
        return factN;
    }

}