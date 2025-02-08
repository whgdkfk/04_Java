package list.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import list.dto.BookDTO;

/**
 * 도서 관리 프로그램 기능 제공 클래스
 */
public class BookService {

	private List<BookDTO> bookList = new ArrayList<BookDTO>();
	
	// 기본 생성자
	public BookService() {
		// 샘플 데이터 추가
		bookList.add(new BookDTO("소년이 온다", "한강", 15000, "창비"));
		bookList.add(new BookDTO("초역 부처의 말", "코이케 류노스케", 17800, "포레스트북스"));
		bookList.add(new BookDTO("채식주의자", "한강", 15000, "창비"));
		bookList.add(new BookDTO("작별하지 않는다", "한강", 16800, "문학동네"));
		bookList.add(new BookDTO("모순", "양귀자", 13000, "쓰다"));
	}
	
	// getter
	public List<BookDTO> getBookList(){
		return bookList;
	}
	
	
	/** 
	 * 2. index 번호로 조회
	 * 전달 받은 index 번째 bookList 요소 반환
	 * 단, 범위 초과 시 null 반환
	 * @param index
	 * @return BookDTO 참조 주소 또는 null(참조하고 있는 것이 없다.)
	 */
	public BookDTO selectIndex(int index) {
		
		// 범위 초과 검사 → 초과 시
		if(checkIndex(index) == false) return null;
		return bookList.get(index);
	}

	
	/**
	 * 전달받은 index가 정상 범위인지 확인
	 * @param index
	 * @return 정상 true, 아니면 false
	 */
	public boolean checkIndex(int index) {
		
		// 범위 초과 시 false
		if(index < 0 || index >= bookList.size()) {
			return false;
		}
		
		return true; // 정상 범위 true
	}
	
	
	/** 
	 * 3. 책 추가하기
	 * 전달받은 book을 bookList에 추가
	 * 단, 책 정보가 모두 일치하는 책이 있다면 추가X
	 * @param book
	 * @return 추가 O: true, 추가 X: false
	 */
	public boolean addBook(BookDTO book) {
		
		// 책 정보 비교 방법1) 필드 값 하나씩 꺼내서 비교
		// 책 정보 비교 방법2) equals() 오버라이딩 후 이용
		
		// bookList에서 꺼낸 b와 전달받은 book이 같으면 추가X → false 반환
//	for(BookDTO b : bookList) {
//		if(b.equals(book)) return false;
//	}
		
		// BookDTO의 equals()를 오버라이딩 했기 때문에
		// List가 제공하는 contains() (포함하는지 확인) 사용 가능
		if(bookList.contains(book)) return false;
		
		
		// 컬렉션은 크기 제한이 없어서 무조건 추가 성공(true 반환으로 고정되어 있음)
		return bookList.add(book); 
	}
	
	
	/** 
	 * 4. 책 가격 수정하기
	 * 전달 받은 index번째 요소의 가격을 newPrice로 수정
	 * @param index
	 * @param newPrice
	 * @return "[책제목] 가격이 [이전 가격] → [수정된 가격]으로 수정되었습니다."
	 */
	public String modifyBookPrice2(int index, int newPrice) {
		
		BookDTO target = bookList.get(index); // 인덱스번째 요소 얻어오기
		int oldPrice = target.getPrice(); // 이전 가격 저장
		target.setPrice(newPrice); // 새 가격으로 수정
		
		return String.format("[%s] 가격이 [%d] → [%d]으로 수정되었습니다.", 
													target.getTitle(), oldPrice, newPrice);
	}
	
	
	/** 
	 * 5. 책 제거하기(index)
	 * index 번째 BookDTO 제거
	 * 단, 없으면 null 반환
	 * 제거 성공하면 제거된 BookDTO 반환
	 * @param index
	 */
	public BookDTO removeBook(int index) {
		
//	if(!checkIndex(index)) return null;
		if(checkIndex(index) == false) return null;
		
		// bookList에서 index 번째 요소를 제거
		// == index 번째 요소를 뽑아냄(빈칸 알아서 채움)
		return bookList.remove(index);
	}
	
	
	/** 
	 * 6. 제목이 일치하는 책 한 권 조회하기
	 * 제목이 일치하는 책 반환
	 * @param title: 찾으려는 책 제목
	 */
	public BookDTO selectTitle(String title) {
		
		// bookList에서 하나씩 꺼냄
		for(BookDTO book : bookList) { 
			
			// 꺼낸 책의 제목(book.getTitle())과 전달받은 책(title)의 제목이 같을경우
			if(book.getTitle().equals(title)) {
				return book;
			}
		}
		// 책을 못 찾은 경우 null 반환
		return null; 
	}
	

	/**
	 * 7. 제목이 일치하는 책 제거하기
	 * 입력 받은 제목과 일치하는 제목을 가지는 bookList의 책을 제거
	 * @param title: 입력 받은 제목
	 */
	public boolean removeBookTitle(String title) {
		
		for(BookDTO book : bookList) { // bookList에서 하나씩 꺼냄
			
			// 꺼낸 책의 제목과 전달 받은 책의 제목이 같을 경우
			if(book.getTitle().equals(title)) {
				
				// 지우려는 책: book
				// bookList에서 똑같은 book 찾아서 지우겠다.
				return bookList.remove(book); // 삭제 성공 시 true
				// → bookList에 저장된 객체(BookDTO)가
				//   equals() 오버라이딩이 되어 있어야 사용 가능한 방법
			}
		}
		
		return false;
	}
	
	
	/**
	 * 8. 출판사가 일치하는 책 모두 조회하기
	 * 입력받은 publisher와 같은 출판사를 가지는 책을 모두 조회
	 * @param publisher
	 */
	public List<BookDTO> selectPublisherAll(String publisher) {
		
		// BookDTO 여러 개 저장하는 방법 
		// 1. 배열: BookDTO[]
		// 2. 컬렉션: List<BookDTO>
		
		// 출판사명이 일치하는 책만 저장해둘 List 생성
		// searchList 무조건 객체 참조(new)해서 주소 저장하지만 값이 없을 수 있음
		List<BookDTO> searchList = new ArrayList<BookDTO>();
		
		// 같은 출판사인 책 찾기
		for(BookDTO book : bookList) {
			// bookList에서 한 개씩 꺼낸 book의 출판사가 전달받은 출판사와 일치하면
			if(book.getPublisher().equals(publisher)) { 
				searchList.add(book); // searchList에 찾은 책 추가
			}
		}
		
		// 같은 출판사인 책이 없을 수도, 여러 개일 수도 있음
		// = List에 저장된 요소의 개수: 0 ~ n개
		return searchList; 
	}
	
	
	/**
	 * 9. 저자가 일치하는 책 모두 조회하기
	 * 입력 받은 author와 같은 출판사를 가지는 책을 모두 조회
	 * @param publisher
	 */
	public List<BookDTO> selectAuthorAll(String author) {
		
		// 저자명이 일치하는 책만 저장해둘 List 생성
		List<BookDTO> searchList = new ArrayList<BookDTO>();
		
		// 같은 저자인 책 찾기
		for(BookDTO book : bookList) {
			if(book.getAuthor().equals(author)) { // 저자가 일치하면
				searchList.add(book); // searchList에 찾은 책 추가
			}
		}
		
		// List에 저장된 요소의 개수: 0 ~ n개
		return searchList; 
	}
	
	
	/**
	 * 10. 검색어가 제목, 저자에 포함된 모든 책 조회하기
	 * @param keyword: 검색어
	 * @return 0 ~ n개의 결과를 가지는 List
	 */
	public List<BookDTO> searchBook(String keyword){
		
		List<BookDTO> searchList = new ArrayList<BookDTO>();
		
		// 찾기 시작
		for(BookDTO book : bookList) {
			
			// book의 제목이나 저자에 keyword가 포함된 경우
			if(book.getTitle().contains(keyword) || 
				 book.getAuthor().contains(keyword) ) {
				searchList.add(book);
			}
		}
		
		return searchList;
	}

	
	/**
	 * 11. bookList 제목 오름차순으로 정렬시키기
	 */
	public void bookListSorting() {
		
		// 원본 리스트가 정렬된 형태로 변경됨
		Collections.sort(bookList);
	}

}
