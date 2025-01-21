package common;

public class PrintEx {
	
	public static void main(String[] args) {
		
		/* System.out == 지정된 출력용 화면(이클립스 콘솔)
		 * 
		 * 1) System.out.print(출력 내용);
		 * - 출력 내용을 콘솔에 출력
		 * - 출력 완료 후 개행X
		 * 
		 * 2) System.out.println();
		 * - 출력 완료 후 개행O
		 * - ln == line
		 * 
		 * 3) System.out.printf("문자열 템플릿(패턴)", 패턴에 대입될 값/변수 여러 개);
		 * - f: format
		 * - 정해진 형식(템플릿)에 맞는 문자열을 출력하는 구문
		 * - 문자열 템플릿 중간에 "%"로 시작하는 패턴을 입력하여
		 *   원하는 변수/값을 대입할 수 있다.
		 * - 자바스크립트의 백틱(backticks)과 비슷함
		 * 
		 * [패턴 종류]
		 * - %d(Decimal, 10진 정수): 정수(byte, short, int, long)
		 * - %c(Character, 문자)   : 문자(char)
		 * - %s(String, 문자열)    : 문자열(String)
		 * - %b(boolean, 논리형)   : 논리형(boolean)
		 * - %f(float, 실수형)     : 실수형(float, double)
		 * 
		 * - 양의 정수: 정수 크기만큼 칸 확보 + 오른쪽 정렬
		 * 	 ex) %4d, 3 대입 → ㅁㅁㅁ3 (네 칸 확보, ㅁ은 빈칸을 표시) 
		 * 
		 * - 음의 정수: 정수 크기만큼 칸 확보 + 왼쪽 정렬
		 *   ex) %-4d, 3 대입 → 3ㅁㅁㅁ
		 *   
		 * - 소수점: 소수점 아래 몇 번째 자리까지 표시할지 지정
		 *           (지정된 자리 아래에서 반올림 처리)
		 *   ex) %.1f, 3.15 대입 
		 *   		 → 3.15 소수점 첫 번째 자리까지 표시 & 두 번째 자리에서 반올림 
		 *   		 → 3.2
		 */
		
		// print() 확인
		System.out.print("이름: "); // 개행X 
		System.out.print("홍길동"); // 개행X
		System.out.print(", 20세"); // 개행X (커서가 다음 줄로 안 넘어감)
		// 출력결과 → 이름: 홍길동, 20세
		
		// println() 확인
		System.out.println(); // 출력 내용없이 개행
		System.out.println(); // 출력 내용없이 개행
		System.out.println(); // 출력 내용없이 개행 (세 번 줄 바뀜)
		System.out.println("----------------------------------------------------------");
		System.out.println("[printf() 확인하기]");
		
		// String: 참조형(값 저장X, 값의 위치(주소) 저장)
		String name = "신짱구"; 
		int age = 5;               // int: 정수 기본형, 4byte
		double height = 80.5;      // double: 실수 기본형, 8byte
		char gender = '남';        // char: 문자형, 2byte
		boolean javaStudy = false; // boolean: 논리형, 1byte
		
		// 신짱구는 5세 남아로 키는 80.5cm이며, 자바 공부 여부는 false이다.
		
		// println()버전
		System.out.println(name + "는 " + age + "세 " + gender + "아로 " 
												+ "키는 " + height + "cm이며, " + "자바 공부 여부는 " + javaStudy + "이다.");
		
		// printf() 버전
		System.out.printf("%s는 %d세 %c아로 키는 %.1fcm이며, 자바 공부 여부는 %b이다."
										, name, age, gender, height, javaStudy);
		// %f: 무조건 소수점 여섯 자리로 나옴
		// %.1f: 소수점 첫 째자리까지 나옴
		
		
		// 왼쪽 정렬
		System.out.println(); // 개행
		System.out.printf("%-6s/%-6d", name, age); // 신짱구ㅁㅁㅁ/5ㅁㅁㅁㅁㅁ
		
		// 오른쪽 정렬
		System.out.println(); // 개행
		System.out.printf("%6s/%6d", name, age); // ㅁㅁㅁ신짱구/ㅁㅁㅁㅁㅁ5
		
		// 참고
		// 오른쪽 정렬
		// 0 == 빈칸에 0 추가(숫자만 가능)
		System.out.println(); // 개행
		System.out.printf("%6s/%06d", name, age); // ㅁㅁㅁ신짱구/000005
		
		// ------------------------------------------------------------------------
		
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("[escape 문자]");
		
		// escape 문자
		// - 문자열 내에서 \로 시작하는 특수 문자
		// - \n 또는 \r 또는 \r\n: 개행
		// - \t: 탭(tab)
		// - \u0000: 유니코드
		// - \\: 백슬래시 출력
		// - \' 또는 \": ', " 기호 출력(리터럴 인식X)
		
		System.out.print("1\t2\t3\n"); // 1	탭 2 탭 3 개행
		System.out.print("\"홍길동\"의 자료형은 String\r"); // "홍길동"의 자료형은 String 개행
		System.out.print("\\o/\n"); // \o/ 개행
		
	}
}
