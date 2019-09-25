package fileStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Buffer {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("c:/1.txt")));
		String str = br.readLine(); //¶ÁÈ¡Ò»ÐÐ
		System.out.println(str);
		br.close();
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:/1.txt")));
		bw.write("¹þ¹þ¹þ");
		bw.close();
	}
}
