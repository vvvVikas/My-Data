package com.p1;

import java.util.Arrays;

public class ClassC {

	public static void main(String[] args) {
		int[] a= new int[] {1, 2, 5, 8};
		
		int sum=0;
		for (int b :a) {
			System.out.print("   "+b);
		}
		System.out.println();
		for (int i=0; i<=a.length-1; i++) {
			System.out.print(a[i]+"   ");	
		}
		System.out.println();
		//reverse it
		int[] rev= new int[3];
		for(int j=a.length-1; j>=0;j--) {
						
		System.out.println("rev array =="+rev);
			
			System.out.print(a[j]+"   ");
			
					}
		//System.out.print(Arrays.toString(a));
		
		
		//Sum of array elements
		
		System.out.println();
		for (int i=0; i<=a.length-1; i++) {
			sum=sum+a[i];
			
		}
		System.out.println("sum of all elements"+sum);
		//avg  of array elements
		double avg= sum/a.length;
		System.out.println("avg of all elements"+avg);

	}

}
