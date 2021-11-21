package com.javaex.practice03;
import java.util.Scanner;

public class Ex19 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		int bank=0;
		
		while(true) {
		System.out.println("--------------------------------");
		System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 ");
		System.out.println("--------------------------------");
		System.out.println("선택> ");
		
		int num=sc.nextInt();
		
		if(num==1) {
			System.out.print("예금액> ");
			bank=bank+sc.nextInt();
		}else if(num==2) {
			System.out.print("출금액> ");
			bank=bank-sc.nextInt();
		}else if(num==3) {
			System.out.println("잔고> "+bank);
		}else if(num==4) {
			System.out.println("종료 ");
			break;
		}else {
			System.out.println("다시 입력해주세요 ");
		}
		System.out.println();

	}
		sc.close();
}
}
