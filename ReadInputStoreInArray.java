package edu.jsp.Programming;

import java.util.Scanner;

public class ReadInputStoreInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print("Enter the number at "+i+" th index : ");
			arr[i]=sc.nextInt();
		}
		System.out.println("========================================");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("number at "+i+" th index is : "+arr[i]);
		}
	}
}
