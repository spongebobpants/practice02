package com.javaex.practice03;
import java.util.Scanner;

public class Ex12 {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int x;
	int fac=1;
	
	System.out.println("숫자를 입력하세요 ");
	x=sc.nextInt();
	
	for(int i=x; i>=1; i--) {
		fac=fac*i; 
	}
	System.out.println(fac);
	
	sc.close();
		
	}//true는 무한으로 도는 것

}