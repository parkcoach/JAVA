package day12;
import java.util.*;

public class LottoSet {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		Random r = new Random();
		for(int i=0;i<10;i++){
			int value = r.nextInt(20)+10;
			if(set.add(value)==false)
				i--;
			else
				set.add(value);
		}
		
		boolean state = false;
		StringBuilder sb = new StringBuilder("오늘의 로또 번호 : ");
		for(int x : set){
			if(state == false){
				sb.append(x);
				state = true;
			}
			else{
				sb.append(", "+x);
			}
		}
		
		System.out.println(sb);

	}

}
