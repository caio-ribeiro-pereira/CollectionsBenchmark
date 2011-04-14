import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class DequeBenchmark {

	public static final int MAX = 10000000;
	public static final Object VAL = "TEST";

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Java SE 6 Collections Benchmark");
		System.out.println("Realizando testes com variações da Collection Deque");
		System.out.println("Aperte ENTER para começar!");
		scn.nextLine();
		System.out.println("Inserindo: " + MAX + " Objects");
		System.out.println("Tipo de dado: " + VAL.getClass().getSimpleName());
		System.out.println("Valor: " + VAL);
		System.out.println("Tempo\t|\tTipo de Instancia");
		System.out.println("==========================================================================");
		System.out.println(benchmarkArrayDeque(VAL) + " ms\t|\tArrayDeque -> ArrayDeque");
		System.out.println(benchmarkDequeArrayDeque(VAL) + " ms\t|\tDeque -> ArrayDeque");
		System.out.println(benchmarkQueueArrayDeque(VAL) + " ms\t|\tQueue -> ArrayDeque");
		System.out.println(benchmarkCollectionArrayDeque(VAL) + " ms\t|\tCollection -> ArrayDeque");
		System.out.println(benchmarkAbstractCollectionArrayDeque(VAL) + " ms\t|\tAbstractCollection -> ArrayDeque");
		System.out.println("==========================================================================");

	}

	// ARRAY DEQUE TEST
	public static long benchmarkArrayDeque(Object val) {
		ArrayDeque<Object> array = new ArrayDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkDequeArrayDeque(Object val) {
		Deque<Object> array = new ArrayDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkQueueArrayDeque(Object val) {
		Queue<Object> array = new ArrayDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkCollectionArrayDeque(Object val) {
		Collection<Object> array = new ArrayDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkAbstractCollectionArrayDeque(Object val) {
		AbstractCollection<Object> array = new ArrayDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}
}
