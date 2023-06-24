package assignment1;

public class ThirdLargest {

	static int third(int[] arr) {
		Integer first= null;
		Integer second= null;
		Integer third= null;
		
		for(Integer n : arr) {
			if(n.equals(first) ||n.equals(second) ||n.equals(third))	continue;
			
			if(first==null || n>first) {	//and not if(n>first || first==null), as in case of null val. first can not be compared
				third= second;
				second= first;
				first= n;
			}
			else if(second==null || n>second) {
				third= second;
				second= n;
			}
			else if(third==null || n>third)
				third= n;
		}
		
		return (third==null)? first : third;
	}
	
	public static void main(String[] args) {
		int[] arr= {3,5,2,8,9};
		System.out.println(third(arr));

	}

}
