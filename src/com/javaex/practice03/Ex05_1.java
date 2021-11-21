package com.javaex.practice03;

public class Ex05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[while (true) 무한루프 - while true 사용해 특정 조건 만족 시 무한루프 종료하기]");
		
		//while문에서 사용할 변수 선언
		int count = 1;
		
		/*[설 명]
		 *1. while (true) : 무한루프(계속) 프로그램을 반복적으로 실행한다
		 *2. break : '탈출' 구문으로 특정 조건을 만족 시 무한루프를 탈출하기 위해 사용한다
		 */
		while(true) {
			if(count >= 5) { //if 만약 count 변수값이 5보다 크거나 같을 경우 조건 실행
				System.out.println("카운트 ["+count+"]");
				System.out.println("[프로그램을 종료합니다]");
				break; //while true 무한루프를 탈출한다
			}
			else { //5보다 크거나 같지 않을 경우 조건 실행
				System.out.println("카운트 ["+count+"]");
				count ++; //증감 연산자를 사용해 count 변수값을 증가시킨다
			}			
		}
		
	}//메인 종료

}//클래스 종료
