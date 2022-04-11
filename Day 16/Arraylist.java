import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		 ArrayList<Integer> al = new ArrayList<Integer>();
		
		 System.out.println(al +" "+al.size());

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al +" "+al.size());
		for(int i =0 ; i< al.size();i++){
			System.out.println(al.get(i));
		}
		System.out.println("---------------------------------------");

		for(int v1 : al){
			System.out.println(v1);
		}
		System.out.println("---------------------------------------");
		int rele = al.remove(0);
		System.out.println("remove ele :" + rele + " list :"+al);


		
	}

}