package ashok;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Hashdemo {
	public static void main(String[] args) {
		

//	HashSet<Integer> s=new HashSet<>();  
//	for(int i = 0; i <= 100;i++) {
//		if(i  % 2 == 0) {
//	s.add(i);
//	}
//	}
	
//	s.add("d");
//	s.add("r");
//	s.add("hg");
//	s.add("c");
	
	
//System.out.println(s);
	//System.out.println(s.add("d"));
	//System.out.println(s.add("d"));
		TreeSet ts = new TreeSet();
		ts.add("ashok");
		ts.add("reddy");
		ts.add("anil");
	//	ts.add(12);
    
		// TODO Auto-generated method stub
     Iterator<Integer> itr =  ts.iterator();
     while(itr.hasNext()) {
    	 System.out.println(itr.next());
     }
	}
   
}
