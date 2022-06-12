import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
      int  destBase  = scn.nextInt();

      int ans = aB2aB(n , sourceBase,destBase);
      System.out.println(ans);
    } 

    public static int aB2aB(int n , int sourceBase, int destBase){
      int dec = anyBase2dec(n,sourceBase);
      int dn = dec2anyBase(dec,destBase);
      return dn;
    }  

     public static int dec2anyBase(int n, int b){
       // write code here
       int ans = 0;
       int mul = 1;

       while(n > 0){
           int r = n % b;
           n = n / b;
           ans = ans + r * mul;
           mul = mul * 10;
       }
       return ans;
   }

    public static int anyBase2dec(int n, int b){
      // write your code here
      int ans = 0;
      int mul = 1;

      while(n > 0){
  
        int d = n % 10;
        n = n/10;
        ans = ans + d * mul;
        mul = mul * b;
      }

      return ans;
   }

     
  }