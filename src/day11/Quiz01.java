package day11;
/*
 * 부모 : Book 
 *   필드 : 책이름, 저자, 가격
 * 자식1: Novel
 *   필드 : 책이름, 저자, 가격, 장르
 * 자식2: Cartoon
 *   필드 : 책이름, 저자, 가격, 출판사
 * 자식3: Textbook
 *   필드 : 책이름, 저자, 가격, 과목
 *   
 * => 메소드도 만들어 보세요.. 
 *    e.g. 모든 정보를 sysout, getters, setters
 *    
 * < Override(무효화) >
 * -> 부모가 물려준 메소드를 자식 스타일대로 '바디만' 수정하는 것
 *    원형(중괄호 앞까지)은 유지 
 * -> Book을 물려받은 Novel, Cartoon, Textbook 들의 
 *    '모든 정보를 보여주는 메소드'는 그냥 showData()로 이름을 통일하는 것이 
 *    덜 헷갈리지 않을까?   
 * -> 부모가 물려준 시야를 넓힐 수는 있지만, 좁힐 수는 없다 
 *    부모 : public => 자식 : private (X)
 *    부모 : private => 자식 : public (O) 
 * -> Annotation : jvm에게 건네는 주석
 *    @~~~
 *    @Override
 */
class Book{
	String title; // 책제목 
	String author; // 저자
	int price; // 가격
	
	void showData(){
		System.out.println("책 이름 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("가격 : " + price);
	}
}
class Cartoon extends Book{
	String publisher;
	@Override
	void showData() {
		super.showData();
		System.out.println("출판사 : " + publisher);
	}
}
class Textbook extends Book{
	String subject;
	@Override
	void showData(){
		super.showData();
		System.out.println("과목 : " + subject);
	}
}
class Novel extends Book{
	String genre; 
	void showData(){
		super.showData();
		System.out.println("장르 : " + genre);
	}
}
public class Quiz01 {	
	public static void main(String[] args) {
		Novel n = new Novel(); 
		n.title = "Harry Potter";
		n.genre = "Fantasy";
		n.showData();
	}
}




