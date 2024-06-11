package edu.jsp.Programming;

public class PerfectNumberFromArray {
	public static void main(String[] args) {
		int arr[]= {625,82,28,323,49,496,211,121,5,6,};
		for(int a:arr) {
			int sum = 0;
			int num = a;
			for(int i=1;i<num;i++) {
				if(num%i==0) {
					sum+=i;
				}
			}
			if(sum==num) {
				System.out.println(num);
			}
		}
	}
}
