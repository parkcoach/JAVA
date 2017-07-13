package day12;
import java.util.*;

class Person {
	private String name;
	Person(String name){
		this.name = name;
	}
	public String getInfo() {
		return name;
	}
}

class Friend extends Person{
	String phoneNum;
	String email;
	
	Friend(String name, String phoneNum, String email){
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public String getInfo(){
		String s = super.getInfo()+"	"+phoneNum+"	"+email;
		return s;
	}
}

public class FriendTestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Friend> list = new LinkedList<Friend>();
		list.add(new Friend("박우진","010-3310-6513","a@naver.com"));
		list.add(new Friend("고종익","010-3310-0000","b@naver.com"));
		list.add(new Friend("김서연","010-3310-1234","c@naver.com"));
		list.add(new Friend("오동수","010-3310-3456","d@naver.com"));
		list.add(new Friend("진재언","010-3310-0987","e@naver.com"));
		
		System.out.println("이름\t전화번호\t\t이메일");
		
		for(Friend f : list){
			System.out.println(f.getInfo());
		}

	}

}
