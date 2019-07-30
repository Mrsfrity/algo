package com.ll;

public class Multiply99 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
