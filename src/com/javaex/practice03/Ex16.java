package com.javaex.practice03;
import java.util.Scanner;

public class Ex16 {
	public static void main(String []args) {
	System.out.println("숫자를 입력하세요 : ");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int sum=0;

		for(int i=1; num>=i; i++) {
			if(i%5==0) {
				sum=sum+i;
				System.out.println(sum);
			}
		}System.out.println("5의 배수의 합은"+sum);
			
	sc.close();
	}
}
