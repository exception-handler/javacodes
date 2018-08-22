package Question7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import Question5.MainClass;

public class Lear {
	static File f = new File("D:\\Demo\\lear.txt");

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		int lineCount = 0;
		int wordCount = 0;
		int charCount = 0;
		String str = "";
		while ((str = br.readLine()) != null) {
			lineCount++;
			String str1[] = str.split(" ");
			for (String s : str1) {
				wordCount++;
			}
			char c[] = str.toCharArray();
			for (char c1 : c) {
				charCount++;
			}
		}

		System.out.println("Total no of lines : " + lineCount);
		System.out.println("File name : " + f.getName());
		System.out.println("total char : " + charCount);
		System.out.println("total words : " + wordCount);
	}

}
