package day5;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final char DECO_MARK = '$';
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();
			
			for(int i=1;i<=num;i++){
				for(int j=1;j<=i;j++){
					System.out.print(DECO_MARK);
				}
				System.out.println();
			}
			System.out.print("��� �����Ϸ��� y�� �Է��ϼ���: ");
			String answer= sc.next();
			if(!answer.equals("y")){
				System.out.println("������ �����մϴ�.");
				break;
			}		
		}
		sc.close();
	}
}