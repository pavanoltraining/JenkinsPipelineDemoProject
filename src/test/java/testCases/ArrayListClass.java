package testCases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {
		
		/*Collection --Root Interface
		 * List,Set,Queue --  child Interfaces
		 * Collections is a predefined class and its methods(sort,reverseOrder,shuffle) are used by the classes under the above interfaces
		 * List Interface - ArrayList, LinkedList, Vector,Stack classes------stack is a subclass of vector
		 * Set Interface - HashSet, LinkedHashSet classes and SortedSet subInterface
		 * SortedSet subInterface  --  TreeSet
		 * Queue Interface --- PriorityQueue Class and Deque subInterface
		 * Deque subInterface--ArrayDeque
		 * LinkedList also implements Deque which implements Queue, so the methods in Queue interface is also applicable for LinkedList
		 * 
		 * 1. Insertion order is preserved
		 *2. Duplications are allowed
		 *3. it is based on the index values
		 *4. heterogeneous(Different data types) datas are allowed
		 *5. null is also accepted
		 *6. it is preferred for more retrieval operations(Get method)
		 *manipulation is slow because a lot of shifting needs to occur if any element is removed from the array list.
		 *7.. It inhibits a list type data structure 
		 */
		/*Wrapper classes
		 * byte  Byte
		 * short  Short
		 * int   Integer
		 * long   Long
		 * float   Float
		 * double   Double
		 * char   Character
		 * boolean   Boolean
		 * 
		 * ArrayList  and Vector handles only objects... so the need for wrapper classes arises
		 * 
		 */
		
		
		// default size --10 , once it reaches the size , it will create a new object with new size and copy the
		//existing object and delete the old one
		
		ArrayList<String> al = new ArrayList<String> ();
		al.add("Rubi");
		al.add("Bala");
		al.add("Jaya");  // adding string
		al.add(1,"Shanthi");  //adding by index, string
		Iterator <String> itr= al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
/*	    for (String s:al) {
		System.out.println(s);
	}
*/
		System.out.println("\n");
		Collections.sort(al);
		System.out.println(al);
		
		ArrayList<String> all= new ArrayList<String>();
		all.addAll(al);
		Collections.sort(all,Collections.reverseOrder());
		System.out.println(all);
		
		System.out.println(all.equals(al));
		
		Collections.shuffle(al);
		System.out.println(al);
		

		System.out.println("\n");
		ArrayList alo = new ArrayList ();
		alo.add("Rubi");
		alo.add("10/05/2005");
		alo.add(67);  
		alo.add(1,101); 
		alo.add('A');
		alo.add(true);
		alo.add(40.65f);
		alo.addAll(al);
	//	alo.removeAll(al);
		System.out.println("alo Size:"+alo.size());
		
/*		//for loop
		for (int i=0;i<alo.size();i++) {
			System.out.println(alo.get(i));
		}
		//for each loop
		
		for(Object o:alo) {
			System.out.println(o);
		}
*/
		
		Iterator  itro= alo.iterator();
		while (itro.hasNext()) {
			System.out.println(itro.next());
		}
		
		
		System.out.println("\n");
		System.out.println(alo.contains(67));
		System.out.println(alo.isEmpty());
	

		System.out.println("\n");
		ArrayList <Integer> al1= new ArrayList <Integer>();
		al1.add(10);
		al1.add(30);
		al1.add(40);  // adding int values
		al1.add(1,20);  //adding by index, int values
		al1.add(null);
		Iterator <Integer> itr1= al1.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("\n");

		System.out.println(al1.get(2));
		System.out.println(alo.remove(2));
		System.out.println(alo);
				
		al.set(2, "Balasubramani");		
		
		
		System.out.println("\n");

		System.out.println(al);
		
		//converting array to ArrayList
		String arr[]= {"dog","cat","Elephent"};
		ArrayList as = new ArrayList (Arrays.asList(arr));
		System.out.println(as);
		
		ArrayList arl = new ArrayList();
		arl.add(101);
		arl.add("Rubi");
		arl.add('A');
		arl.add(true);
		arl.add(45.67);
		arl.add(null);
		arl.add(null);
		
		System.out.println(arl);
		
		arl.remove(null);
		arl.remove(true);
		System.out.println(arl);
		
		
		Object []ar = arl.toArray();
		
		for(Object o:ar) {
			System.out.println(o);
		}
		
		System.out.println(arl.equals(as));  //equals method is used to compare two lists
		
		
		
	

}
}
