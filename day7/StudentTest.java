package day7;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Student 클래스의 인스턴스를 생성합니다.");
		Student st1 = new Student();
		Student st2 = new Student();
		
		st1.name="고길동";
		st1.grade=90;
		st1.age=40;
		st1.printInfo();
		st1.study("자바");
	}

}
