import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args)  {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();

       int ans =  powerLinear(x , n);
       System.out.println(ans);
    }

    public static int powerLinear(int x, int n){
        if(n == 0){ //base case
        return 1;
        }

        int xPowNm1 = powerLinear(x , n - 1);
        int xPowN = x * powerLinear(x , n - 1);
        return xPowN;
    }

}