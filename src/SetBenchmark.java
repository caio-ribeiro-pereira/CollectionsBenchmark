import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetBenchmark {

	public static final int MAX = 10000000;
	public static final int VAL = 100;

	public static void main(String[] args) {
		System.out.println("Java SE 6 Collections Benchmark");
		System.out.println("Realizando testes com variações da Collection Set");
		System.out.println("Escrevendo: " + MAX + " Integer com valor: " + VAL);
		System.out.println("Tempo\t|\tTipo de Instancia");
		System.out.println("==========================================================================");
		System.out.println(benchmarkHashSet(VAL) + " ms\t|\tHashSet -> HashSet");
		System.out.println(benchmarkSetHashSet(VAL) + " ms\t|\tSet -> HashSet");
		System.out.println(benchmarkCollectionHashSet(VAL) + " ms\t|\tCollection -> HashSet");
		System.out.println(benchmarkAbstractSetHashSet(VAL) + " ms\t|\tAbstractSet -> HashSet");
		System.out.println("==========================================================================");
		System.out.println(benchmarkLinkedHashSet(VAL) + " ms\t|\tLinkedHashSet -> LinkedHashSet");
		System.out.println(benchmarkSetLinkedHashSet(VAL) + " ms\t|\tSet -> LinkedHashSet");
		System.out.println(benchmarkHashSetLinkedHashSet(VAL) + " ms\t|\tHashSet -> LinkedHashSet");
		System.out.println(benchmarkAbstractSetLinkedHashSet(VAL) + " ms\t|\tAbstractSet -> LinkedHashSet");
		System.out.println(benchmarkCollectionLinkedHashSet(VAL) + " ms\t|\tCollection -> LinkedHashSet");
		System.out.println("==========================================================================");
		System.out.println(benchmarkTreeSet(VAL) + " ms\t|\tTreeSet -> TreeSet");
		System.out.println(benchmarkSetTreeSet(VAL) + " ms\t|\tSet -> TreeSet");
		System.out.println(benchmarkSortedSetTreeSet(VAL) + " ms\t|\tSortedSet -> TreeSet");
		System.out.println(benchmarkNavigableSetTreeSet(VAL) + " ms\t|\tNavigableSet -> TreeSet");
		System.out.println(benchmarkCollectionTreeSet(VAL) + " ms\t|\tCollection -> TreeSet");
		System.out.println(benchmarkAbstractSetTreeSet(VAL) + " ms\t|\tAbstractSet -> TreeSet");
		System.out.println("==========================================================================");
		System.out.println(benchmarkConcurrentSkipListSet(VAL) + " ms\t|\tConcurrentSkipListSet -> ConcurrentSkipListSet");
		System.out.println(benchmarkNavigableSetConcurrentSkipListSet(VAL) + " ms\t|\tNavigableSet -> ConcurrentSkipListSet");
		System.out.println(benchmarkSetConcurrentSkipListSet(VAL) + " ms\t|\tSet -> ConcurrentSkipListSet");
		System.out.println(benchmarkSortedSetConcurrentSkipListSet(VAL) + " ms\t|\tSortedSet -> ConcurrentSkipListSet");
		System.out.println(benchmarkCollectionConcurrentSkipListSet(VAL) + " ms\t|\tCollection -> ConcurrentSkipListSet");
		System.out.println(benchmarkAbstractSetConcurrentSkipListSet(VAL) + " ms\t|\tAbstractSet -> ConcurrentSkipListSet");
		System.out.println("==========================================================================");
		System.out.println(benchmarkCopyOnWriteArraySet(VAL) + " ms\t|\tCopyOnWriteArraySet - > CopyOnWriteArraySet");
		System.out.println(benchmarkSetCopyOnWriteArraySet(VAL) + " ms\t|\tSet - > CopyOnWriteArraySet");
		System.out.println(benchmarkAbstractSetCopyOnWriteArraySet(VAL) + " ms\t|\tAbstractSet - > CopyOnWriteArraySet");
		System.out.println(benchmarkCollectionCopyOnWriteArraySet(VAL) + " ms\t|\tCollection - > CopyOnWriteArraySet");
	}

	// HASH SET TESTS
	public static long benchmarkHashSet(Integer val) {
		HashSet<Integer> array = new HashSet<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	public static long benchmarkSetHashSet(Integer val) {
		Set<Integer> array = new HashSet<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	public static long benchmarkCollectionHashSet(Integer val) {
		Collection<Integer> array = new HashSet<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	public static long benchmarkAbstractSetHashSet(Integer val) {
		AbstractSet<Integer> array = new HashSet<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	// LINKEDHASHSET TESTS
	public static long benchmarkLinkedHashSet(Integer val) {
		LinkedHashSet<Integer> array = new LinkedHashSet<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	public static long benchmarkHashSetLinkedHashSet(Integer val) {
		HashSet<Integer> array = new LinkedHashSet<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	public static long benchmarkAbstractSetLinkedHashSet(Integer val) {
		AbstractSet<Integer> array = new LinkedHashSet<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	public static long benchmarkCollectionLinkedHashSet(Integer val) {
		Collection<Integer> array = new LinkedHashSet<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	public static long benchmarkSetLinkedHashSet(Integer val) {
		Set<Integer> array = new LinkedHashSet<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	// TREESET TESTS
	public static long benchmarkTreeSet(Integer val) {
		TreeSet<Integer> array = new TreeSet<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	public static long benchmarkSortedSetTreeSet(Integer val) {
		SortedSet<Integer> array = new TreeSet<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	public static long benchmarkNavigableSetTreeSet(Integer val) {
		NavigableSet<Integer> array = new TreeSet<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	public static long benchmarkSetTreeSet(Integer val) {
		Set<Integer> array = new TreeSet<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	public static long benchmarkAbstractSetTreeSet(Integer val) {
		AbstractSet<Integer> array = new TreeSet<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	public static long benchmarkCollectionTreeSet(Integer val) {
		Collection<Integer> array = new TreeSet<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	// CONCURRENTSKIPLISTSET TESTS
	public static long benchmarkConcurrentSkipListSet(Integer val) {
		ConcurrentSkipListSet<Integer> array = new ConcurrentSkipListSet<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	public static long benchmarkNavigableSetConcurrentSkipListSet(Integer val) {
		NavigableSet<Integer> array = new ConcurrentSkipListSet<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	public static long benchmarkSortedSetConcurrentSkipListSet(Integer val) {
		SortedSet<Integer> array = new ConcurrentSkipListSet<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	public static long benchmarkSetConcurrentSkipListSet(Integer val) {
		Set<Integer> array = new ConcurrentSkipListSet<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	public static long benchmarkCollectionConcurrentSkipListSet(Integer val) {
		Collection<Integer> array = new ConcurrentSkipListSet<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	public static long benchmarkAbstractSetConcurrentSkipListSet(Integer val) {
		AbstractSet<Integer> array = new ConcurrentSkipListSet<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	// COPYONWRITEARRAYSET TESTS
	public static long benchmarkCopyOnWriteArraySet(Integer val) {
		CopyOnWriteArraySet<Integer> array = new CopyOnWriteArraySet<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	public static long benchmarkSetCopyOnWriteArraySet(Integer val) {
		Set<Integer> array = new CopyOnWriteArraySet<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	public static long benchmarkAbstractSetCopyOnWriteArraySet(Integer val) {
		AbstractSet<Integer> array = new CopyOnWriteArraySet<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}

	public static long benchmarkCollectionCopyOnWriteArraySet(Integer val) {
		Collection<Integer> array = new CopyOnWriteArraySet<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}
}
