import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i =0; i < a.length; i++){
        a[i] = sc.nextInt();
    }
    int data= sc.nextInt();

    int lo = 0;
    int hi = a.length - 1;
    int first = -1;
    while(lo <= hi){

        int mid = (lo + hi)/2;

        if(data < a[mid]) {
             hi = mid -1;

        }else if(data > a[mid]){
             lo = mid +1;
        }else {
            first = mid;
            hi = mid - 1;
        }

    }
    System.out.println(first);

     lo = 0;
     hi = a.length - 1;
    int last = -1;
    while(lo <= hi){

         int mid = (lo + hi)/2;

        if(data < a[mid]) {
             hi = mid -1;

        }else if(data > a[mid]){
            lo = mid +1;
        }else {
            last = mid;
            lo = mid + 1;
        }

    }
    System.out.println(last);
 }

}