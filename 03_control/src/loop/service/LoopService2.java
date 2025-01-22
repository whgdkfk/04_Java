package loop.service;

import java.util.Scanner;

public class LoopService2 {
	
	Scanner sc = new Scanner(System.in);
	
	public void displayMenu() {
		System.out.println("[LoopService2]");
		System.out.println("1. method1()");
		System.out.println("2. method2()");
		System.out.println("3. method3()");
		System.out.println("4. method4()");
		System.out.println("5. method5()");
		System.out.println();
		System.out.print("실행할 메서드 번호 입력 >> ");
		int input = sc.nextInt();
		System.out.println("");
		
		switch(input) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 4: method4(); break;
			case 5: method5(); break;
			default: System.out.println("잘못 입력하셨습니다.");
			System.out.println();
		}
		
	}
	
	/**
	 * 다음 모양 출력하기
	 * 
	 * <pre>
	 * (0, 0) (0, 1) (0, 2)
	 * (1, 0) (1, 1) (1, 2)
	 * (2, 0) (2, 1) (2, 2)
	 * (3, 0) (3, 1) (3, 2)
	 * </pre>
	 */
	public void method1() {
		// 행 0 ~ 3
		// 열 0 ~ 2
		for(int row=0; row<4; row++) { // row: 행
			for(int col=0; col<3; col++) { // col: 열
				System.out.printf("(%d, %d)", row, col);
			}
			System.out.println(); // 개행
		}
	}
	
	/* 
	 * 분기문
	 * - break: 현재 반복 종료하기
	 * - continue: 다음 반복으로 넘어가기
	 */
	
	/**
	 * 1 ~ 20까지 출력
	 * 단, 입력받은 수에서 반복 멈추기(break)
	 */
	public void method2() {
		
		System.out.print("stop number: ");
		int stop = sc.nextInt(); // ex) 3

		for(int i=1; i<=20; i++) {
			System.out.print(i + " "); // 1 2 3
			
			if(i == stop) { // 입력 값과 i가 같으면 반복 종료
				break;
			}
			
		}
	}
	
	
	/**
	 * 1 ~ 20까지 출력
	 * 단, 입력받은 수의 배수는 출력X(continue)
	 */
	public void method3() {
		System.out.print("continue number: ");
		int con = sc.nextInt(); // ex) 3
		
		for(int i=1; i<=20; i++) {
			
			if(i % con == 0) { // 입력 값(con)이 i의 배수면 건너뛰기
				continue;  // continue → 증감식 → 조건식
			}
			
			System.out.print(i + " "); // 1 2 4 5 7 ...
			
		}
	}
	
	/**
	 * 0이 입력될 때까지
	 * 입력된 모든 숫자 합계 구하기
	 */
	public void method4() {
		
		int sum = 0;
		
		// -1을 왜 input에 대입했을까?
		// input = 0; → while(input != 0) → 처음부터 false → 합계(sum): 0
		int input = -1;
		
		while(input != 0) { // 0이 아닐 때 반복
			System.out.print("정수 입력: ");
			
			// 입력받은 수를 input에 저장 → while 조건 비교 가능
			input = sc.nextInt(); 
			
			// 입력받은 값을 sum에 누적
			sum += input;
		}
		System.out.println("합계: " + sum);
	}
	
	/* 
	 * do ~ while문
	 * - while문의 조건식이 시작이 아닌 마지막 부분으로 이동한 반복문
	 * - 최소 1회 이상의 반복 보장
	 * 
	 * [작성법]
	 * do {
	 * 
	 * }while(조건식);
	 * 
	 */
	public void method5() {
		
		int sum = 0;
		int input = 0; // input에 int 기본값(0) 대입
		
		do { // 일단 1회 이상은 무조건 반복
			
			System.out.print("정수 입력: ");
			input = sc.nextInt(); 
			sum += input;
			
		} while(input != 0); // 0이 아닐 때 반복
		
		System.out.println("합계: " + sum);
	}
}
