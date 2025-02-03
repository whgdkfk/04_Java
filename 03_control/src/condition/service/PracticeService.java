package condition.service;

public class PracticeService {
	
	public void method1() {
		
		int floor = 5;
		String ment;
		
		switch(floor) {
		case 1: ment="1층 약국"; break;
		case 2: ment="2층 정형외과"; break;
		case 3: ment="3층 피부과"; break;
		case 4: ment="4층 치과"; break;
		case 5: ment="5층 헬스 클럽"; break;
		default: ment="잘못된 층";
		}
		System.out.println(ment + "입니다.");
	}
	
	public void method2() {
		
		int score = 65;
		char grade;
		
		if(score < 60) {
			grade = 'F';
		}else if(score < 70) {
			grade = 'D';
		}else if(score < 80) {
			grade = 'C';
		}else if(score < 90) {
			grade = 'B';
		}else {
			grade = 'A';
		}
		
		System.out.println(score + "점의 학점은 " + grade  + "입니다.");
		
	}
	
	public void method3() {
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		
		System.out.println(sum);
		
	}
	
	public void method4() {
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
		}while(num <= 10);
		System.out.println(sum);
	}
	
	
	public void method5() {
		int i;
		int sum;
		
		for(i=1, sum=0; i<=10; i++) {
			sum += i;		
		}
		System.out.println(sum);
	}
	
	public void method6() {
		
		String n = "안녕하세요";
		
		for(int i=1; i<=10; i++) {
			System.out.print(n + i + ", ");
		}
		System.out.println();
	}
	
	public void method7() {
		int dan;
		int times;
		
		for(dan=2; dan<=9; dan++) {
			for(times=1; times<=9; times++) {
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
			System.out.println();
		}
	}
	
	public void method8() {
		for(int dan=3; dan<=7; dan++) {
			for(int times=1; times<=9; times++) {
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
			System.out.println();
		}
	}
	
	public void method9() {
		
		int total = 0;
		int num;
		
		for(num=1; num<=100; num++) {
			if(num % 2 == 0) {
				continue;
			}
			total += num; // 홀수의 합
		}
		System.out.println("1부터 100까지 홀수의 합은 " + total + "입니다.");
	}
	
	public void method10() {
		int num;
		
		for(num=1; num<=100; num++) {
			if(num % 3 != 0) {
				continue;
			}
			System.out.println(num);
		}
	}
	
	public void method11() {
		int sum = 0;
		int num = 0;
		
		for(num=0; sum<100; num++) {
			sum += num;
		}
		System.out.println("num: " + num );
		System.out.println("sum: " + sum );
	}
	
	public void method12() {
		
		int num = 0;
		int sum = 0;
		
		for(num=0; ; num++) {
			sum += num;
			if(sum >= 100) {
				break;
			}
		}
		System.out.println("num: " + num );
		System.out.println("sum: " + sum );
	}
	
	public void method13() {
		int sum = 0;
		int num;
		for(num=1; ; num++) {
			sum += num;
			if(sum >= 500) {
				break;
			}
		}
		System.out.println(num);
		System.out.println(sum);
		
	}
	
	public void method14() {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		switch(operator) {
		case '+': System.out.println(num1+num2); break;
		case '-': System.out.println(num1-num2); break;
		case '*': System.out.println(num1*num2); break;
		case '/': System.out.println(num1/num2); break;
		default: System.out.println("잘못 입력하였습니다.");
		}
		
		if(operator == '+') {
			System.out.println(num1+num2);
		}else if(operator == '-') {
			System.out.println(num1-num2);
		}else if(operator == '*') {
			System.out.println(num1*num2);
		}else {
			System.out.println(num1/num2);
		}
	}
	
	public void method15() {
		for(int dan=2; dan<=9; dan++) {
			if(dan % 2 != 0) {
				continue;
			}
			for(int times=1; times<=9; times++) {
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
			System.out.println();
		}
	}
	
	public void method16() {
		for(int dan=2; dan<=9; dan++) {
			for(int times=1; times<=9; times++) {
				if(times > dan) {
					break;
				}
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
			System.out.println();
		}
	}
	
	public void method17() {
		int lineCount = 4;
		int spaceCount = lineCount/2 + 1;
		int starCount = 1;
		
		for(int i=0; i<lineCount; i++) {
			for(int j=0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			for(int j=0; j<starCount; j++) {
				System.out.print("*");
			}
			for(int j=0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			spaceCount -= 1;
			starCount += 2;
			System.out.println();
		}
	}
	
	public void method18() {
		int lineCount = 7;
		int spaceCount = lineCount/2 + 1;
		int starCount = 1;
		
		for(int i=0; i<lineCount; i++) {
			for(int j=0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			for(int j=0; j<starCount; j++) {
				System.out.print("*");
			}
			for(int j=0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			
			if(i < lineCount/2) {
				spaceCount -= 1;
				starCount += 2;
			}else {
				spaceCount += 1;
				starCount -= 2;
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
}
