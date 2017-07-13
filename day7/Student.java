package day7;

public class Student {
	String name;
	int grade;
	int age;
	
	void study(String subject){
		System.out.println(name+"은 "+subject+"를 학습합니다.");
	}
	
	void printInfo(){
		System.out.println("이름: "+name+" 학년: "+grade
					 + " 나이 : "+age);
	}
}
