package day13;
import java.io.*;
public class FileWriterTest2 {
    public static void main(String args[]) {      
        try (FileWriter  writer = new FileWriter("test2.txt", true)){         
            char arr[] = { '��', 'ü', '��', '��', '��', '��', 'J', 'a', 'v', 'a' };          
            for (int cnt = 0; cnt < arr.length; cnt++)
                writer.write(arr[cnt]);
            writer.write('\n');
            writer.write(arr);
            writer.write('\n');
            writer.write("OCJP ���� ���");
            writer.write('\n');
            writer.write(3.14+"");
        } catch (IOException ioe) {
            System.out.println("���Ϸ� ����� �� �����ϴ�.");
        } 
    }
}
