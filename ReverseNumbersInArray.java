package edu.jsp.Programming;

public class ReverseNumbersInArray {
	public static void main(String[] args) {
		int ar[]= {645,786,5874,632,753,159};
		for(int a:ar) {
			int temp=a;
			int rev=0;
			while(temp>0) {
				int last = temp%10;
				rev = rev*10+last;
				temp=temp/10;
			}
			System.out.println(rev);
		}
	}
}
