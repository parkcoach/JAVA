package day7;

public class Student {
	String name;
	int grade;
	int age;
	
	void study(String subject){
		System.out.println(name+"�� "+subject+"�� �н��մϴ�.");
	}
	
	void printInfo(){
		System.out.println("�̸�: "+name+" �г�: "+grade
					 + " ���� : "+age);
	}
}
