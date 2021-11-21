package com.javaex.practice03;
import java.util.Scanner;

public class Ex10 {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("숫자를 입력하세요 ");
	
	int[]num=new int[5]; //타입:정수 변수명: arr / new 타입length:5
	int max=0;
	
	for(int i=0; i<num.length; i++) {
		num[i]=sc.nextInt();
		if(num[i]>max) {
			max=num[i];//i를 max에 대입하면 max의 초기값은 더이상 0이 아니라 그 전값이
						//이는 true가 되고 
		}
	}System.out.println("최대값은"+max);
	sc.close();
}
}