  public static void reverse(int []a,int i, int j){
    int lo = i;
    int hi = j;
      while(lo < hi){
        int temp = a[lo];
        a[lo] = a[hi];
        a[hi] = temp;

        lo++;
        hi--;
      }
    }

  public static void rotate(int[] a, int k){
    // write your code here

     
      //true rotation
      k = k % a.length;

       //negative rotation
      if(k < 0){
        k = k + a.length; 
      }
    
        //reverse p1
      reverse( a , 0 , a.length - k - 1);
       //reverse p2
      reverse( a , a.length - k, a.length - 1);
       //reverse complete array
      reverse( a , 0 , a.length - 1);
      }