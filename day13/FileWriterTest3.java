package day13;
import java.io.*;
public class FileWriterTest3 {
    public static void main(String args[]) {      
        try (FileWriter  writer = new FileWriter("test3.txt", true)){ 
        	PrintWriter out = new PrintWriter(writer);
            char arr[] = { '��', 'ü', '��', '��', '��', '��', 'J', 'a', 'v', 'a' };          
            for (int cnt = 0; cnt < arr.length; cnt++)
                out.print(arr[cnt]);
            out.println();
            out.println(arr);
            out.println("OCJP ���� ���");
            out.println(3.14);
            out.println(true);
            System.out.println("��� �Ϸ�");
        } catch (IOException ioe) {
            System.out.println("���Ϸ� ����� �� �����ϴ�.");
        } 
    }
}
