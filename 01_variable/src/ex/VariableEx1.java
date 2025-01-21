// 패키지: 현재 클래스 파일이 저장된 폴더 경로
package ex; 

// Java는 소문자, Camel Case 사용
// 단, 클래스명은 대문자로 시작해야 한다.


public class VariableEx1 {
	/** [main method]
	 * 자바 프로그램을 실행시키기 위한 구문
	 * 
	 */
	public static void main(String[] agrs) {
		
		System.out.println("[Java 변수와 자료형]");
		
		/* 변수: 메모리에 값을 저장하는 공간
		 *		 + 해당 공간에 저장할 수 있는 값을 바꿀 수 있음(변수)
		 * 
		 * * Java는 JS와 다르게 처음부터 변수의 자료형을 지정해야 한다.	
		 * 
		 * [데이터 저장 단위]
		 * - 비트(bit): 컴퓨터가 나타내는 데이터의 최소 저장 단위
		 * - 바이트(byte): 데이터 처리 또는 문자의 최소 단위 (1byte == 8bit)
		 * * 1byte == 8bit
		 * → 컴퓨터가 데이터 처리(연산)를 위한 최소 단위
		 * 
		 * ***** [Java 기본 자료형 8가지(매우 중요)] <- 시험에 나옴 *****
		 * - 논리형
		 * boolean (1byte) - true/false 저장 가능
		 * 
		 * - 정수형: 양의 정수(1,2,3), 음의 정수(-1,-2,-3), 0
		 * byte  (1byte)
		 * short (2byte)
		 * int   (4byte, 정수 기본형)
		 * → 정수 형태로 작성된 값은 무조건 int 자료형으로 판단
		 * long  (8byte)
		 * → 숫자 뒤에 L 또는 l을 붙임(L, l은 long의 리터럴)
		 * 
		 * - 실수형
		 * float  (4byte)
		 * → 숫자 뒤에 F 또는 f를 붙임 
		 * double (8byte, 실수 기본형)
		 * → 실수 형태로 작성된 값은 무조건 double 자료형
		 * 
		 * - 문자형
		 *  char (2byte): '문자 하나'를 지정하는 유니코드를 저장함
		 * 
		 * -------------------------------------------------------------
		 *
		 * cf) JavaScript
		 * JS 자료형
		 * - number, string, undefined, object, null, function, boolean
		 * 
		 * JS에서 변수 선언을 위한 키워드
		 * - const, let, var
		 * 
		 * JS에서 변수 자료형은 언제 결정될까?
		 *  → 값이 대입되는 순간 결정
		 * let temp; // undefined
		 * temp = 10; // number
		 * temp = "하이"; // string
		 */
		
		// 변수 선언
		int num1; 
		// Q. 위 코드를 해석하시오.
		// 메모리에 "int형" "정수"를 저장할 공간 "4byte"를 할당하고 
		// 해당 공간(변수)의 이름을 num1이라고 지정하였다.
		// * int형 정수 범위: -21.47억 ~ + 21.47억
		// let num2; // 자바스크립트 num2라는 이름의 변수를 선언하겠다.
		
		/* Java 지역 변수는 초기화를 하지 않은 경우 
		 * 출력, 연산을 할 수 없다.
		 * (단, 대입 연산은 제외) 
		 */
		// The local variable num1 may not have been initialized
		// 지역 변수 num1이 초기화되지 않았다.
		// System.out.println(num1);
		
		/* 변수 초기화(처음 값 대입) */
		num1 = 200;
		System.out.println("num1: " + num1);
		
		// println() snippet(약어, 줄임말): sysout → ctrl + space + enter
		System.out.println("-------------------------------");
		
		System.out.println("[자료형별 리터럴 작성법]");
		
		// 논리형(boolean, 1byte)
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println("--- 논리형 ---");
		System.out.println("bool1: " + bool1);
		System.out.println("bool2: " + bool2);
		
		if(bool1 && !bool2) { // true && true 
			System.out.println("이것 출력될까?"); // true
		}
		
		// 정수형: byte(1), short(int보다 짧은 것)(2), int(기본형)(4), long(int보다 긴 것)(8)
		System.out.println("--- 정수형 ---");
		int intNum1 = 2147483647; // int 최댓값
		
		// The literal 2147483648 of type int is out of range 
		// int 범위 초과값 대입 불가
		// int intNum2 = 2147483648;
		
		// 정수형 중에서 범위가 더 큰 long 사용
		// long longNum1 = 2147483648; ← 일반 정수 표기법 == int로 인식
		// long longNum1 = 2147483648L or 2147483648l;로 표기 == long으로 인식
		long longNum1 = 2147483648L;
		
		// 자릿수 구분을 위해 _(언더스코어) 사용 가능 → 연산 시 인식X
		long longNum2 = 30_000_000_000L; // 300억
		
		// 출력 결과에 리터럴 표기법 L, l, _ 포함X 
		// 화면에 표시X, 코드 상에서만 리터럴을 이용해 자료형, 자릿수 구분
		System.out.println("intNum1: " + intNum1);
		System.out.println("longNum1: " + longNum1);
		System.out.println("longNum2: " + longNum2);
		
		// byte, short: 다른 언어(C언어)와 호환을 위해 남겨진 자료형
		// → 별도의 리터럴 표기법X
		// → 초기화 시 int 타입 표기법 사용
		byte byteNum = 100; // byte byteNum = 100b;(X)
		short shortNum = 20000;
		
		// 실수형
		System.out.println("-------------------------------");
		System.out.println("--- 실수형 ---");
		
		// 일반적인 실수 표기법 == double 표기법
		// float: 대문자 F 또는 소문자 f를 뒤에 붙임(보통 소문자 f 많이 사용)
		float floatNum = 1.123456789f;
		double doubleNum = 1.123456789; 
		
		System.out.println("floatNum: " + floatNum);
		System.out.println("doubleNum: " + doubleNum);
		// floatNum: 1.1234568
		// doubleNum: 1.123456789
		
		// float는 소수점 아래 8번째 자리에서 반올림
		// double은 소수점 아래 16번째 자리에서 반올림
		// → 소수점 아래 자리수를 더 많이 표현
		//   == 정확도 더 높음 == 실수 기본형으로 채택(double)
		
		// 문자형(char, 2byte): 리터럴 표기법('')
		// 문자형은 실제로는 정수(유니코드)를 저장한다.
		// 문자형이지만 정수형으로도 취급한다.
		char ch1 = 'A'; // 'A'를 나타내는 유니코드 65('\u0041', 16진수)가 저장됨
		char ch2 = '가'; // 한글도 2byte
		char ch3 = '趙'; // 한자도 2byte
		char ch4 = '★'; // 특수문자도 2byte
		
		System.out.println("-------------------------------");
		System.out.println("--- 문자형 ---");		
		System.out.println("ch1: " + ch1);
		
		// printf(): 출력될 문자열 형식을 지정하는 템플릿
		// %c: 문자형
		// %d: 10진수 정수형
		// %x: 16진수 정수형
		// \n: 개행
		// (int)ch1: ch1의 자료형을 int로 변환
		System.out.printf("%c, %d, %x \n", ch1, (int)ch1, (int)ch1); 
		
		System.out.println("ch2: " + ch2);
		System.out.println("ch3: " + ch3);
		System.out.println("ch4: " + ch4);
		
		// 문자열(String, 4byte(32bit) 또는 8byte(64bit))
		// - 값이 아닌 주소를 저장하는 "참조 자료형(참조형)"
		// - 리터럴 표기법: ""
		// - String은 몇 글자가 작성될지 모르기 때문에 
		//   기본적으로 크기가 정해져있는 "기본 자료형"에 포함되지 않는다.
		// - 대신 다른 곳에 문자열이 byte[] 모양으로 만들어지고
		//   해당 배열의 주소를 참조하는 "참조형"이 된다.
		String str1 = "A";
		String str2 = "AB";
		String str3 = "ABC";
		String str4 = "ABCD";
		
		System.out.println("str1: " + str1);
		// hashCode(): 주소를 해시 함수로 변환한 것
		// → 주소가 다르면 같은 결과가 나올 수 없다.
		System.out.println(System.identityHashCode(str1)); 
		
		System.out.println("str2: " + str2);
		System.out.println(System.identityHashCode(str2));
		
		// 변수명 명명 규칙
		int num123;
		// int 123num; (X) // 숫자로 시작하면 안 됨
		// int num_1;  (X) // ‘_’ 사용 시 컴파일 에러는 없지만 관례상 사용하지 않는 것이 좋음
		final int NATIONAL_CODE = 82; // final 들어간 표기에서만 전체 대문자 & _ 사용
		int 정수1 = 10; // 가능하지만 사용X
		double 실수2 = 3.14; // 가능하지만 사용X
		
	}
}
