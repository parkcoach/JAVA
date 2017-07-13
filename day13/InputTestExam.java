package day13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputTestExam {

	public static void main(String[] args) {
		print(input());
	}

	public static ArrayList<String> input() {
		ArrayList<String> list = new ArrayList<String>();
		//FileReader reader = null;
		//BufferedReader br = null;
		try (FileReader reader = new FileReader("studylist.txt");
			BufferedReader br = new BufferedReader(reader)){			
			while (true) {
				String data = br.readLine();
				if (data == null)
					break;
				list.add(data);
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		} /*finally {
			try {
				if (br != null)
					br.close();
				if (reader != null)
				    reader.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}*/
		return list;
	}

	public static void print(ArrayList<String> list) {
		if (!list.isEmpty()) {
			System.out.println("출력합니다.");
			for (int i = 0; i < list.size(); i++)
				System.out.println(list.get(i));
		} else
			System.out.println("출력할 데이터가 없습니다.");		
	}
}













