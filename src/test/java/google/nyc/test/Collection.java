package google.nyc.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Collection {
	
	//Array: advantage -> fastest -> limitation -> length is fixed -> to overcome -> List
	
	//List: advantage -> List size is dynamic, allow as many and duplication, faster for searching data (follow index theory)
	//List: disadvantage -> list always allow null value and duplication but we may not want it sometimes (2,2,2)
	//List: disadvantage -> slow to add or remove data because have to rearrange index
	//List 2,3,4,5,6
	//search 4 -> fast
	//List -> add or remove data -> rearrange the index
	//0,1,2,3,4 -> 0,1,2,3,4,5
	//2,3,4,5,6 -> 8,2,3,4,5,6
	
	//List type: Array List (index theory), Link List (linked theory), Vector (old + index theory), Stack 
	
	//Vector -> Old (legacy) --> List 

	
	public static void main(String[] args) {
		//List myList = new List(); //List is an interface/abstract (incomplete person), only declare but not implement, cannot instantiate (create) object in basic java
		//so have to upcast, create object from interface with help of class, upcasting polymorphism 
		//upcast with array list, link list, and vector
		List<String> myList = new Vector<>(); // no data type -> List can not handle primitive data type, so put the data type, put angle bracket with non primitive and wrapper class
		//one angle bracket java understand both side so no need to put <String> on right side
		int a = 10;
		int [] b = {20};
		
		List<String> myList1 = new ArrayList<>();
		List<String> myList2 = new LinkedList<>();
		
		// OR we can declare another way, but both side List is not possible
		
		Vector<String> myList3 = new Vector<>();
		ArrayList<String> myList4 = new ArrayList<>();
		LinkedList<String> myList5 = new LinkedList<>();
		
		//List disadvantage ==> always allow duplicate >>> to over come ==> Set (never allow duplicate)
		
		//Set(interface) ==> HashSet(class)
		//Set(interface) ==> LinkedHashSet(class)
		//Set(interface) ==> TreeSet(class)
		
		Set<String> myset= new HashSet<>();//S
		HashSet<String> myset5 = new HashSet<>();
		myset5.add("google");
		myset5.add("yahoo");
		System.out.println(myset5);
		
		Set<String> myset1 = new LinkedHashSet<>();//S
		LinkedHashSet<String> myset6 = new LinkedHashSet<>();
		
		Set<String> myset2 = new TreeSet<>();//S
		TreeSet<String> myset7 = new TreeSet<>();
	
	
	}

	
	
	
	}
	
	
