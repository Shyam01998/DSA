import java.util.*;
public class Main{

public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int num = sc.nextInt();
   int pos = 1;
   int sum = 0;

   while(num != 0)
   {
     int digit = num % 10;
     
     int v1 = pos * (int)Math.pow(10 , digit - 1);
     sum += v1;
     pos++;
     num = num/10;
   }

   System.out.println(sum);
 }
}
