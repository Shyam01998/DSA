import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt(), nc = sc.nextInt();
        int mat[][] = new int[nr][nc];

        for(int i = 0; i < nr; i++){
            for(int j = 0; j < nc ; j++){
                mat[i][j] =  sc.nextInt();
            }
        }

        //logic
        int rmin = 0 ,cmin = 0, rmax = nr - 1, cmax = nc - 1 , count = 0;
        while(count < nr * nc){
            //Left wall
            for(int r = rmin; r <= rmax && count < nr * nc; r++){
                System.out.println(mat[r][cmin]);
                count++;
            }
            //Bottom wall
             for(int c = cmin+1; c <= cmax && count < nr * nc; c++){
                System.out.println(mat[rmax][c]);
                count++;
            }
            //right wall
             for(int r = rmax-1; r >= rmin && count < nr * nc; r--){
                System.out.println(mat[r][cmax]);
                count++;
            }
            //Top wall
             for(int c = cmax-1; c >= cmin + 1 && count < nr * nc; c--){
                System.out.println(mat[rmin][c]);
                count++;
            }

            rmin++;
            rmax--;
            cmin++;
            cmax--;


        }
    }

}