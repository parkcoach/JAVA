package day3;
import java.util.*;
import java.io.*;

/*
ǥ���Է����� 10������ �Է¹����� �ش� ���� 2������ ��ȯ�Ͽ� 
��ġ���� 10������ ���Ͽ� ����϶�.
Input ù ��° �࿡�� �׽�Ʈ ���̽� ��(T)�� �Է¹ް�, 
�� ���� �ش��ϴ¸�ŭ �׽�Ʈ ���̽��� �Էµȴ�.

�� Ǯ�̿���(12�� �Է¹��� ���)
12(10����) -> 1100(10������ 2������ ��ȯ) -> 
0011(1100 �������� ��ġ) -> 3(��ġ ���� 10������ ��ȯ)
���� : 3

Input ��
=======================
4
12   ->1100  ->0011 ->3
5    ->0101  ->1010 ->10
10   ->1010 ->0101 ->5
8    ->1000 ->0111 ->7


Output ��
=======================
3
10
5
1
 */
public class ExamTest4 {


	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());

		while(test_case-- > 0){
			int num = Integer.parseInt(br.readLine());
			String binary_num = Integer.toBinaryString(~num);
			String binary_4 = binary_num.substring(28,32);

			int ans= 0;
			for(int i=3;i>=0;i--){
				char ch = binary_4.charAt(i);
				if(ch=='1'){
					ans += Math.pow(2, 3-i);
				}
			}
			System.out.println(ans);
		}

	}
}







