package study;

import java.util.Scanner;

public class Test {
	// 1.
	// 배열 만들어서 1,2,3,4,5 대입
	// 반복문으로 출력
	public void method1() {
		int arr[] = {1, 2, 3, 4, 5};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	// 2.
	// 배열 만들어서 메뉴 5개 넣어서
	// 반복문 으로 출력
	public void method2() {
		String arr[] = {"된장찌개", "김치찌개", "순두부찌개", "고추장찌개", "짜글이"};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	// 3.
	// 스캐너에 값 입력 받아서 
	// 정수 5개 입력받아서 
	// 반복문으로 출력
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력: ");
		int num2 = sc.nextInt();
		System.out.print("세 번째 정수 입력: ");
		int num3 = sc.nextInt();
		System.out.print("네 번째 정수 입력: ");
		int num4 = sc.nextInt();
		System.out.print("다섯 번째 정수 입력: ");
		int num5 = sc.nextInt();
		
		int arr[] = {num1, num2, num3, num4, num5};
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	// 4.
	// 반복문 써서 5개 입력 받아서 
	// 저장하기
	// 출력하기
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			
			 System.out.print((i+1) + "번째 숫자 입력: ");
			 arr[i] = sc.nextInt();
			 sc.nextLine();
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	// 1.
	// 1-1 UserDTO 클래스 만들어서 ok
	// 1-2 필드에 유저 아이디와 비밀번호, 이메일을 담을 필드를 만드시오

	// 2.
	// Test 클래스
	// 2-1 UserDTO 객체에 아이디와 비밀번호 이메일을 입력해서
	// 2-2 출력하기
	public void method5() {
		UserDTO udto = new UserDTO();
		udto.setUserId("asdf");
		udto.setUserPw("qwer");
		udto.setUserEmail("asdf@naver.com");
		
		System.out.println(udto.getUserId());
		System.out.println(udto.getUserPw());
		System.out.println(udto.getUserEmail());
	}
	
	// 3.
	// 3-1 MemberDTO 클래스를 만들어서
	// 3-2 이름, 전화번호를 담을 필드 생성

	// 4.
	// 4-1 MemberDTO 객체에 이름과 전화번호를 입력한 객체를 만드시오
	// 4-2 출력~
	public void method6() {
		
		MemberDTO mdto = new MemberDTO();
		mdto.setMemberName("홍길동");
		mdto.setMemberPhone(1011112222);
		
		System.out.println(mdto.getMemberName());
		System.out.println(mdto.getMemberPhone());
	}
	
	// Tv 객체에  sound, ch
	// gs 
	// 출력
	public void method7() {
		TV tv = new TV();
		tv.setSound("새소리");
		tv.setCh("유퀴즈");
		
		System.out.println(tv.getSound());
		System.out.println(tv.getCh());
	}
	
	
	
}