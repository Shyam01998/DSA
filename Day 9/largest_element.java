import java.util.*;

public class Main {

  public static void main(String[] args) {
    // Write your code here
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int a[] = new int[n] ;
  
     for(int i = 0; i < n; i++){
       a[i] = sc.nextInt();
     }

      int max = a[0];
  for( int i = 1 ; i < a.length ; i++){
    
    if(a[i] > max){
      max = a[i];
    }
  }

    System.out.println("largest element is:" +max);

  }
}