import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();

    // if(a > b && a > c)
    // {
    //   System.out.println(a);
    // }
    // else if(b > a && b > c )
    // {
    //   System.out.println(b);
    // }
    // else
    // {
    //   System.out.println(  c);
    // }

    //Efficient code//

    if(a > b){
      // a is larger
      if(a > c){
        //a is larger as well larger than c a > c
        System.out.println(a);
      }else{
        // c is larger
        System.out.println(c);
      }
    }else
    if(b > c){
      //b is larger
      System.out.println(b);
    }
    else{
      //c is larger
      System.out.println(c);
    }

    
  }
}