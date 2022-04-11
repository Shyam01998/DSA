import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int row = 1, sp = n/2, st = 1;
    while(row <= n){
        //code for each row
        //1.space
        for(int i = 1; i <=sp; i++){
            System.out.print("\t");
        }
        //2.space
         for(int i = 1; i <= st; i++){
             if(i == 1 || i == st   ){
            System.out.print("*\t");
             }else{
            System.out.print("\t");
             }
         }
         //Move to next line
         System.out.println();

         if(row <= n/2){
             sp = sp - 1;
             st = st + 2;
         }else{
             sp = sp + 1;
             st = st - 2;
         }
         
         row++;
    
    } 
 }
}