package assignment1;

import java.util.*;

public class NthLargestElement {

	public static int nth(int[] arr, int n) {
		TreeSet<Integer> set= new TreeSet<>();		//unique sorted elements
		for(int e : arr) {
			set.add(e);
		}
		
		int[] temp= new int[set.size()];
		int i=0;
		for(int val : set) {						//storing the tree elements back into array
			temp[i++]= val;
		}
		
		if(temp.length<n)
			return temp[temp.length-1];			//return largest element when nth largest does not exist
		return temp[n-1];
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,2,3,4,4,6,7};
		System.out.println(nth(arr, 7));
	}

}
