package day7;

class Book{
	String title;
	String author;
	int price;
	
	Book(){
		this("�ڹ��� ����","���ü�",20000);
	}
	
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	String getBookInfo(){
		String s = "å�̸�: "+title+", ����: "+author+", ����: "+price;
		return s;
	}
}

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book();
		System.out.println(b1.getBookInfo());
		
		Book b2 = new Book("�����α׷���","��Ȳ��",10000);
		System.out.println(b2.getBookInfo());
		
		Book b3 = new Book("�ΰ�����","������",12000);
		System.out.println(b3.getBookInfo());
		
		Book b4 = new Book("����н�","��ȣ��",15000);
		System.out.println(b4.getBookInfo());
		
		Book b5 = new Book("�ڿ��� ó��","���м�",18000);
		System.out.println(b5.getBookInfo());
		

	}

}
