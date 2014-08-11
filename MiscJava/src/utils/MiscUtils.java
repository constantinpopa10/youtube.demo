package utils;

import static org.fusesource.jansi.Ansi.ansi;
import static org.fusesource.jansi.Ansi.Color.GREEN;
import static org.fusesource.jansi.Ansi.Color.RED;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;
import org.fusesource.jansi.AnsiConsole;

import coursera_algorithms.allClasses.stdlib.StdIn;

public class MiscUtils {
	public static final String ALGORITHMS_SAMPLE_DATA = "C:\\Users\\Costi\\Google Drive\\Coursera-Algorithms\\Algorithms I\\Algorithms-DATA\\algs4-data\\";
	public static String FILE_NAME = "tinyUF.txt";
	public static int ARRAY_VM_MAX_SIZE = 1024*1024*10;
	private static boolean USE_CONSOLE = true;
	public static String CHAR_STOP = "*";

	public static String[] readStrings() throws IOException, FileNotFoundException {
		String[] a = IOUtils.toString(new FileInputStream(ALGORITHMS_SAMPLE_DATA + FILE_NAME)).split("\\p{javaWhitespace}+");
		return a;
	}

	public static int[] readIntsWithScanner() throws IOException, FileNotFoundException {
		String a = IOUtils.toString(new FileInputStream(ALGORITHMS_SAMPLE_DATA + FILE_NAME));
		
		Scanner s = new Scanner(a);
		Scanner s2 = new Scanner(a);
		int k = 0;		
		while (s.hasNextInt()) {
			k++;
			s.nextInt();
		}
		s.close();
		int[] bits = new int[k];
		k=0;
		while (s2.hasNextInt()) {
			bits[k] = s2.nextInt();
			k++;
		}
		s2.close();
		return bits;
	}
	
	public static int[] readUFArray() throws IOException{
		int[] array = null;		
		FileReader fr = new FileReader(ALGORITHMS_SAMPLE_DATA + FILE_NAME);
		BufferedReader bf = new BufferedReader(fr);
		String line = bf.readLine(); 
		array = new int[new Integer(line)];
		Arrays.fill(array, -1);
		line = bf.readLine(); 
		while (line != null){			
			String[] numbers = line.split(StdIn.WHITESPACE_PATTERN.pattern());
			array[getInt(numbers[0])] = getInt(numbers[1]);
			line = bf.readLine();
		}
		bf.close();
		return array;
	}
	
	private static int getInt(String str){
		return new Integer(str).intValue();
	}
	
	public static void printBits(int[] bits, String positions) {
		System.setProperty("jansi.passthrough", "true");	
		//System.out.println("Hello \u001b[1;31m\u001b[9mred\u001b[0m world!");		
		//new AnsiRenderer().render("@|bold xxxxxxxxxxxxxxxxxxxxxxxxxxxx|@");
		//System.out.print(ansi().bg(GREEN).a("TEST").a(" WORK").a(Attribute.UNDERLINE).reset());
		
		if (USE_CONSOLE){
			AnsiConsole.systemInstall();					 
		}		
		System.out.println();
		int sss = new String(new Integer(bits.length).toString()).length();
		int lowerBound = Integer.MIN_VALUE;
		int upperBound = Integer.MAX_VALUE;
		if (positions != null) {
			String[] position = positions.split("\\s");
			lowerBound = Integer.parseInt(position[0]);
			upperBound = Integer.parseInt(position[1]);

		}
		System.out.print(" ");  
		for (int k = 0; k < bits.length; k++) {

			System.out.print(String.format("%" + (sss + 1) + "s", "_").replace(" ", "_"));
		}

		System.out.println();
		System.out.print("|");
		for (int k = 0; k < bits.length; k++) {
			printInterval(bits, sss, lowerBound, upperBound, bits[k], k);
		}
		System.out.print("|");
		System.out.println();
		System.out.print(" ");
		for (int k = 0; k < bits.length; k++) {
			System.out.print(String.format("%" + (sss + 1) + "s", "=").replace(" ", "="));
		}
		System.out.println();
		System.out.print("|");
		for (int k = 0; k < bits.length; k++) {
			printInterval(bits, sss, lowerBound, upperBound, k, k);
		}
		System.out.print("|");
		System.out.println();

		if (USE_CONSOLE)
			AnsiConsole.systemUninstall();
	}
	
	@SuppressWarnings("static-access")
	private static void printInterval(int[] bits, int sss, int lowerBound, int upperBound, int value, int k) {
		if (k >= lowerBound && k <= upperBound) {
			if (USE_CONSOLE) {
				System.out.print(ansi().bg(GREEN).a(String.format("%" + (sss + 1) + "s", value)).reset());				
			} else {
				System.err.printf("%" + (sss + 1) + "s", value);
			}
		} else {
			if (USE_CONSOLE) {
				System.out.print(ansi().fg(RED).a(String.format("%" + (sss + 1) + "s", value)).reset());
			} else {
				System.out.printf("%" + (sss + 1) + "s", value);
			}
		}
	}
}
