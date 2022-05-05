import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args)  {
    

        ArrayList<String> res = getMazePaths(0,0,2,2) ;
        System.out.println(res);   
        }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        if(sr > dr || sc > dc){
            ArrayList<String> base = new ArrayList<>();
            return base;
        }

        ArrayList<String> hPath = getMazePaths(sr,sc+1,dr,dc);//H movement
        ArrayList<String> vPath = getMazePaths(sr+1,sc,dr,dc);//V movement

        ArrayList<String> myPath = new ArrayList<>();
        for(String path:hPath ){
            myPath.add("h" + path);
        }

        for(String path:vPath ){
            myPath.add("v" + path);
        }
        return myPath;
    }

}