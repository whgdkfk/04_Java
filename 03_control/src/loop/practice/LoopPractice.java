package loop.practice;

import java.util.Scanner;

/**
 * 기능 제공용 클래스
 */
public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	/**
	 * [실습문제 1]
	 * 사용자로부터 한 개의 값을 입력받아 
	 * 1부터 그 숫자까지의 숫자들을 모두 출력하시오.
	 * 단, 입력한 수는 1보다 크거나 같아야 함.
	 * 만일 1 미만의 숫자가 입력됐다면 '
	 * "1 이상의 숫자를 입력해주세요."를 출력하시오.
	 */
	public void practice1() {
		System.out.println("[practice1]");
		System.out.print("1 이상의 숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i=1; i<=num; i++) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		
	}
	
	/**
	 * [실습문제 2]
	 * 사용자로부터 한 개의 값을 입력받아 
	 * 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하시오.
	 * 단, 입력한 수는 1보다 크거나 같아야 함.
	 */
	public void practice2() {
		System.out.println("[practice2]");
		System.out.print("1 이상의 숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i=num; i>=1; i--) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	/**
	 * [실습문제 3]
	 * 1부터 사용자에게 입력받은 수까지의 정수들의 합을
	 * for문을 이용하여 출력하시오.
	 */
	public void practice3() {
		System.out.println("[practice3]");
		System.out.print("정수를 하나 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			if(i != num) {
				System.out.print(i + " + ");
			}else {
				System.out.print(i + " = ");
			}
			sum += i;
		}
		System.out.print(sum);
	}
	
	/**
	 * [실습문제 4]
	 * 사용자로부터 두 개의 값을 입력받아
	 * 그 사이의 숫자를 모두 출력하시오.
	 * 만일 1 미만의 숫자가 입력됐다면 
	 * "1 이상의 숫자를 입력해주세요."를 출력하시오.
	 */
	public void practice4() {
		System.out.println("[practice4]");
		System.out.print("첫 번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자: ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else if(num1 <= num2) {
			for(int i=num1; i<=num2; i++) {
				System.out.print(i + " ");
			}
		}else {
			for(int i=num2; i<=num1; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	/**
	 * [실습문제 5]
	 * 사용자로부터 입력받은 숫자의 단을 출력하시오.
	 */
	public void practice5() {
		System.out.println("[practice5]");
		System.out.print("숫자: ");
		int dan = sc.nextInt();
		System.out.printf("===== %d단 =====\n", dan);
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
	}
	
	/**
	 * [실습문제 6]
	 * 사용자로부터 입력받은 숫자의 단부터 9단까지 출력하시오.
	 * 단, 2 ~ 9 사이가 아닌 수를 입력하면
	 * "2 ~ 9 사이의 숫자만 입력해주세요."를 출력하시오.
	 */
	public void practice6() {
		System.out.println("[practice6]");
		System.out.print("숫자: ");
		int dan = sc.nextInt();
		
		for(int i=dan; i<=9; i++) {
			System.out.printf("===== %d단 =====\n", i);
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, dan*j);
			}
		}
	}
	
	/**
	 * [실습문제 7]
	 * 다음과 같은 실행 예제를 구현하시오.
	 * ex.
	 * 정수 입력: 4
	 * *
	 * **
	 * ***
	 * ****
	 */
	public void practice7() {
		System.out.println("[practice7]");
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
	
	/**
	 * [실습문제 8]
	 * 다음과 같은 실행 예제를 구현하시오.
	 * ex.
	 * 정수 입력: 4
	 * ****
	 * ***
	 * **
	 * *
	 */
	public void practice8() {
		System.out.println("[practice8]");
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		for(int i=num; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * [실습문제 9]
	 * 다음과 같은 실행 예제를 구현하시오.
	 * ex.
	 * 정수 입력: 4
	 *    *
	 *   **   
	 *  ***   
	 * ****   
	 */
	public void practice9() {
		System.out.println("[practice9]");
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) { 
			for(int j=0; j<num-i; j++) { 
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * [실습문제 10]
	 * 다음과 같은 실행 예제를 구현하시오.
	 * ex.
	 * 정수 입력: 3
	 * *
	 * **
	 * ***
	 * **
	 * *
	 */
	public void practice10() {
		System.out.println("[practice10]");
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=num-1; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * [실습문제 11]
	 * 다음과 같은 실행 예제를 구현하시오.
	 * ex.
	 * 정수 입력: 4
	 *    *
	 *   ***
	 *  *****
	 * *******
	 */
//	public void practice11() {
//		System.out.println("[practice11]");
//		System.out.print("정수 입력: ");
//		int num = sc.nextInt();
//		
//		for(int i=0; i<num; i++) {
//			for(int j=num-i-1; j>0; j--) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<=i*2; k++) {
//				System.out.print("*");
//			}
//		
//			System.out.println();
//		}
//	}
	
	public void practice11() {
		System.out.println("[practice11]");
		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		
		for(int row=1; row<=input; row++) {
			// 앞쪽 공백 추가 방법1
			// row blank input-row
			//  1    3     4-1
			//  2    2     4-2
			//  3    1     4-3
			//  4    0     4-4
			for(int blank=1; blank<=input-row; blank++) {
				System.out.print(" ");
			}
			for(int col=1; col<=2*row-1; col++) {
				System.out.print("*");
			}
			System.out.println(); // 개행
		}
		
		System.out.println("-----------------------------");
		
		for(int row=1; row<=input; row++) {
			
			for(int col=1; col<=2*input-1; col++) {
			// 앞쪽 공백 추가 방법2
			// col   row   input-row
			// 1~4    1       3
			//        2       2	
			//        3       1
			//        4       0
		 // if(col <= input - row) { // col = 1~3
				if(input+row<=col || input-row>=col) { // 앞 공백 || 뒷 공백
					System.out.print(" ");
				}else { // col = 4
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	/**
	 * [실습문제 12]
	 * 다음과 같은 실행 예제를 구현하시오.
	 * ex.
	 * 정수 입력: 5
	 * *****
	 * *   *
	 * *   *
	 * *   *
	 * *****
	 */
	public void practice12() {
		System.out.println("[practice12]");
		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		
		for(int row=1; row<=input; row++) {
			for(int col=1; col<=input; col++) { 
				// 첫 번째/마지막 행/열만 * 출력
				if(row == 1 || row == input || col == 1 || col == input) {
					System.out.print("*");
				}else {
					System.out.print(" ");					
				}
			}
			System.out.println();
		}
	}
	
	/**
	 * [실습문제 13]
	 * 1부터 사용자에게 입력받은 수까지의 숫자 중에서
	 * 1) 2와 3의 배수를 모두 출력하고
	 * 2) 2와 3의 공배수의 개수를 출력하시오.
	 */
	public void practice13() { // ex 1 ~ 15 / 2 3 4 6 8 9 10 12 14 15
		System.out.println("[practice13]");
		System.out.print("자연수 하나를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(i % 2 != 0 || i % 3 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}	
		
	}
	
	/**
	 * 	[실습문제 16]
	 *  2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 
	 *  소수의 개수를 출력하세요.
	 *	단, 입력한 수가 2보다 작은 경우 
	 *  “잘못 입력하셨습니다.”를 출력하세요.
	 */
	public void practice16() {
		System.out.print("숫자: ");
		int num = sc.nextInt();
		
		// 소수 개수를 세기 위한 변수
		int count = 0;
		
		// 2부터 입력받은 수까지 1개씩 접근하는 for문
		for(int i=2; i<=num; i++) {
			// flag: 깃발(신호)
			// true인 경우: 소수O
			// false인 경우: 소수X
			boolean flag = true; 
			
			// 1과 자기자신(num)을 뺀 정수를 한 개씩 접근(x)
			for(int x=2; x<i; x++) {
				//
				if(i % x == 0) { // 1, 자기자신 빼고 나누어 떨어지는 존재
					flag = false;
					break;
				}
			}
			
			if(flag) { // true(소수라고 판별된 경우 수행)
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.printf("\n2부터 %d까지 소수의 개수는 %d개입니다.\n", num, count);
		
	}
	
	
	
	
	
	
}
