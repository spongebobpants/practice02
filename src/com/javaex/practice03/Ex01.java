package com.javaex.practice03;

public class Ex01 {
	public static void main(String []args) {
		
		System.out.println("while");
		int index=0;//index라는 변수 선언-> 초기값 설정 (0)
		while(index<3) {//while=반복의 수를 알 수 없을 때, i++이므로 3까지만
			System.out.println("index ="+index); // 한줄씩 띄
			index++; //index =0,1,2
		}
		
		System.out.println("for문 "); //반복의 횟수를 알 수 있을 때:for
		for(int order=0; order<3; order++) {
			System.out.println("order ="+order); //order =0,1,2
		}
		
		
		
	}

}
