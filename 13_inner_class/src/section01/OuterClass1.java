package section01;

public class OuterClass1 {
	
	// OuterClass1의 필드(== 멤버 변수)
	private int num = 10;
	
	private void test() { // 멤버 메서드
		System.out.println("OuterClass1의 test() 메서드입니다.");
		
		// 멤버끼리는 서로 호출 가능(접근 제어자 관련X)
		System.out.println("num: " + num);
	}
	
	
	/* 외부 클래스 메서드를 이용해서 내부 클래스 객체 생성 */
	public void displayMessage() {
		System.out.println("[외부 클래스에서 내부 클래스 객체 생성]");
		
		InstanceInnerClass inner = new InstanceInnerClass();
		inner.display();

	}
	
	
	
	/* 인스턴스 내부 클래스 정의 == OuterClass1의 멤버 */
	public class InstanceInnerClass {
		public void display() {
			System.out.println("InstanceInnerClass의 display() 메서드");
			
			num = 300; // OuterClass1의 멤버 변수 값 변경
			test();    // OuterClass1의 멤버 변수 값 호출
			
			// → 인스턴스 내부 클래스는 외부 클래스 멤버에 접근 가능
		
		}
	}
	
	
	/*
	 * static: 정적 메모리 영역
	 * - 프로그램 "실행 시" static이 붙은 변수/메서드를
	 *   static 메모리 영역에 할당
	 *   (클래스명.변수 / 클래스명.메서드명 형태로 할당)
	 * - 프로그램 "종료"될 때까지 유지
	 * - 인스턴스 생성 없이 사용 가능
	 * - 프로그램 내에서 공유
	 */
	
	
}
