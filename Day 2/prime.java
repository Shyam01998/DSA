import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
       
       int num = scn.nextInt();
       int flag = 1; //1-> prime

       for(int i = 2; i <= (num-1); i++)
      //  for(int i = 2; i <= (num/2); i++) //another way to find prime
      //  for(int i = 2; i * i <= num; i++) //another way to find prime
       {
         if(num % i == 0)
         {
           flag = 0;//0 ->not prime
           break;
         }
       }
       if(flag == 1){
         System.out.println("prime");
       }else{
         System.out.println("not prime");
       }
  
   }
  }