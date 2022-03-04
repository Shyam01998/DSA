import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();

  for(int fact = 2; fact * fact <= n; fact++)
  {
    while ( n % fact == 0 ) {
      n = n / fact;
      System.out.print(fact+" ");
    }
    
  }
  if( n != 1)
    {
      System.out.println(n);
    }
 }
}   