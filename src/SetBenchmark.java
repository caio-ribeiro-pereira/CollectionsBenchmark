import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetBenchmark {

	public static final int MAX = 10000000;
	public static final Object VAL = "TEST";

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Java SE 6 Collections Benchmark");
		System.out.println("Realizando testes com variações da Collection Set");
		System.out.println("Aperte ENTER para começar!");
		scn.nextLine();
		System.out.println("Inserindo: " + MAX + " Objects");
		System.out.println("Tipo de dado: " + VAL.getClass().getSimpleName());
		System.out.println("Valor: " + VAL);
		System.out.println("Tempo\t|\tTipo de Instancia");
		System.out.println("==========================================================================");
		System.out.println(benchmarkHashSet(VAL) + " ms\t|\tHashSet -> HashSet");
		System.out.println(benchmarkSetHashSet(VAL) + " ms\t|\tSet -> HashSet");
		System.out.println(benchmarkAbstractSetHashSet(VAL) + " ms\t|\tAbstractSet -> HashSet");
		System.out.println(benchmarkCollectionHashSet(VAL) + " ms\t|\tCollection -> HashSet");
		System.out.println(benchmarkAbstractCollectionHashSet(VAL) + " ms\t|\tAbstractCollection -> HashSet");
		System.out.println("==========================================================================");
		System.out.println(benchmarkLinkedHashSet(VAL) + " ms\t|\tLinkedHashSet -> LinkedHashSet");
		System.out.println(benchmarkSetLinkedHashSet(VAL) + " ms\t|\tSet -> LinkedHashSet");
		System.out.println(benchmarkHashSetLinkedHashSet(VAL) + " ms\t|\tHashSet -> LinkedHashSet");
		System.out.println(benchmarkAbstractSetLinkedHashSet(VAL) + " ms\t|\tAbstractSet -> LinkedHashSet");
		System.out.println(benchmarkCollectionLinkedHashSet(VAL) + " ms\t|\tCollection -> LinkedHashSet");
		System.out.println(benchmarkAbstractCollectionLinkedHashSet(VAL) + " ms\t|\tAbstractCollection -> LinkedHashSet");
		System.out.println("==========================================================================");
		System.out.println(benchmarkTreeSet(VAL) + " ms\t|\tTreeSet -> TreeSet");
		System.out.println(benchmarkSetTreeSet(VAL) + " ms\t|\tSet -> TreeSet");
		System.out.println(benchmarkSortedSetTreeSet(VAL) + " ms\t|\tSortedSet -> TreeSet");
		System.out.println(benchmarkNavigableSetTreeSet(VAL) + " ms\t|\tNavigableSet -> TreeSet");
		System.out.println(benchmarkAbstractSetTreeSet(VAL) + " ms\t|\tAbstractSet -> TreeSet");
		System.out.println(benchmarkCollectionTreeSet(VAL) + " ms\t|\tCollection -> TreeSet");
		System.out.println(benchmarkAbstractCollectionTreeSet(VAL) + " ms\t|\tAbstractCollection -> TreeSet");
		System.out.println("==========================================================================");
		System.out.println(benchmarkConcurrentSkipListSet(VAL) + " ms\t|\tConcurrentSkipListSet -> ConcurrentSkipListSet");
		System.out.println(benchmarkNavigableSetConcurrentSkipListSet(VAL) + " ms\t|\tNavigableSet -> ConcurrentSkipListSet");
		System.out.println(benchmarkSetConcurrentSkipListSet(VAL) + " ms\t|\tSet -> ConcurrentSkipListSet");
		System.out.println(benchmarkSortedSetConcurrentSkipListSet(VAL) + " ms\t|\tSortedSet -> ConcurrentSkipListSet");
		System.out.println(benchmarkAbstractSetConcurrentSkipListSet(VAL) + " ms\t|\tAbstractSet -> ConcurrentSkipListSet");
		System.out.println(benchmarkCollectionConcurrentSkipListSet(VAL) + " ms\t|\tCollection -> ConcurrentSkipListSet");
		System.out.println(benchmarkAbstractCollectionConcurrentSkipListSet(VAL) + " ms\t|\tAbstractCollection -> ConcurrentSkipListSet");
		System.out.println("==========================================================================");
		System.out.println(benchmarkCopyOnWriteArraySet(VAL) + " ms\t|\tCopyOnWriteArraySet - > CopyOnWriteArraySet");
		System.out.println(benchmarkSetCopyOnWriteArraySet(VAL) + " ms\t|\tSet - > CopyOnWriteArraySet");
		System.out.println(benchmarkAbstractSetCopyOnWriteArraySet(VAL) + " ms\t|\tAbstractSet - > CopyOnWriteArraySet");
		System.out.println(benchmarkCollectionCopyOnWriteArraySet(VAL) + " ms\t|\tCollection - > CopyOnWriteArraySet");
		System.out.println(benchmarkAbstractCollectionCopyOnWriteArraySet(VAL) + " ms\t|\tAbstractCollection - > CopyOnWriteArraySet");
	}

	// HASH SET TESTS
	public static long benchmarkHashSet(Object val) {
		HashSet<Object> array = new HashSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkSetHashSet(Object val) {
		Set<Object> array = new HashSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkCollectionHashSet(Object val) {
		Collection<Object> array = new HashSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkAbstractCollectionHashSet(Object val) {
		AbstractCollection<Object> array = new HashSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkAbstractSetHashSet(Object val) {
		AbstractSet<Object> array = new HashSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	// LINKEDHASHSET TESTS
	public static long benchmarkLinkedHashSet(Object val) {
		LinkedHashSet<Object> array = new LinkedHashSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkHashSetLinkedHashSet(Object val) {
		HashSet<Object> array = new LinkedHashSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkAbstractSetLinkedHashSet(Object val) {
		AbstractSet<Object> array = new LinkedHashSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkAbstractCollectionLinkedHashSet(Object val) {
		AbstractCollection<Object> array = new LinkedHashSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkCollectionLinkedHashSet(Object val) {
		Collection<Object> array = new LinkedHashSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkSetLinkedHashSet(Object val) {
		Set<Object> array = new LinkedHashSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	// TREESET TESTS
	public static long benchmarkTreeSet(Object val) {
		TreeSet<Object> array = new TreeSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkSortedSetTreeSet(Object val) {
		SortedSet<Object> array = new TreeSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkNavigableSetTreeSet(Object val) {
		NavigableSet<Object> array = new TreeSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkSetTreeSet(Object val) {
		Set<Object> array = new TreeSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkAbstractSetTreeSet(Object val) {
		AbstractSet<Object> array = new TreeSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkCollectionTreeSet(Object val) {
		Collection<Object> array = new TreeSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkAbstractCollectionTreeSet(Object val) {
		AbstractCollection<Object> array = new TreeSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	// CONCURRENTSKIPLISTSET TESTS
	public static long benchmarkConcurrentSkipListSet(Object val) {
		ConcurrentSkipListSet<Object> array = new ConcurrentSkipListSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkNavigableSetConcurrentSkipListSet(Object val) {
		NavigableSet<Object> array = new ConcurrentSkipListSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkSortedSetConcurrentSkipListSet(Object val) {
		SortedSet<Object> array = new ConcurrentSkipListSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkSetConcurrentSkipListSet(Object val) {
		Set<Object> array = new ConcurrentSkipListSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkCollectionConcurrentSkipListSet(Object val) {
		Collection<Object> array = new ConcurrentSkipListSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkAbstractCollectionConcurrentSkipListSet(Object val) {
		AbstractCollection<Object> array = new ConcurrentSkipListSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkAbstractSetConcurrentSkipListSet(Object val) {
		AbstractSet<Object> array = new ConcurrentSkipListSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	// COPYONWRITEARRAYSET TESTS
	public static long benchmarkCopyOnWriteArraySet(Object val) {
		CopyOnWriteArraySet<Object> array = new CopyOnWriteArraySet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkSetCopyOnWriteArraySet(Object val) {
		Set<Object> array = new CopyOnWriteArraySet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkAbstractSetCopyOnWriteArraySet(Object val) {
		AbstractSet<Object> array = new CopyOnWriteArraySet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkCollectionCopyOnWriteArraySet(Object val) {
		Collection<Object> array = new CopyOnWriteArraySet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkAbstractCollectionCopyOnWriteArraySet(Object val) {
		AbstractCollection<Object> array = new CopyOnWriteArraySet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

}
