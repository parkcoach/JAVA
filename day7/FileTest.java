package day7;
import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:/workspace/javaexam/src/day1/HelloApp.java");
		if(f.exists()){
			if(f.isDirectory()){
				System.out.println("���丮�Դϴ�.");
			}
			else{
				System.out.println(f.length()+" ����Ʈ�� �����Դϴ�.");
			}
		}
		else{
			System.out.println("������ �������� �ʽ��ϴ�.");
		}

	}

}
