package day11;

public class ExceptionTest1 {

	public static void main(String[] args) {
		System.out.println("main() �������");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main() ��������");
	}

}
