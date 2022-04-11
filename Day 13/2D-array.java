import java.util.*;
  
  public class Main{

    public static void input(int mat[][] , Scanner sc){
      for(int r = 0; r < mat.length; r++){
         for(int c = 0; c < mat[0].length; c++ ){
             mat[r][c] = sc.nextInt();
       }
     }
    }

    public static void display(int mat[][]){
       for(int r = 0; r < mat.length; r++){
          for(int c = 0; c <mat[0].length; c++ ){
             System.out.print(mat[r][c]+ " ");
          }
         System.out.println();
      }
    }
  
  public static void main(String[] args) {
    // write your code here  
    Scanner sc = new Scanner(System.in);
    int nr = sc.nextInt();
    int nc = sc.nextInt();
    int mat[][] = new int[nr][nc];

    input(mat,sc);
    display(mat);
    
   }
  }