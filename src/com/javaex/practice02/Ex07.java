package com.javaex.practice02;
import java.util.Scanner;

public class Ex07{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("첫번째 숫자: ");//a
		int n1=sc.nextInt();
		System.out.println("두번째 숫자: ");//b
		int n2=sc.nextInt();
			
		if(n1>n2){
			System.out.print("몫: "+n1/n2);
			System.out.print("나머지: "+n1%n2);
		}
		else if (n2<n1){
			System.out.println("몫: "+n2/n1);
			System.out.println("나머지: "+n2%n1);
		}else {
			System.out.print(" ");
		}
		sc.close();
	}
}
