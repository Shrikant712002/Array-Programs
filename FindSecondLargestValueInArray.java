package edu.jsp.Programming;

public class FindSecondLargestValueInArray {
	public static void main(String[] args) {
		int arr[]= {70,234,13,4223,43,84};
		int fl = Integer.MIN_VALUE;
		int sl = Integer.MIN_VALUE;
		for(int a:arr) {
			if(a>fl) {
				sl=fl;
				fl=a;
			}
			else if(a>sl) {
				sl=a;
			}
		}
		System.out.println(sl+" is a second largest value");
	}
}
