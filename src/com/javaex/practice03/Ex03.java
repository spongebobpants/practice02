package com.javaex.practice03;

public class Ex03 {
	public static void main (String []args) {
		int x,y;//전수 선언
		for(x=0; x<4; x++) {//밖의 for문, x가 0일때 4보다 작을 때 true
			for(y=2; y>=0; y--) {//y가 2일  y가 0보다 크거나 같을 때 줄어
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}