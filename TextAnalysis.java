// Amanda Jeong, Libby Carter
// Part 3 Text Analysis

import java.io.*;
import java.util.Scanner;

public class TextAnalysis
{
	public static void main(String[] args) throws IOException
	{
		int moreThan15 = 0;
		int count = 0;
		String textFile = "test.txt";
		Histogram2 h = new Histogram2(15);
		
		Scanner fileScan = new Scanner(new File(textFile));
		
		String title = fileScan.nextLine();
		String input, word;
		
		while(fileScan.hasNext()) {
			input = fileScan.next();
			word = input.replaceAll("\\p{Punct}", " ");
			
			if (word.length() > 15)
				moreThan15++;
			else h.submit(word.length());
			count++;
		}
		
		System.out.println("Text name: " + title );
		System.out.println("Word count: " + count);
		System.out.println("Words with more than 15 characters: " + moreThan15);
		System.out.println("\nHistogram of words length 1 to 15 characters:");
		System.out.println(h);
		
	}
}