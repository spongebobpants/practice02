package com.javaex.practice03;

public class Ex06 {
	public static void main(String []args) {
		int i=0;
		while(i<=100) {
			i=i+1;
			if(i%5==0 && i%7==0){
				System.out.println(i);
			}
		}
	}

}
