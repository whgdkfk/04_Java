package list.view;

import java.util.List;
import java.util.Scanner;

import list.dto.BookDTO;
import list.service.BookService;

/**
 * 도서 관리 프로그램 입/출력 담당 클래스(UI)
 */
public class BookView {
	
	private Scanner sc = new Scanner(System.in);
	private BookService service = new BookService();
	
	/**
	 * 프로그램 메인 메뉴
	 */
	public void displayMenu() {
		int input = 0; // 메뉴 번호를 저장할 변수
		
		do{
			System.out.println("\n***** 도서 관리 프로그램 *****\n");
			System.out.println("1. 전체 조회");
			System.out.println("2. index 번호로 조회");
			System.out.println("3. 책 추가하기");
			System.out.println("4. 책 가격 수정하기");
			System.out.println("5. 책 제거하기(index)");
			
			// 추가 메뉴
			System.out.println("6. 제목이 일치하는 책 한 권 조회하기");
			System.out.println("7. 제목이 일치하는 책 제거하기");
			System.out.println("8. 출판사가 일치하는 책 모두 조회하기");
			System.out.println("9. 저자가 일치하는 책 모두 조회하기");
			System.out.println("10. 검색어가 제목, 저자에 포함된 모든 책 조회하기");
			
			System.out.println("11. bookList 제목 오름차순으로 정렬시키기");
			
			System.out.println("0. 종료");
			System.out.println(); // 줄 바꿈
			
			System.out.print("메뉴 번호 입력 >> ");
			input = sc.nextInt();
			sc.nextLine(); // 입력 버퍼에 남아있는 문자열 제거(오류 방지)
			System.out.println("---------------------------");
			
			// cf) 수정하다 의미
			// update: 데이터 전체 수정
			// modify: 데이터 일부 수정
			// alter: 구조 수정
			
			switch(input) {
				case 1: selectAll(); break;   		 // 전체 조회
				case 2: selectIndex(); break; 		 // index 번호로 조회
				case 3: addBook(); break;     		 // 책 추가하기
//			case 4: modifyBookPrice(); break;  // 책 가격 수정하기
				case 4: modifyBookPrice2(); break; // 책 가격 수정하기
				case 5: removeBook(); break;			 // 책 제거하기(index)
				
				case 6: selectTitle(); break;      // 제목이 일치하는 책 한 권 조회하기
				case 7: removeBookTitle(); break;  // 제목이 일치하는 책 제거
	
				// 서비스 호출 시 반환된 결과가 List<BookDTO>
				case 8: selectPublisherAll(); break; // 출판사가 일치하는 책 모두 조회하기
				case 9: selectAuthorAll(); break;    // 저자가 일치하는 책 모두 조회하기
				case 10: searchBook(); break;        // 검색어가 제목, 저자에 포함된 모든 책 조회하기
				
				case 11 : bookListSorting(); break;  // bookList 제목 오름차순으로 정렬시키기
				
				case 0: System.out.println("*** 프로그램이 종료됩니다. ***"); break;
				default: System.out.println("@@@ 메뉴 번호 잘못 입력 @@@");
			}
			
		}while(input != 0);
	}

	
	/**
	 * 1. 전체 조회
	 * - BookService의 필드 bookList를 얻어와
	 *  일반 for문을 이용하여 모든 요소 정보 출력
	 *  
	 *  단, bookList에 저장된 정보가 없으면 
	 *   "저장된 책이 존재하지 않습니다." 출력
	 */
	private void selectAll() {
		System.out.println("\n### 전체 조회 ###\n");
		
		List<BookDTO> list = service.getBookList();
		
		// 전달받은 list에 데이터가 있는지 확인
		
		// int size() : 저장된 객체의 개수 반환
		// boolean isEmpty() : 저장된 객체가 없으면 true 반환		
		
//	if( list.size() == 0 ) {
		if( list.isEmpty() ) {
			System.out.println("저장된 책이 존재하지 않습니다.");
			return;
		}
		
		// 모든 요소 정보 출력
		for(int i=0; i<list.size(); i++) {
			// System.out.println(i + ") " + list.get(i).toString());
			System.out.println(i + ") " + list.get(i)); // 자동으로 toString() 붙음
		}
	}
	

	/**
	 * 2. index 번호로 조회
	 * 조회하려는 책의 index 번호를 입력 받아 책 정보 출력
	 * 
	 * - BookService로 부터 index번째 BookDTO 반환받기
	 * 
	 * - 단, index 번호가 bookList의 범위를 초과하면 
	 *  "해당 인덱스에 책이 존재하지 않습니다." 출력
	 */
	private void selectIndex() {
		System.out.println("\n### index 번호로 조회 ###\n");
		
		System.out.print("조회할 책 index 번호: ");
		int index = sc.nextInt();
		
		BookDTO book = service.selectIndex(index);
		
		if(book == null) {
			System.out.println("해당 인덱스에 책이 존재하지 않습니다.");
			return;
		}
		
		// if문이 실행되지 않았다면 책 존재
		System.out.println("제목: " + book.getTitle());
		System.out.println("저자: " + book.getAuthor());
		System.out.println("가격: " + book.getPrice());
		System.out.println("출판사: " + book.getPublisher());
		
	}

	
	/** 
	 * 3. 책 추가하기
	 * 책 정보(제목, 저자, 가격, 출판사)를 입력 받아
	 * BookService의 bookList에 마지막 요소로 추가
	 * 
	 * 단, 모든 정보가 일치하는 책은 추가 X (중복 저장 X)
	 */
	private void addBook() {
		System.out.println("\n### 책 추가하기 ###\n");
		
		System.out.print("제목: ");
		// 엔터가 입력되기 전까지의 문자열 얻어오기(sc.nextLine(): 띄어쓰기 가능)
		String title = sc.nextLine(); 
		// sc.next(): 띄어쓰기 불가
		
		System.out.print("저자: ");
		String author = sc.nextLine();
		
		System.out.print("가격: ");
		int price = sc.nextInt();
		sc.nextLine(); // 입력 버퍼 남은 문자열 제거
		// → sc.next(); / sc.nextInt();등을 수행 후 무조건 작성
		
		System.out.print("출판사: ");
		String publisher = sc.nextLine();
		
		// 서비스 호출
		// BookService.java - public boolean addBook(BookDTO book) {
		// 전달 인자: BookDTO 타입, 결과: boolean으로 저장
		boolean result 
			= service.addBook(new BookDTO(title, author, price, publisher));
		
		if(result) { // 추가 성공
			System.out.println(title + " 책이 추가되었습니다.");
			
		} else { // 추가 실패
			System.out.println(title + " 책이 이미 존재합니다.");
		}
	}
	
	
	/** 
	 * 4. 책 가격 수정하기
	 * 인덱스 번호를 입력 받아
	 * - 해당 인덱스에 책이 없다면
	 *  → "해당 인덱스에 책이 존재하지 않습니다." 출력
	 *  
	 * - 책이 있다면
	 *  1) "수정할 가격 입력: " 출력
	 *  2) 스캐너로 가격 입력받기
	 *  3) 입력받은 index번째 요소의 가격 수정
	 *  4) "[책제목] 가격이 [이전 가격] → [수정된 가격]으로 수정되었습니다." 출력
	 */
	private void modifyBookPrice() {
		System.out.println("\n### 책 가격 수정하기 ###\n");
		
		System.out.print("수정할 인덱스 번호: ");
		int index = sc.nextInt();
		
		// 미리 만들어놓은 selectIndex 메서드 이용해서
		// index번째 요소 얻어오기(없으면 null 반환)
		BookDTO target = service.selectIndex(index);
		
		// 해당 인덱스에 책이 존재하지 않는 경우
		if(target == null) {
			System.out.println("해당 인덱스에 책이 존재하지 않습니다.");
			return;
		}
		
		// 해당 인덱스에 책이 존재하는 경우
		System.out.print("수정할 가격 입력: ");
		int newPrice = sc.nextInt();
		
		int oldPrice = target.getPrice(); // 이전 가격을 저장
		target.setPrice(newPrice); 				// 새 가격으로 변경
		
		System.out.printf("[%s] 가격이 [%d] → [%d]으로 수정되었습니다.\n",
											target.getTitle(), oldPrice, newPrice);
	}
	
	/* 다른 풀이 방법(BookService.java와 분리) - 조금 더 객체 지향적인 방법 */
	private void modifyBookPrice2() {
		System.out.println("\n### 책 가격 수정하기 ###\n");
		
		System.out.print("수정할 인덱스 번호: ");
		int index = sc.nextInt();
		
		// 전달받은 index가 정상 범위 내에 있는지, 실제 존재하는지 확인
		// index 범위 초과 시(= 해당 인덱스에 존재X)
		if(service.checkIndex(index) == false) { 
			System.out.println("해당 인덱스에 책이 존재하지 않습니다.");
			return;
		}
		
		// 해당 index가 정상 범위 내에 있을 경우(= 해당 인덱스에 존재O)
		System.out.print("수정할 가격 입력: ");
		int newPrice = sc.nextInt();
		
		// 서비스 호출
		System.out.println(service.modifyBookPrice2(index, newPrice));
	}
	
	/** 
	 * 5. 책 제거하기(index)
	 * index 번호를 입력받아 책 제거
	 * 
	 * 단, 해당 index에 책이 없으면(= 인덱스 범위 초과 시)
	 * "해당 인덱스에 책이 존재하지 않습니다." 출력
	 * 
	 * 해당 index에 책이 있으면 
	 * "[책제목] 책이 제거되었습니다." 출력
	 */
	private void removeBook() {
		System.out.println("\n### 책 제거하기(index) ###\n");
		
		System.out.print("제거할 책 인덱스 번호: ");
		int index = sc.nextInt();
		
		// 서비스 호출
		BookDTO target = service.removeBook(index);
		
		if(target == null) {
			System.out.println("해당 인덱스에 책이 존재하지 않습니다." );
		} else {
			System.out.printf("[%s] 책이 제거되었습니다.\n",
												target.getTitle());
		}
		
	}
	
	
	/** 
	 * 6. 제목이 일치하는 책 한 권 조회하기
	 * 책 제목을 입력받아서 일치하는 책 정보 출력
	 * 단, 제목이 일치하는 책이 없다면 "검색 결과 없음" 출력
	 */
	private void selectTitle() {
		System.out.println("\n### 제목이 일치하는 책 조회하기 ###\n");
		System.out.print("검색할 책 제목 입력: ");
		String title = sc.nextLine();
		
		// 서비스 호출
		// public BookDTO selectTitle(String title) {
		// BookService.java 반환형 = BookDTO
		BookDTO book = service.selectTitle(title);
		
		if(book == null) {
			System.out.println("검색 결과 없음");
		} else { // selectIndex
			System.out.println("제목: " + book.getTitle());
			System.out.println("저자: " + book.getAuthor());
			System.out.println("가격: " + book.getPrice());
			System.out.println("출판사: " + book.getPublisher());
			
		}
	}
	
	
	/**
	 * 7. 제목이 일치하는 책 제거하기
	 * 제목이 일치하는 책 제거
	 */
	private void removeBookTitle() {
		System.out.println("\n### 제목이 일치하는 책 제거하기 ###\n");
		
		System.out.print("제거할 책 제목 입력: ");
		String title = sc.nextLine();
		
		// 제거 서비스 호출
		boolean result = service.removeBookTitle(title);
		
		if(result) { // true인 경우
			System.out.printf("[%s] 책이 제거 되었습니다.\n", title);
		} else {
			System.out.println("검색 결과 없음");
		}
	}
	
	
	/**
	 * 8. 출판사가 일치하는 책 모두 조회하기
	 * 입력받은 출판사가 일치하는 모든 책 조회
	 */
	private void selectPublisherAll() {
		System.out.println("\n### 출판사가 일치하는 책 모두 조회하기 ###\n");
		
		System.out.print("출판사 입력: ");
		String publisher = sc.nextLine();
		
		// 조회 서비스 호출(결과 개수: 0 ~ n개)
		List<BookDTO> searchList = service.selectPublisherAll(publisher);
		
		// 조회 결과가 없을 경우
		// searchList 무조건 객체 참조(주소 저장)하지만 값이 없을 수 있음 
		// → null(주소X) 사용 불가
//	if(searchList == null) { (X)	
		
		// List에 저장된 객체가 없을 경우
//	if(searchList.size() == 0) {
		if(searchList.isEmpty()) { 
			System.out.println("검색 결과 없음");
			return;
		}
		
		// 결과 있으면 다 출력
		for(BookDTO book : searchList) { 
			System.out.println(book);
		}
		
	}
	
	
	/**
	 * 9. 저자가 일치하는 책 모두 조회하기
	 * 입력 받은 저자가 일치하는 모든 책 조회
	 */
	private void selectAuthorAll() {
		System.out.println("\n### 저자가 일치하는 책 모두 조회하기 ###\n");
		
		System.out.print("저자 입력: ");
		String author = sc.nextLine();
		
		// 조회 서비스 호출(결과 개수: 0 ~ n개)
		List<BookDTO> searchList = service.selectAuthorAll(author);
		
		// List에 저장된 객체가 없을 경우
		if(searchList.isEmpty()) { 
			System.out.println("검색 결과 없음");
			return;
		}
		
		// 결과 있으면 다 출력
		for(BookDTO book : searchList) { 
			System.out.println(book);
		}

	}
	
	
	/**
	 * 10. 검색어가 제목, 저자에 포함된 모든 책 조회하기
	 */
	private void searchBook() {
		System.out.println("\n### 검색어가 제목,저자에 포함된 모든 책 조회하기 ###\n");
		
		System.out.print("검색어 입력 : ");
		String keyword = sc.nextLine();
		
		// 조회 서비스 호출(결과 개수: 0 ~ n개)
		List<BookDTO> searchList = service.searchBook(keyword);
		
		// List에 저장된 객체가 없을 경우
		if(searchList.isEmpty()) { 
			System.out.println("검색 결과 없음");
			return;
		}
		
		// 결과 있으면 다 출력
		for(BookDTO book : searchList) { 
			System.out.println(book);
		}
	}
	
	
	/**
	 * 11. bookList 제목 오름차순으로 정렬시키기
	 */
	private void bookListSorting() {
		System.out.println("\n### 제목 오름차순 정렬시키기 ###\n");
		
		service.bookListSorting();
		
		System.out.println("정렬되었습니다.");
	}

}
