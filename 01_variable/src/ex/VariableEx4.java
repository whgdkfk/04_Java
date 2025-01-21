package ex;

public class VariableEx4 {
	
	// main method: 자바 실행 구문
	public static void main(String[] args) {
		/* [상수(Constant)]
		 * - 한 번 값을 대입하면 바꿀 수 없는 변수
		 *   
		 * - 작성법
		 * final 자료형 변수명 = 값; // final: 마지막으로 값이 대입된 변수
		 * 단, 변수명은 대문자 + _(underscore case)
		 */
		
		// final은 자료형에 값을 단 한 번만 설정할 수 있게 강제하는 키워드이다. 
		// 값을 한 번 설정하면 그 값을 다시 설정할 수 없다.
		final double PI = 3.141592;
		final int NATIONAL_CODE = 82;
		
		// The final local variable NATIONAL_CODE cannot be assigned. 
		// It must be blank and not using a compound assignment.
		// 최종 로컬 변수인 NATIONAL_CODE를 할당할 수 없습니다. 
		// 빈칸이어야 하며 복합 할당을 사용해서는 안 됩니다.
		// NATIONAL_CODE = 1; // 오류 발생(대입 불가)
		
		// JavaScript와의 차이점
		// JavaScript에서 상수는 선언, 초기화 구문이 분리될 수 없다.(상수 변수만 선언 불가)
		// Java에서 상수는 선언, 초기화 구문이 분리될 수 있다.
		final int TEMP; // 상수 선언
		TEMP = 100; // 상수에 처음이자 마지막으로 값 대입(초기화)
		// TEMP = 200; // 처음 초기화 이후 값 대입 불가(오류 발생)
		
		// sysout: snippet(재사용 가능한 소스 코드, 기계어, 텍스트의 작은 부분을 일컫는 프로그래밍 용어)
		System.out.println("[상수 확인]");
		
		int r = 5; // 반지름
		System.out.println("원의 둘레: " + 2 * PI * r);
		System.out.println("원의 넓이: " + PI * r * r);
		
		System.out.println("국가 코드: " + NATIONAL_CODE);
		
		System.out.println("TEMP: " + TEMP);
		
		// -----------------------------------------------------------------------------------
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("오버플로우(Overflow)");
		
		// 오버플로우(Overflow)
		// 연산 결과가 자료형의 값의 범위를 초과(+)한 경우
		// 처음에 값 대입할 때는 안 됨
		
		// 언더플로우(Underflow)
		// 연산 결과가 자료형의 값의 범위를 초과(-)한 경우
		
		// Integer: 정수 / int: Integer의 약어
		// MAX_VALUE: 상수(대문자 & _)
		int num = Integer.MAX_VALUE; // int의 최댓값
		System.out.println("num: " + num); // 2147483647
		
		num = num + 1; // 오버플로우 발생
		System.out.println("num + 1: " + num); // -2147483648
		
		num = num - 1; // 언더플로우 발생
		System.out.println("num + 1 - 1: " + num); // 2147483647
		
		// 문제 원인
		// - num의 자료형이 int이기 때문에 최댓/최솟값을 초과하는 문제 발생
		
		// 해결 방법
		// - num의 자료형을 long으로 변경
	}
}
