package com.p1;

public class ClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double F= 32;
		double C= 5.0*(F-32.0)/9.0;
		System.out.println(C);
		
		//Armstrong ex 153  // rev the number
		int c=0;
		int a=153;
		int rev=0;
		while(a>0) {
		int mod = a%10; //mod 3 
	
		
		c= c+mod*mod*mod;
		rev= rev*10+mod;
		a=a/10;
		}
		System.out.println(c);
		System.out.println(rev);
		
	//==============================================================	
		//prime or not
		int a2=18;
		int b2=0;
		for(int i2=2;i2<=a2-1;i2++) {
			if (a2%i2==0) {
				b2++;
			}
		}
		if (b2==0) {
			System.out.println("a2 is prime");
		} else {
			System.out.println("a2 not prime");
		}
		
		//========================----------------------===============
		//maximum number from array
		int a3[]= {155,3,4,6,2,5,55};
		int max=0;
		for (int i3=0; i3<a3.length;i3++) {
			if (a3[i3]>max) {
				max=a3[i3];
			}
		}
		System.out.println("maximum=="+max);
		
		//============================
		//reverse the string
		
		String s1="vikas";
		StringBuilder sb=new StringBuilder();
		sb.append(s1);
		sb.reverse();
		System.out.println(sb);
		
		
		// reverse with for loop
		String pm="narendra modi";
		String reverse="";
		char modi[]=pm.toCharArray();
		for (int i=modi.length-1; i>=0;i--) {
			reverse=reverse+modi[i];
			
		}System.out.println("reverse name=="+reverse);
		
		//string length without using length()method
		String len= "abcdef";
		int length=0;
		char l[]=len.toCharArray();
		for (char l1:l) {
			length++;
			
		}
		System.out.println("length without length()method =="+length);
	
	
	
	
	
	}
	
}
