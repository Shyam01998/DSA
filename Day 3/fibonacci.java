import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int a = 0;
      int b = 1;
      int c;

      for(int i=1; i <= num; i++)
      {
        
        c = a + b;  
        System.out.println(a);
        a = b;  
        b = c;   


      }
   }
  } 