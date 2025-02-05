package section01.run;

import section01.service.PolymorphismService;

public class PolymorphismRun {
	public static void main(String[] args) {
		
		PolymorphismService service = new PolymorphismService();
		
		// service.test1();
		// service.test2(); // Child, Parent, Object 순서로 출력
		// void section01.service.PolymorphismService.test2 ()
		// service.test3(); // Child, Parent, Object 순서로 출력
		
		// 실행: ctrl + f11
		// 디버그: f11
		// service.test4(); 
		service.test5(); 
	}
}
