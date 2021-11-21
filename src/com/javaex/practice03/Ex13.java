package com.javaex.practice03;
import java.util.Scanner;

public class Ex13 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);

		int sum=0;
		
		System.out.println("숫자를 입력하세요 ");
		int x=sc.nextInt();
		for(int i=x; i>=1; i--) {
			sum=sum+i;
		}
		System.out.println("합계: "+sum);
		sc.close();
	}

}
