import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListBenchmark {

	public static final int MAX = 100000;

	public static void main(String[] args) {
		System.out.println("List Benchmark by Caio R. Pereira");
		System.out.println("Pure Array Time: " + benchmarkArray(100) + " ms");
		System.out.println("List -> ArrayList Time: " + benchmarkListArrayList(100) + " ms");
		System.out.println("List -> LinkedList Time: " + benchmarkListLinkedList(100) + " ms");
		System.out.println("List -> Vector Time: " + benchmarkListVector(100) + " ms");
	}

	public static long benchmarkArray(Integer val) {
		Integer[] array = new Integer[MAX];
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array[i] = val;
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	public static long benchmarkListArrayList(Integer val) {
		List<Integer> array = new ArrayList<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	public static long benchmarkListLinkedList(Integer val) {
		List<Integer> array = new LinkedList<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	public static long benchmarkListVector(Integer val) {
		List<Integer> array = new Vector<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	public static long benchmarkCollectionLinkedList(Integer val) {
		Collection<Integer> array = new LinkedList<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}
}
