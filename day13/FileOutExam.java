package day13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FileOutExam {

	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			writer = new FileWriter ("c:/workspace/today.txt");
			GregorianCalendar cal = new GregorianCalendar();
			 writer.write("오늘은 " + cal.get(Calendar.YEAR) + "년 "+ (cal.get(Calendar.MONTH)+1) +"월 "+ cal.get(Calendar.DAY_OF_MONTH) + "일 입니다.");
			 writer.write("\n");
			 int day = cal.get(Calendar.DAY_OF_WEEK);
			 writer.write("오늘은 " + FindDay(day) + "입니다.");
			 writer.write("\n");
			 
			cal.set(1993, 7, 29);
			day = cal.get(Calendar.DAY_OF_WEEK);
			 writer.write("박우진은 " + FindDay(day) + "에 태어났습니다." );
			System.out.println("저장이 완료되었습니다.");
		} catch (IOException e) {
			System.out.println("저장을 실패했습니다.");
		} finally {
			try {
				if(writer != null)
					writer.close();
			} catch (IOException e1) {
				System.out.println("파일을 닫는동안 오류가 발생했습니다.");
			}			
		}
	}

	static String FindDay(int day) {
		String dayofweek = "";
		switch (day) {
		case 1:
			dayofweek = "일요일";
			break;
		case 2:
			dayofweek = "월요일";
			break;
		case 3:
			dayofweek = "화요일";
			break;
		case 4:
			dayofweek = "수요일";
			break;
		case 5:
			dayofweek = "목요일";
			break;
		case 6:
			dayofweek = "금요일";
			break;
		default:
			dayofweek = "일요일";
		}
		return dayofweek;
	}
}
