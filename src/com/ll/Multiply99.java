package com.ll;

public class Multiply99 {
	

	public static void main(String[] args) {
		// 调用方法
		multiply99_1();
	}
	
	public static void multiply99_1() {
		int a,b,c;
		for(a = 1;a<10;a++) {
			for(b = 1;b<=a;b++) {
				c = b*a;
				System.out.print(b+"*"+a+"="+c+"  ");
				if(b == a) {
					System.out.println();
				}
			}
		}
	}
	
	public static void multiply99_2() {
		for(int i=1; i <= 9; i++ ) {
			for(int j=1; j <= i; j++) {
				System.out.print(i + " * " + j + " = " + i*j);
			 }
			System.out.println();
		}
	}

}
