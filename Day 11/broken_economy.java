import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i = 0; i < a.length; i++){
        a[i]=sc.nextInt();
    }

    int k = sc.nextInt();

     int lo = 0;
     int hi = a.length - 1 ;
    int ceil = 0;
    int floor = 0;

    while(lo <= hi){

       int  mid = (lo + hi)/2;

    if( k  <  a[mid] ){

        hi =  mid - 1;
        ceil = a[mid];

    }else

    if( k  > a[mid] ){

        lo = mid + 1;
        floor = a[mid];

    }else{
        ceil = a[mid];
        floor = a[mid];
        break;
      

    }
}
System.out.println(ceil);
System.out.println(floor);

 }

}
