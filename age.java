package javaapplication4;
import java.util.*;
import java.util.Scanner;
class person
{
	int age;
	String name;
	person(String n1, int a)
	{
            name = n1;
            age= a;
	}
}

class sort_name implements Comparator
{
	public int compare(Object p1,Object p2)
	{
		person a=(person)p1;
		person b=(person)p2;
		return a.name.compareTo(b.name);
	}
}
class sort_age implements Comparator
{
	public int compare(Object p1,Object p2)
	{
		person a=(person)p1;
		person b=(person)p2;
		if(a.age==b.age)
			return 0;
		else if(a.age>b.age)
			return 1;
		else
			return -1;
	}
}

class age
{
	public static void main(String args[])
	{
		ArrayList list=new ArrayList();
                Scanner sc=new Scanner(System.in);
                Scanner sc1=new Scanner(System.in);
                System.out.println("Enter Name & Age of 4 Persons : ");
                for(int i=0;i<4;i++)
                {                 
                    String s=sc1.nextLine(); 
                    double age=sc.nextInt();
                    list.add(new person(s, (int) age));
                }
		System.out.println("Order by age : ");
		Collections.sort(list,new sort_age());
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			person st=(person)itr.next();
			System.out.println(st.name+" "+st.age);
		}
		System.out.println("Sorting by Name");
		Collections.sort(list,new sort_name());
		Iterator itr2=list.iterator();
		while(itr2.hasNext())
		{
			person st=(person)itr2.next();
			System.out.println(st.name+" "+st.age);
		}

	}
}