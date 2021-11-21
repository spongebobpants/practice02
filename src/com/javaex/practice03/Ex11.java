package com.javaex.practice03;
import java.util.Scanner;

public class Ex11 {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("숫자를 입력하세요" );
	
	int num=sc.nextInt();
	int sum=0; // 초기
		//짝수의 합 
		if(num%2==0) {
			for(int i=0; i<=num; i+=1)
			sum=sum+num;
		}else{
			for(int i=1; i<=num; i+=2)
			sum=sum+num;
	}
		System.out.println(sum);
	sc.close();
}
}