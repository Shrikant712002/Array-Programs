package edu.jsp.Programming;

public class PrimeNumbersFromArray {
	public static void main(String[] args) {
		int arr[]= {645,4,31,42,15,77,3,55,5,17,11};
		for(int a:arr) {
			int n=a;
			int count = 0;
			for(int i=1;i<=a;i++) {
				if(a%i==0) {
					count++;
				}
		      }
			if(count==2) {
				System.out.println(a);
		 	}
	     }		
      }
   }
