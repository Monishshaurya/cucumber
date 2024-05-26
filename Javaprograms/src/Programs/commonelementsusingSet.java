package Programs;

import java.util.HashSet;
import java.util.Set;

public class commonelementsusingSet {

	public static void main(String[] args)
	{

		int[] arr1
        = { 1, 4, 9, 16, 25, 36};
		int[] arr2 = { 100, 9, 64, 7, 36, 5, 16, 3, 4, 1 };
		
		 Set<Integer> set1 = new HashSet<>();
	        Set<Integer> set2 = new HashSet<>();
	 
	        // Adding elements from array1
	        for (int i : arr1) {
	            set1.add(i);
	        }
	 
	        // Adding elements from array2
	        for (int i : arr2) {
	            set2.add(i);
	        }
	 
	        // use retainAll() method to
	        // find common elements
	        set1.retainAll(set2);
	        System.out.println("Common elements- " + set1);
		
		
	}

}
