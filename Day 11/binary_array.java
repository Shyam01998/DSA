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
    binarysearch(a[],k);

 }

}
public static int binarysearch(int a[],int k){
    int st = a[0], ed = a.length - 1 ;

    while(st <= mid)
    if(a[mid] < k){
        st =  mid + 1;
    }else
    if(a[mid] > k){
        ed = mid - 1;
    }else{
        return mid;
    }
}
return -1;

}