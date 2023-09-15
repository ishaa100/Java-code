
   

import java.util.*;

public class Asc {
	public static void main(String args[])
	{
		ArrayList<String>
			list = new ArrayList<String>();

		
		list.add("Isha");
		list.add("Aggarwal");
		list.add("Hridey");
		list.add("IshaAggarwal");
		list.add("A connection");

		
		System.out.println("Unsorted ArrayList: "
						+ list);

		
		Collections.sort(list);

		
		System.out.println("Sorted ArrayList "
						+ "in Ascending order : "
						+ list);
	}
}

    