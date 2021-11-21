package com.javaex.practice03;

public class Ex05 {
	public static void main(String []args) {
		int i=1;
		boolean flag=true;
		
		while(flag) {
			if(i>=5) {
				flag=false;
			}
			System.out.println(i);
			i=i++;
		}
	}
}

