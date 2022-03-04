import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem = num % 2 == 0;

        if(rem == 1)
        {
            System.out.println("Number is odd" +num);
        }
        else
        {
             System.out.println("Number is even" +num);
        }

    }
}