package day11;

public class ExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������");
		try{
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result = num1/num2;
			System.out.println("������: "+result);
		} 
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�ΰ��� ���α׷� �ƱԸ�Ʈ�� �Է��ϼ���");
		}
		catch(Exception e){
			System.out.println("������ ����");
			e.printStackTrace();
		
		}
		/*catch(ArithmeticException e){
			System.out.println("�� ��° ���ڴ� 0�� �� �����");
			e.printStackTrace();
//			System.out.println(e);
		}catch(NumberFormatException e){
			System.out.println("���ڸ� �Է��ϼ���");
			e.printStackTrace();
		}*/finally{
			System.out.println("�� ���� �ݵ�� �����մϴ�");
		}
		System.out.println("��������");	
	} 

}
