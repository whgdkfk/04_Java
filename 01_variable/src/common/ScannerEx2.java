package common;

//Scanner 클래스 가져오기
import java.util.Scanner; 

public class ScannerEx2 {
	
	public static void main(String[] args) {
		
		// Scanner 객체 생성
		// 키보드 입력을 읽어오는(System.in) Scanner 객체를 생성해(new Scanner) sc 변수에 저장(Scanner sc)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[자기 소개 문장 생성 프로그램]");
		
		System.out.print("이름 입력: ");
		
		// 버퍼(buffer): 데이터를 한 곳에서 다른 한 곳으로 전송하는 동안 
		//							 일시적으로 그 데이터를 보관하는 메모리의 영역
		// 입력 버퍼: 입력 버퍼는 키보드나 마우스와 같은 입력 장치에서 
		//            수신되는 데이터를 보관하기 위해 컴퓨팅에 사용되는 임시 저장 영역
		
		// sc.next(): 입력 버퍼에서 다음 문자열(단어) 읽어오기
		// sc.next(): 띄어쓰기X, 띄어쓰기를 구분인자로 생각하여 각각 저장, 줄구분까지 저장하지 않음
		// sc.nextLine(): 띄어쓰기O, 줄구분까지 저장
		String name = sc.next(); 
		
		System.out.print("나이 입력: ");
		// sc.nextInt(): 입력 버퍼에서 다음 정수 읽어오기
		int age = sc.nextInt();
		
		System.out.print("키 입력(cm): ");
		// sc.nextDouble(): 입력 버퍼에서 다음 실수 읽어오기
		double height = sc.nextDouble();
		
		System.out.print("성별(남/여): ");
		// sc.next().charAt(index): 입력 버퍼에서 index번째 문자 하나 반환 
		char gender = sc.next().charAt(0);
		
		// Scanner에서 char 자료형을 읽어오는 방법이 제공되지 않음
		// → 문자열을 읽어와 0번째 인덱스 문자 하나만 얻어오기
		// String.charAt(index): String에서 index번째 문자 하나 반환 
		
		System.out.println("------------------------------------------------");
		System.out.println("[자기 소개 문장]");
		System.out.printf("제 이름은 %s이고 나이는 %d세, 키는 %.1fcm인 %c성입니다."
												, name, age, height, gender);
	}
}
