package list.run;

import list.view.BookView;

public class BookRun {
	public static void main(String[] args) {
		// Run - View - Service - DTO 순서로 창 띄워놓고 보기
		new BookView().displayMenu();
	}
}
