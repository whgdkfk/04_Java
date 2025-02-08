package hiding;

public class StudentTest {
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		// 외부 클래스에서 private 변수에 직접 접근X
		// studentLee.studentName = "이상원"; 
		
		// public 메서드를 통해 private 변수에 접근 가능
		studentLee.setStudentName("이상원");
		
		System.out.println(studentLee.getStudentName());
	}
}
