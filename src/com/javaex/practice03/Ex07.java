package com.javaex.practice03;
import java.util.Scanner;

public class Ex07 {
	public static void main (String []args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("숫자를 입력하세요 ");
		num=sc.nextInt();
			for(int y=0; y<=num; y++) {
				for(int x=1; x<y; x++) {
					System.out.print(x);
				}
				System.out.println("");
			}
		sc.close();
		
		}
	}
