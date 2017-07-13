package day7;

class Member{
	String name;
	String account;
	String passwd;
	int birthyear;
	
	Member(String name, String account,String passwd, int birthyear){
		this.name = name;
		this.account = account;
		this.passwd = passwd;
		this.birthyear = birthyear;
	}
	
	@Override
	public String toString(){
		return name +"("+account+", "+passwd+", "
				+birthyear+")";
	}
}

public class MemberTest {

	public static void main(String[] args) {
		Member m1 = new Member("박우진","a123","123",1993);
		Member m2 = new Member("고종익","b123","123",1993);
		Member m3 = new Member("진재언","c123","123",1993);
		
		System.out.println("회원1 : "+m1);
		System.out.println("회원1 : "+m2);
		System.out.println("회원1 : "+m3);
		
	}

}