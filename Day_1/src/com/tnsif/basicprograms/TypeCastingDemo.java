//to demonstrate type casting
package com.tnsif.basicprograms;

public class TypeCastingDemo {

	public static void main(String[] args) {
		//widening type casting //Implicit
		
		int a=30;
		System.out.println(a);
		long s=a;
		System.out.println(s);
		
		float f=23.8557f;
		System.out.println(f);
		double d=f;
		System.out.println(d);
		
		//narrowing type casting //Explicit
		int num=23;
		System.out.println(num);
		short s1=(short)num;
		System.out.println(s1);
		
		double no=23.7868979789797979d;
		System.out.println(no);
		float f1=(float)no;
		System.out.println(f1);
		
	}

}
