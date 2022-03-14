import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
     
    for( int i =0 ; i <= n-1; i++){
        a[i] = sc.nextInt();
    }
     
     int ele = sc.nextInt();
     int res = find(a , ele);

     System.out.println(res);

}
public static int find(int a[], int ele){
    for( int idx = 0 ; idx < a.length; idx++){

        if(  a[idx] == ele){
            return idx; //element found
        }

    }
    return -1; // element not found
}
}