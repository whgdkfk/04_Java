package loop.practice;

import java.util.Scanner;

/**
 * 기능 제공용 클래스
 */
public class LoopPracticeAnswer {
	
	
	Scanner sc = new Scanner(System.in);
	
	/** 실습문제 1
	 * 사용자로부터 한 개의 값을 입력 받아 
	 * 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		단, 입력한 수는 1보다 크거나 같아야 합니다.
		
		만일 1 미만의 숫자가 입력됐다면 
		“1 이상의 숫자를 입력해주세요“를 출력하세요.
	 */
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();

		if (input >= 1) {
			for (int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	 
	/** 실습문제 2
	사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
	단, 입력한 수는 1보다 크거나 같아야 합니다. 
	*/
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();

		if (input >= 1) {
			for (int i = input; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	
	/** 실습문제 3
	1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.
	*/
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1 ; i <= num ; i++) {
			sum += i;
			
			if(i < num) {
				System.out.print(i + " + ");
			} else {
				System.out.println(i + " = " + sum);
			}
		}
	}
	
	/** 실습문제 4
	 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

	ex.
	첫 번째 숫자 : 8	첫 번째 숫자 : 4	첫 번째 숫자 : 9
	두 번째 숫자 : 4 	두 번째 숫자 : 8 	두 번째 숫자 : 0
	4 5 6 7 8 			4 5 6 7 8 			1 이상의 숫자를 입력해주세요.*/
	public void practice4() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if( num1 < 1  ||  num2 < 1 ) { // num1, num2 중에 1 미만이 있는가?
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		} else { // 둘 다 1 미만이 아니다
			//  8       4
			if(num1 > num2) { 
				
				// 두 변수의 값 교환
				int temp = num1;  //  temp : 8 / num1 : 8 / num2 : 4
				num1 = num2; //  temp : 8 / num1 : 4 / num2 : 4
				num2 = temp; //  temp : 8 / num1 : 4 / num2 : 8
			}
			
			for(int i=num1 ; i<=num2 ; i++) {
				System.out.print(i + " ");
			}
			
			
			/*int start = num1;
			int end = num2;
			
			if(num1 > num2) { // 먼저 입력한 숫자가 크면 start / end를 바꿈
				start = num2;
				end = num1;
			}
			
			for(int i = start ; i <= end ; i++) {
				System.out.print(i + " ");
			}*/
			
			
			
			/*if(num1 < num2) {
				for(int i=num1 ; i<=num2 ; i++) {
					System.out.print(i + " ");
				}
			} else {
				for(int i=num2 ; i<=num1 ; i++) {
					System.out.print(i + " ");
				}
			}*/
			
		}
		
	}
	
	
	
	/** 실습문제 5
	 사용자로부터 입력 받은 숫자의 단을 출력하세요.
	 */
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.printf("===== %d단 =====\n", num);
		for(int i = 1; i < 10; i++) {			
			System.out.printf("%d * %d = %d%n", num, i, (num * i));
		}
	}
	
	
	/** 실습문제 6
	사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
	단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.*/
	public void practice6() {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if( num >= 2 && num <=9 ) {
			
			for(int dan = num ; dan <= 9 ; dan++) {
				
				System.out.println("===== " + dan + "단 =====");
				
				for(int i = 1 ; i<=9 ; i++) {
					System.out.printf("%d X %d = %2d \n" , dan , i , dan * i);
				}
				
				System.out.println(); // 단 사이 줄 바꿈
			}
			
		} else {
			System.out.println("2~9 사이 숫자만 입력해주세요");
		}

		
		
	}
	
	
	
	/** 실습문제7
	다음과 같은 실행 예제를 구현하세요.
	ex.
	정수 입력 : 4
	*
	**
	***
	****
	*/
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int row = 1; row <= num; row++) {
			for(int col = 1; col <= row; col++) {				
				System.out.print("*");
			}
			
			System.out.println(); // 줄바꿈
		}
	}
	
	
	/** 실습문제 8
	다음과 같은 실행 예제를 구현하세요.
	ex.
	정수 입력 : 4
	****
	***
	**
	*
	*/
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int row = num; row > 0; row--) {
			
			for(int col = row; col > 0; col--) {
				System.out.print("*");
			}
			
			System.out.println(); // 줄 바꿈
		}
	}
	
	
	/** 실습문제 9
	다음과 같은 실행 예제를 구현하세요.

	ex.
	정수 입력 : 4
	   *
	  **
	 ***
	****
	*/ 
	public void practice9() {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1 ; row <= input ; row++ ) {
			
			// for문을 이용한 풀이
			//for(int i = input-row ; i >= 1 ; i--) {
//			for(int i = input-1 ; i >= row ; i--) {
//				System.out.print(" ");
//			}
			
//			for(int col = 1 ; col <= row ; col++) {
//				System.out.print("*");
//			}
			
			
			// if문을 이용한 풀이
			for(int col = 1 ; col <= input ; col++) {
				
				if(col <= input - row) {
					System.out.print(" ");
					
				}else {
					System.out.print("*");
				}
			}
			
			System.out.println(); // 줄바꿈
		}

	}
	
	
	/** 실습문제 10
	다음과 같은 실행 예제를 구현하세요.

	ex.
	정수 입력 : 3
	*
	**
	***
	**
	*
	
	*/
	public void practice10() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 위쪽 삼각형
		for(int row = 1 ; row <= input ; row++) {
			for(int col = 1 ; col <= row ; col++) {
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
		
		// 아랫쪽 삼각형
		for(int row = input - 1; row >= 1 ; row--) {
			for(int col = 1 ; col <= row ; col++) {
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
		
		
		System.out.println("====================");
		
		
		for(int row=1; row<= input*2-1; row++) {
         
    	  if(row < input) {
        	  
             for(int col=1; col <= row; col++) {
                System.out.print("*");
             }
             
          } else {
             for(int col=input ; col > row-input; col--) {
                System.out.print("*");
             }
          }
          
          System.out.println();
       }
		
	}
	
	/** 실습문제 11
	다음과 같은 실행 예제를 구현하세요.
	
	  정수 입력 : 4
		   *
		  ***
		 *****
		*******
  */
	 public void practice11() {
		 
		 System.out.print("정수 입력 : ");
		 int input = sc.nextInt();
		 
		 for(int row=1 ; row<=input ; row++) {
			 
			 // 앞쪽 공백 추가 방법 1
			 for(int blank=1 ; blank <= input-row ; blank++) {
				 System.out.print(" ");
			 }
			 
			 for(int col=1 ; col <= 2 * row - 1 ; col++) {
				 System.out.print("*");
			 }
			 
			 System.out.println(); // 줄바꿈
		 }
		 
		 
		 System.out.println("------------------------------------");
		 
		 
		 for(int row=1 ; row<=input ; row++) {
			 
			 for(int col=1 ; col <= 2 * input - 1 ; col++) {
				 
				 // 앞쪽 공백 추가 방법 2
				 if(input-row >= col || input + row <= col) {
					 System.out.print(" ");
				 }else {
					 System.out.print("*");
				 }
				 
			 }
			 
			 System.out.println(); // 줄바꿈
		 }
		 
		 
		 
	 }
	 
	 
	 /** 실습문제 12
		다음과 같은 실행 예제를 구현하세요.
	 	정수 입력 : 5
		 *****
		 *   *
		 *   *
		 *   *
		 *****
	 
	 */
		public void practice12() {
			System.out.print("정수 입력 : ");
			int input = sc.nextInt();

			for (int row = 1; row <= input; row++) {

				for (int col = 1; col <= input; col++) {

					// 첫 번째/마지막 행/열만 * 출력
					if (row == 1 || row == input || col == 1 || col == input) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

				System.out.println(); // 줄바꿈
			}
		}
	 
	 
	/** 실습문제 13
	1부터 사용자에게 입력 받은 수까지 중에서 
	1) 2와 3의 배수를 모두 출력하고
	2) 2와 3의 공배수의 개수를 출력하세요.

	* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때 
	  모두 나머지가 0이 나오는 수 

	ex.
	자연수 하나를 입력하세요 : 15
	2 3 4 6 8 9 10 12 14 15 
	count : 2

	 */
	public void practice13() {

		Scanner sc = new Scanner(System.in);

		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();

		int count = 0;

		for (int i = 1; i <= input; i++) {

			// 2의 배수 또는 3의 배수인 경우 출력
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");

				// 2와 3의 공배수 == 2로도 나누어 떨어지고, 3으로도 나누어 떨어진다
				if (i % 2 == 0 && i % 3 == 0) {
					count++; // count 증가
				}
			}
		}

		System.out.println("\ncount : " + count);

	}
		
	/** 실습문제 14
	사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
	단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
	* ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
	ex) 2, 3, 5, 7, 11 …
	ex.
	숫자 : 5      숫자 : 9          숫자 : 0
	소수입니다.   소수가 아닙니다.  잘못 입력하셨습니다.
 
	 */
	public void practice14() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if (num < 2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}

		for (int i = 2; i < num; i++) {

			if (num % i == 0) { // 1, 자기자신 빼고 나누어 떨어지는 수 존재
				System.out.println("소수가 아닙니다");
				return;
			}
		}
		System.out.println("소수 입니다");

	}

	
	/** 실습문제 15
	 * 위 문제와 모든 것이 동일하나, 입력한 수가 2보다 작은 경우
		“잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요.
	 */
	public void practice15() {
		
		while(true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();

			if (num < 2) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			
			for (int i = 2; i < num; i++) {
				
				if (num % i == 0) { // 1, 자기자신 빼고 나누어 떨어지는 수 존재
					System.out.println("소수가 아닙니다");
					return;
				}
			}
			System.out.println("소수 입니다");
			break;
		}

	}
	
	 
	 /** 실습문제 16
	  * 2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 
	  * 소수의 개수를 출력하세요.
		* 단, 입력한 수가 2보다 작은 경우 
		* “잘못 입력하셨습니다.”를 출력하세요.
	  */
		public void practice16() {

			System.out.print("숫자 : ");
			int num = sc.nextInt();

			int count = 0; // 소수를 개수를 세기 위한 변수

			// 2부터 입력 받은 수 까지 1개씩 접근하는 for문
			for (int i = 2; i <= num; i++) {

				boolean flag = true; // 깃발(신호 용도)
				// true인 경우 : 소수 O
				// false인 경우 : 소수 X

				// 1과 자기자신(num)을 뺀 정수를 한 개씩 접근(x)
				for (int x = 2; x < i; x++) {

					if (i % x == 0) { // 1, 자기자신 빼고 나누어 떨어지는 수 존재
						flag = false;
						break;
					}
				}

				if (flag) { // 소수라고 판별된 경우 수행
					System.out.print(i + " ");
					count++;
				}
			}

			System.out.printf("\n2부터 %d까지 소수의 개수는 %d개 입니다\n", num, count);

		}
}