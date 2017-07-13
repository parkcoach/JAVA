package day10;

public class RuntimeTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Runtime r = Runtime.getRuntime(); //팩토리 메소드->객체 생성을 대신하는 일반 메소드
		r.exec("c:/windows/notepad.exe"); //싱글톤 패턴
	}

}
