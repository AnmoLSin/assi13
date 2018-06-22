package javaapplication4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class sort1 {
	public static void main(String[] args) {
        ArrayList list=new ArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 5 String elements : ");
        for(int i=0;i<5;i++){
            String s=sc.nextLine();
            list.add(s);
        }
        Collections.sort(list);
        System.out.print("Sorted Array : ");
        System.out.println(list);
        list.clear();
        System.out.print("Enter 5 Integer elements : ");
        for(int i=0;i<5;i++){
            int s=sc.nextInt();
            list.add(s);
        }
        Collections.sort(list);
        System.out.print("Sorted Array : ");
        System.out.println(list);
	}
}