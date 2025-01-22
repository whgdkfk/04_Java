package condition.run;

// 다른 패키지에 있는 클래스 가져오기
import condition.service.ConditionService;

/**
 * 기능 실행용 클래스
 */
public class ConditionRun {
	// main method: 자바 실행 메서드
	public static void main(String[] args) {
		
		// ConditionService 객체 생성
		ConditionService service = new ConditionService();
		
		// service.메서드명();으로 호출해서 사용
		// service.method1(); // 1 ~ 10 사이 난수(정수)가 짝수인지 홀수인지 검사
		// service.method2(); // 나이를 입력받아 "어린이", "청소년", "성인" 구분
		// service.method3(); // 나이를 입력받아 "어린이", "청소년(중학생)", "청소년(고등학생)", "성인" 구분
		service.displayMenu(); // ConditionService에 작성된 메서드를 골라서 실행하는 메서드
		// service.method4(); // 성적 판별기
	}
}