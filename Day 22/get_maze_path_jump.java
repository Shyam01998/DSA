import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        System.out.println(getMazePaths(0,0,n-1,m-1));

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
        
            //  if(sr > dr || sc > dc){
            // ArrayList<String> base = new ArrayList<>();
            // return base;
            // }

            ArrayList<String> paths = new ArrayList<>();
            //horizontal moves
            for(int jump = 1; sc+jump <= dc; jump++){
                ArrayList<String> hpaths = getMazePaths(sr , sc + jump,dr,dc );
                for(String s : hpaths){
                    paths.add("h" + jump + s);
                }
            }

            //vertical moves
             for(int jump = 1; sr+jump <= dr; jump++){
                ArrayList<String> vpaths = getMazePaths(sr+jump , sc,dr,dc );
                for(String s : vpaths){
                    paths.add("v" + jump + s);
                }
            }

             //diagonal moves
             for(int jump = 1; sr + jump <= dr && sc + jump <= dc ; jump++){
                ArrayList<String> dpaths = getMazePaths(sr+jump, sc+jump,dr,dc );
                for(String s : dpaths){
                    paths.add("d" + jump + s);
                }
            }
            return paths;
    }

}