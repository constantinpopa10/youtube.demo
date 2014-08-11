package scjp.chapter6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestingStrings {

	public static void main (String[] args ) throws IOException
	{
		//testStrings();
		
		createFile();	

		//createFolder();
	}

	private static void testStrings() {
		String x = "airplane";
		x.intern();
		//System.out.println( x.charAt(3));
		StringBuilder sb = new StringBuilder("abc");
		sb.append( x.charAt(0)).reverse().insert(0, 10);
		//System.out.println(sb.toString());
	}

	private static void createFile() throws IOException {
		File file = new File("texts2.txt");
		boolean newFile = file.createNewFile();

		System.out.println("Created new file: " + newFile);
		
		file.delete();

		System.out.println("File texts2.txt exists: " + file.exists());
		
		
		char[] in = new char[50];
		
		//FileWriter fw = new FileWriter(file);
		FileWriter fw = new FileWriter(file, false) ;
	
		//PrintWriter pr = new PrintWriter(fw);
		
		PrintWriter pr = new PrintWriter("texts2.txt");
		pr.println("Hello");
		pr.println("World");
		pr.println("World2");
		pr.println("World3");
		
		pr.println(new Integer(2));
		boolean hasErrors = pr.checkError();
		fw.flush();
		pr.close();
		fw.close();
		
		FileReader fr = new FileReader(file);
		//int size = fr.read( in);
		//System.out.println("File size: " + size);
		System.out.println("Errors encountered: " + hasErrors);
		
		BufferedReader br = new BufferedReader(fr);
		System.out.println("First line from the file read with BufferedReader: "+br.readLine());
		/*for (char c : in)
		{
			System.out.print(c);			
		}*/
		br.close();
		fr.close();		
	}

	private static void createFolder() throws IOException {
		File testDir = new File("testDir");
		testDir.mkdir();
		File testFileInDir = new File( testDir,"testFileInDir.txt");
		testFileInDir.createNewFile();
		System.out.println("Folder created: " + testDir.exists() + " File created: " + testFileInDir.exists());
		
		
		
		
		
		
	}
}
