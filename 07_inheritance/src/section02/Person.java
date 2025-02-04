package section02;

/*
 * Object 클래스
 * - 모든 클래스(객체)의 최상위 부모
 * - 모든 클래스(객체)가 공통적으로 가져야 하는 기능이 모여 있음
 * - 클래스 선언부에 아무런 상속 구문이 작성되지 않으면
 *   컴파일러가 자동으로 [extends Object] 추가
 */

/*
 * final 클래스 / final 메서드
 * - final: 마지막, 최종
 * - final 클래스: 상속 불가 클래스
 *   → 사용 이유: 다른 클래스가 필드/메서드를 상속받아 사용하지 못하게 하려고
 *     (+ 모든 메서드 오버라이딩 불가)
 * - final 메서드: 오버라이딩 불가 메서드
 *   → 이미 완벽한 기능 / 바꾸면 문제가 생기는 기능 재정의 방지    
 */


public /* final */ class Person /* extends Object */ {
	private String name;
	private int age;
	
	// 기본 생성자
	public Person() {
		System.out.println("[Person 기본 생성자로 생성됨]");
	}

	// 매개 변수 생성자 자동 생성: alt + shift + s → O
	public Person(String name, int age) {
		System.out.println("[Person 매개 변수 있는 생성자로 생성됨]");
		
		this.name = name;
		this.age = age;
	}
	
	// getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	 * Object.toString() 메서드
	 * - 객체를 사람이 읽기 쉬운 간단한 문자열 형태로 반환하는 목적의 메서드
	 * - 모든 자식 클래스에서 재정의(오버라이딩)해서 사용
	 */
	
	/*
	 * 오버라이딩(Over + riding)
	 * - 덮어쓰다, 재정의하다라는 의미
	 * - 부모와 같은 이름의 메서드를 자식이 다시 정의하는 기술
	 *   (자식이 용도에 맞게 코드를 수정)
	 *   
	 * [오버라이딩 성립 조건]
	 * 1) 변경 불가
	 * - 메서드명
	 * - 반환형
	 * - 매개 변수의 타입, 개수, 순서
	 * 
	 * 2) 변경 가능
	 * - 접근 제어자는 같거나 넓은 범위로 변경 가능 (ex. protected → public)
	 * - 예외 처리는 같거나 좁은 범위로 변경 가능
	 * 
	 * *** 주의사항 ***
	 * 부모의 private 메서드는 오버라이딩 불가
	 * (직접 접근이 차단되어 있어 재정의 자체가 불가)
	 * 
	 * -----------------------------------------------------------------------
	 * 어노테이션(Annotation, 주석): 컴파일러를 위한 주석
	 * - 코드의 추가적인 정보 제공 목적
	 * - 컴파일러에게 지시하는 목적
	 * 
	 * @Override 어노테이션
	 * 1) 해당 메서드가 오버라이딩되었음을 명시(정보 제공)
	 * 2) 컴파일러에게 해당 메서드 오버라이딩이 
	 *    문제없이 작성되었는지 확인(검증)하라 지시
	 *    (성립 조건을 위배하지 않았는지 확인)
	 * 
	 */
	@Override
	public String toString() {
		return String.format("name: %s / age: %d", name, age);
	}
	
	// 부모 메서드
	public /* final */ String introduce(String alias) {
		return String.format("[Person] 이름은 %s이고 별명은 %s입니다.", name, alias);
	}
	
	
	
	
	
	
	
	
	
}
