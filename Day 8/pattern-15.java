import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int row = 1, sp = n/2, st = 1 , num = 1;
    while(row <= n){
        //code for each row
        //1.space
        for(int i = 1; i <=sp; i++){
            System.out.print("\t");
        }
        //2.star
            int tmp = num;
         for(int i = 1; i <=st; i++){
            System.out.print(tmp+"\t");
            if(i <= st/2){
                tmp = tmp + 1;
            }else{
                tmp = tmp - 1;
            }
         }
           
         //Move to next line
         System.out.println();

         if(row <= n/2){
             sp = sp - 1;
             st = st + 2;
             num = num + 1 ;
         }else{
             sp = sp + 1;
             st = st - 2;
            num = num - 1 ;
         }
         
         row++;
    
    } 
 }
}