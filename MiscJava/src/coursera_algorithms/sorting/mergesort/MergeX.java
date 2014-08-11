package coursera_algorithms.sorting.mergesort;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

import coursera_algorithms.allClasses.stdlib.StdIn;
import coursera_algorithms.allClasses.stdlib.StdOut;

/*************************************************************************
 *  Compilation:  javac MergeX.java
 *  Execution:    java MergeX < input.txt
 *  Dependencies: StdOut.java StdIn.java
 *  Data files:   http://algs4.cs.princeton.edu/22mergesort/tiny.txt
 *                http://algs4.cs.princeton.edu/22mergesort/words3.txt
 *   
 *  Sorts a sequence of strings from standard input using an
 *  optimized version of mergesort.
 *   
 *  % more tiny.txt
 *  S O R T E X A M P L E
 *
 *  % java MergeX < tiny.txt
 *  A E E L M O P R S T X                 [ one string per line ]
 *    
 *  % more words3.txt
 *  bed bug dad yes zoo ... all bad yet
 *  
 *  % java MergeX < words3.txt
 *  all bad bed bug dad ... yes yet zoo    [ one string per line ]
 *
 *************************************************************************/
/*************************************************************************
 *  Compilation:  javac MergeX.java
 *  Execution:    java MergeX < input.txt
 *  Dependencies: StdOut.java StdIn.java
 *  Data files:   http://algs4.cs.princeton.edu/22mergesort/tiny.txt
 *                http://algs4.cs.princeton.edu/22mergesort/words3.txt
 *   
 *  Sorts a sequence of strings from standard input using an
 *  optimized version of mergesort.
 *   
 *  % more tiny.txt
 *  S O R T E X A M P L E
 *
 *  % java MergeX < tiny.txt
 *  A E E L M O P R S T X                 [ one string per line ]
 *    
 *  % more words3.txt
 *  bed bug dad yes zoo ... all bad yet
 *  
 *  % java MergeX < words3.txt
 *  all bad bed bug dad ... yes yet zoo    [ one string per line ]
 *
 *************************************************************************/

/**
 * The <tt>MergeX</tt> class provides static methods for sorting an array using
 * an optimized version of mergesort.
 * <p>
 * For additional documentation, see <a
 * href="http://algs4.cs.princeton.edu/22mergesort">Section 2.2</a> of
 * <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 * 
 * @author Robert Sedgewick
 * @author Kevin Wayne
 */
public class MergeX {
	private static final int CUTOFF = 7; // cutoff to insertion sort
	private static final String FILE_NAME = "alphabet.txt";

	// This class should not be instantiated.
	private MergeX() {
	}

	private static void merge(Comparable[] src, Comparable[] dst, int lo,
			int mid, int hi) {

		// precondition: src[lo .. mid] and src[mid+1 .. hi] are sorted
		// subarrays
		assert isSorted(src, lo, mid);
		assert isSorted(src, mid + 1, hi);

		int i = lo, j = mid + 1;
		for (int k = lo; k <= hi; k++) {
			if (i > mid)
				dst[k] = src[j++];
			else if (j > hi)
				dst[k] = src[i++];
			else if (less(src[j], src[i]))
				dst[k] = src[j++]; // to ensure stability
			else
				dst[k] = src[i++];
		}

		// postcondition: dst[lo .. hi] is sorted subarray
		assert isSorted(dst, lo, hi);
	}

	private static void sort(Comparable[] tempArray, Comparable[] originalArray, int lo, int hi) {
		// if (hi <= lo) return;
		if (hi <= lo + CUTOFF) {
			insertionSort(originalArray, lo, hi);
			return;
		}
		int mid = lo + (hi - lo) / 2;
		sort(originalArray, tempArray, lo, mid);
		sort(originalArray, tempArray, mid + 1, hi);

		// if (!less(src[mid+1], src[mid])) {
		// for (int i = lo; i <= hi; i++) dst[i] = src[i];
		// return;
		// }

		// using System.arraycopy() is a bit faster than the above loop
		if (!less(tempArray[mid + 1], tempArray[mid])) {
			System.arraycopy(tempArray, lo, originalArray, lo, hi - lo + 1);			
			return;
		}
		
        //copy from tempArray into originalArray(sorted)
		merge(tempArray, originalArray, lo, mid, hi);
	}

	/**
	 * Rearranges the array in ascending order, using the natural order.
	 * 
	 * @param originalArray
	 *            the array to be sorted
	 */
	public static void sort(Comparable[] originalArray) {
		Comparable[] tempArray = originalArray.clone();
		sort(tempArray, originalArray, 0, originalArray.length - 1);
		assert isSorted(originalArray);
	}

	// sort from a[lo] to a[hi] using insertion sort
	private static void insertionSort(Comparable[] a, int lo, int hi) {
		for (int i = lo; i <= hi; i++)
			for (int j = i; j > lo && less(a[j], a[j - 1]); j--)
				exch(a, j, j - 1);
	}

	// exchange a[i] and a[j]
	private static void exch(Comparable[] a, int i, int j) {
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

	// is a[i] < a[j]?
	private static boolean less(Comparable a, Comparable b) {
		return (a.compareTo(b) < 0);
	}

	/***********************************************************************
	 * Check if array is sorted - useful for debugging
	 ***********************************************************************/
	private static boolean isSorted(Comparable[] a) {
		return isSorted(a, 0, a.length - 1);
	}

	private static boolean isSorted(Comparable[] a, int lo, int hi) {
		for (int i = lo + 1; i <= hi; i++)
			if (less(a[i], a[i - 1]))
				return false;
		return true;
	}

	// print array to standard output
	private static void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			StdOut.println(a[i]);
		}
	}

	/**
	 * Reads in a sequence of strings from standard input; mergesorts them
	 * (using an optimized version of mergesort); and prints them to standard
	 * output in ascending order.
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// String[] a = StdIn.readAllStrings();
		String[] a = readStrings();
		MergeX.sort(a);
		show(a);
	}

	public static String[] readStrings() throws IOException,
			FileNotFoundException {
		String[] a = IOUtils
				.toString(
						new FileInputStream(
								"F:\\E-Books + Learning stuff\\Coursera-Algorithms\\Algorithms I\\Algorithms-DATA\\algs4-data\\"+ FILE_NAME ))
				.split("\\p{javaWhitespace}+");
		return a;
	}

}
