package edu.jsp.Programming;

public class MergeTwoArray {
	public static void main(String[] args) {
		int arr1[]= {625,82,28,323,49,496,211,121,5,6};
		int []arr2 = {2,6,45,72,15,98,36};
		int merge[] = new int[arr1.length+arr2.length];
		int index = arr2.length-1;
		for(int i=0;i<merge.length;i++) {
			if(i<arr1.length) {
				merge[i]=arr1[i];
			}
			else {
				merge[i]=arr2[index--];
			}
		}
		for(int a:merge) {
			System.out.println(a);
		}

	}
}
