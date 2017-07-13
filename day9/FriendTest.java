package day9;

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

public class FriendTest {

	public static void main(String[] args) {
		Friend[] f = new Friend[5];
		f[0] = new Friend("박우진","010-3310-6513","a@naver.com");
		f[1] = new Friend("고종익","010-3310-0000","b@naver.com");
		f[2] = new Friend("김서연","010-3310-1234","c@naver.com");
		f[3] = new Friend("오동수","010-3310-3456","d@naver.com");
		f[4] = new Friend("진재언","010-3310-0987","e@naver.com");
		
		System.out.println("이름\t전화번호\t\t이메일");
		for(int i=0;i<f.length;i++){
			System.out.println(f[i].getInfo());
		}
		

	}

}
