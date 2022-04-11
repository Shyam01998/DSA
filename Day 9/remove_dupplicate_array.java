import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Write your code here
         int a[] = {1,2,2,4,5,5,6,6,7,7};
         int n = a.length;
         int temp[] = new int[n];
         int j = 0;

        for(int i = 0; i < n - 1; i++){
           if(a[i] != a[i + 1]){
            temp[j] = a[i];
            j++;
          }
        }

        temp[j] = a[n - 1] ;

        for(int i = 0; i < temp.length; i++){
            System.out.println(temp[i]+"");
        }

    }
}

//another approach
//without using temp array we can remove duplicate from sorted array
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Write your code here
         int a[] = {1,2,2,4,5,5,6,6,7,7};
         int n = a.length;
         //int temp[] = new int[n];
         int j = 0;

        for(int i = 0; i < n - 1; i++){
           if(a[i] != a[i + 1]){
            a[j] = a[i];
            j++;
          }
        }

        a[j] = a[n - 1] ;

        for(int i = 0; i < j; i++){
            System.out.println(a[i]+"");
        }

    }
}

//Another approach
import java.util.*;


public class Main {

    public static void main(String[] args) {
        // Write your code here
         int a[] = {1,2,5,4,5,5,8,6,7,7};
         int n = a.length;

        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i < n; i++){
            hs.add(a[i]);
             
        }
        System.out.println(hs);


    }
}

