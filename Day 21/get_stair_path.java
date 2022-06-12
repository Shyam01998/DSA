//proactive approach
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();

        ArrayList<String> Allpath = getStairPath(n);
        System.out.println(Allpath);

    }
   public static ArrayList<String> getStairPath(int n){
        if(n == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> myList = new ArrayList<>();
        if(n >= 1){ // 1 len 
            ArrayList<String> paths = getStairPath(n-1);
            for(String path : paths){
                myList.add(1+path);
            }
        }

        if(n >= 2){ // 2 len 
            ArrayList<String> paths = getStairPath(n-2);
            for(String path : paths){
                myList.add(2+path);
            }
        }

        if(n >= 3){ // 3 len 
            ArrayList<String> paths = getStairPath(n-3);
            for(String path : paths){
                myList.add(3+path);
            }
        }

        return myList;
    }
}

//reactive approach
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args)  {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();

        ArrayList<String> Allpath = getStairPaths(n);
        System.out.println(Allpath);

    
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        if(n < 0){
            ArrayList<String> base = new ArrayList<>();
            return base;
        }

        ArrayList<String> myList = new ArrayList<>();
        ArrayList<String> path1Len = getStairPaths(n - 1);
        ArrayList<String> path2Len = getStairPaths(n - 2);
        ArrayList<String> path3Len = getStairPaths(n - 3);
        for(String path : path1Len ){
            myList.add(1 + path);
        }

         for(String path : path2Len ){
            myList.add(2 + path);
        }

         for(String path : path3Len ){
            myList.add(3 + path);
        }
  
        return myList;
    
    }
}