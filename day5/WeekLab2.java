package day5;

public class WeekLab2 {

	
	public static void main(String[] args) {
		char play[][] = { 
				{ 'X', 'X', 'X', 'R', 'X', 'R'},
				{ 'R', 'X', 'X', 'X', 'X', 'X'},
				{ 'X', 'X', 'R', 'X', 'X', 'X'},
				{ 'R', 'X', 'X', 'F', 'X', 'X'},
				{ 'X', 'R', 'X', 'X', 'X', 'X'},
				{ 'X', 'R', 'X', 'R', 'X', 'R'},
				};
		
		int catchNum = 0;
		/*
		 * R�� �䳢�̰� F�� �����
		 * ����� ���찡 �����ϴ� ��ġ���� �밢���� 
		 * �������θ� �̵� �����ϴ�. 
		 * ���� ���� 2���� �迭 �����Ϳ���
		 * �䳢�� ��� ��ڴ°�?
		 */
		int i_index = 0;
		int j_index = 0;
		for(int i = 0;i<play.length;i++){
			for(int j = 0;j<play[0].length;j++){
				if(play[i][j]=='F'){
					i_index = i;
					j_index = j;
				}
			}
		}
		
		for(int i=0;i<play.length;i++){
			if(i_index-i>=0 && play[i_index-i][j_index]=='R')
				catchNum++;
			if(i_index+i<play.length && play[i_index+i][j_index]=='R')
				catchNum++;
			if(j_index-i>=0 && play[i_index][j_index-i]=='R')
				catchNum++;
			if(j_index+i<play[0].length && play[i_index][j_index+i]=='R')
				catchNum++;
			if(i_index-i>=0 && j_index-i>=0 && play[i_index-i][j_index-i]=='R')
				catchNum++;
			if(i_index-i>=0 && j_index+i <play[0].length && play[i_index-i][j_index+i]=='R')
				catchNum++;
			if(i_index+i<play.length && j_index-i>=0 && play[i_index+i][j_index-i]=='R')
				catchNum++;
			if(i_index+i<play.length && j_index+i<play.length && play[i_index+i][j_index+i]=='R')
				catchNum++;
		}
		
		System.out.printf("����� �䳢�� %d ���� ��´�.", catchNum);		
	}
}