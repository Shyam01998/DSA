import java.util.Scanner;
class main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++)
        int n = sc.nextInt();
        int count = 0;
        for( j = 2; j <= (n - 1); j++)
        if(n % j == 0){
            count++;
            break;
        }
        if(count == 0){
            System.out.println(" prime");
        }else{
             System.out.println(" not prime");
        }
    }
}