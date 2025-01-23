package encapsulation;

public class EncapsulationRun {
	public static void main(String[] args) {
		
		// Person 객체 생성
		Person person1 = new Person();
		// person1.name = "홍길동";
		// person1.height = 180.5;
		person1.setName("홍길동");
		person1.setHeight(180.5);
		
		Person person2 = new Person();
		// person2.name = "김미영";
		// 캡슐화 안 했을 때 문제점 (1)
		// → 잘못된 데이터가 대입될 수 있다.
		// person2.height = -160.7; 
		person2.setName("김미영");
		person2.setHeight(-160.7);
		
		// name, height → private → 직접 접근X, 
		// getInfo() 메서드를 통해 간접 접근
		System.out.println("person1의 " + person1.getInfo());
		System.out.println("person2의 " + person2.getInfo());
		
	}
}
