package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class collection1 {
	public static void main(String args[])
	{
		ArrayList<String> alist =new ArrayList();                     //read and write fast 
		alist.add("payal");
		alist.add("samrudhi");
		for(String s:alist)
		{
			System.out.print(s+"\t");
		}
		for(String s:alist)
		{
			System.out.print(s+"\t");
		}
		System.out.println();
		LinkedList<String> llist=new LinkedList();                  //insertion fast
		llist.add("riya");
		llist.add("siya");
		for(String s:llist)
		{
			System.out.print(s+"\t");
		}
		HashSet<String> hset=new HashSet();                          //unique values and random order  
		hset.add("payal");
		hset.add("payal");
		hset.add("jain");
		for(String s:hset)
		{
			System.out.print(s+"\t");
		}
		LinkedHashSet<String> lhset=new LinkedHashSet();              //unique value and order maintain
		lhset.add("jain");
		lhset.add("jain");
		lhset.add("payal");
		for(String s:lhset)
		{
			System.out.print(s+"\t");
		}
		TreeSet<String> tset=new TreeSet();                            //sorted and unique values
		tset.add("payal");
		tset.add("jain");
		for(String s:tset)
		{
			System.out.print(s+"\t");
		}
		
		
		
		
		
		
		
		
		
	}
}
