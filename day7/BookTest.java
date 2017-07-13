package day7;

class Book{
	String title;
	String author;
	int price;
	
	Book(){
		this("자바의 정석","남궁성",20000);
	}
	
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	String getBookInfo(){
		String s = "책이름: "+title+", 저자: "+author+", 가격: "+price;
		return s;
	}
}

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book();
		System.out.println(b1.getBookInfo());
		
		Book b2 = new Book("웹프로그래밍","최황규",10000);
		System.out.println(b2.getBookInfo());
		
		Book b3 = new Book("인공지능","하진영",12000);
		System.out.println(b3.getBookInfo());
		
		Book b4 = new Book("기계학습","석호식",15000);
		System.out.println(b4.getBookInfo());
		
		Book b5 = new Book("자연어 처리","김학수",18000);
		System.out.println(b5.getBookInfo());
		

	}

}
