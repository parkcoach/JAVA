package day3;
import java.util.*;
import java.io.*;

/*
표준입력으로 10진수를 입력받으면 해당 수를 2진수로 변환하여 
역치값의 10진수를 구하여 출력하라.
Input 첫 번째 행에서 테스트 케이스 수(T)를 입력받고, 
그 수에 해당하는만큼 테스트 케이스가 입력된다.

※ 풀이예시(12를 입력받은 경우)
12(10진수) -> 1100(10진수를 2진수로 변환) -> 
0011(1100 이진수를 역치) -> 3(역치 값을 10진수로 변환)
정답 : 3

Input 예
=======================
4
12   ->1100  ->0011 ->3
5    ->0101  ->1010 ->10
10   ->1010 ->0101 ->5
8    ->1000 ->0111 ->7


Output 예
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







