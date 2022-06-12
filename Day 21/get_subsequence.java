import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        ArrayList<String> res = getss(str);
        System.out.println(res);
    }

    public static ArrayList<String> getss(String str) {
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        String res = str.substring(1);
        char ch = str.charAt( 0);
        ArrayList<String> rres = getss(res);

        ArrayList<String> myList = new ArrayList<>();
        //exc
        for(String str1 :rres){
            myList.add(str1);
        }
        //inc
        for(String str1 : rres){
            myList.add(ch + str1);
        }

        return myList;
    }

}