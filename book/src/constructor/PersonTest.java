package constructor;

public class PersonTest {
	public static void main(String[] args) {
		
		// Person personLee = new Person();
		
		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.height = 180.0F;
		personKim.weight = 85.5F;
		
		Person personLee = new Person("이순신", 175, 75);
	}
}
