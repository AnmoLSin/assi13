package javaapplication4;

import java.util.*;
import java.util.Scanner;
            class date 
            {
                HashMap dd = new HashMap();
                HashMap mm = new HashMap();               
                date() {
                dd.put("00","Hundered");
		dd.put("01","First");
		dd.put("02","Second");
		dd.put("03","Third");
		dd.put("04","Fourth");
		dd.put("05","Fifth");
		dd.put("06","Sixth");
		dd.put("07","Seventh");
		dd.put("08","Eighth");
		dd.put("09","Nineth");
		dd.put("10","Tenth");
		dd.put("11","Eleven");
		dd.put("12","Tweleve");
		dd.put("13","Thirteen");
		dd.put("14","Fourteen");
		dd.put("15","Fifteen");
		dd.put("16","Sixteen");
		dd.put("17","Seventeen");
		dd.put("18","Eighteen");
		dd.put("19","Nineteen");
		dd.put("20","Twenty");
		dd.put("21","Twenty One");
		dd.put("22","Twenty Two");
		dd.put("23","Twenty Three");
		dd.put("24","Twenty Four");
		dd.put("25","Twent Five");
		dd.put("26","Twenty Six");
		dd.put("27","Twenty Seven");
		dd.put("28","Twenty Eight");
		dd.put("29","Twenty Nine");
		dd.put("30","Thirty");
		dd.put("31","Thirty One");
                
                mm.put("01", "January");
		mm.put("02", "February");
		mm.put("03", "March");
		mm.put("04", "April");
		mm.put("05", "May");
		mm.put("06", "June");
		mm.put("07", "July");
		mm.put("08", "August");
		mm.put("09", "September");
		mm.put("10", "October");
		mm.put("11", "November");
		mm.put("12", "December");
	}

	String in_english(String s) {
		String dd1=s.substring(0,2);
		String mm1=s.substring(3,5);
		String yyyyl=s.substring(6,8);
		String yyyyr=s.substring(8,10);
		return (dd.get(dd1)+" of "+mm.get(mm1)+" "+dd.get(yyyyl)+" "+dd.get(yyyyr));
	}

	public static void main(String args[]) {
		date d=new date();
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter Today's Date in dd-hh-yyyy format : ");
                String D=sc.nextLine();
                String d1=d.in_english(D);
                System.out.print("Date after Conversion : ");
		System.out.println(d1);
	}
}