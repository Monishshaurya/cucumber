package Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class maxnumber {

	public static void main(String[] args) {
		
		
		int a[]= {4,7,1,3,8,9};
		List<Integer>list=new ArrayList();
		for(int i=0;i<a.length;i++)
		{
			list.add(a[i]);
			
		}

		int max=Collections.max(list);
		System.out.println(max-1);
		
		
	}

}
