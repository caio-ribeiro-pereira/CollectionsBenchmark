package com.appspot.collection.benchmark.java;

import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

import com.appspot.collection.benchmark.BenchMark;
import com.appspot.collection.benchmark.CollectionBenchmark;

/**
 * 
 * Java Collections Benchmark
 * 
 * Um aplicativo para medir a performance das principais estruturas
 * (Collections) do Java SE 6.
 * 
 * Classe que realiza benchmark com a maioria das variações de um Set.
 * 
 * @author Caio Ribeiro Pereira
 * @see https://github.com/caio-ribeiro-pereira/CollectionsBenchmark
 * @see www.twitter.com/crp_underground
 * @since 15/04/2011
 */
public class SetBenchmark extends CollectionBenchmark implements BenchMark {

	public SetBenchmark(int max) {
		super(max);
	}

	@Override
	public Map<String, Long> execute() {
		getCollection().put("HashSet -> HashSet", testingHashSet());
		getCollection().put("Set -> HashSet", testingSetHashSet());
		getCollection().put("AbstractSet -> HashSet", testingAbstractSetHashSet());
		getCollection().put("Collection -> HashSet", testingCollectionHashSet());
		getCollection().put("AbstractCollection -> HashSet", testingAbstractCollectionHashSet());
		getCollection().put("LinkedHashSet -> LinkedHashSet", testingLinkedHashSet());
		getCollection().put("Set -> LinkedHashSet", testingSetLinkedHashSet());
		getCollection().put("HashSet -> LinkedHashSet", testingHashSetLinkedHashSet());
		getCollection().put("AbstractSet -> LinkedHashSet", testingAbstractSetLinkedHashSet());
		getCollection().put("Collection -> LinkedHashSet", testingCollectionLinkedHashSet());
		getCollection().put("AbstractCollection -> LinkedHashSet", testingAbstractCollectionLinkedHashSet());
		getCollection().put("TreeSet -> TreeSet", testingTreeSet());
		getCollection().put("Set -> TreeSet", testingSetTreeSet());
		getCollection().put("SortedSet -> TreeSet", testingSortedSetTreeSet());
		getCollection().put("NavigableSet -> TreeSet", testingNavigableSetTreeSet());
		getCollection().put("AbstractSet -> TreeSet", testingAbstractSetTreeSet());
		getCollection().put("Collection -> TreeSet", testingCollectionTreeSet());
		getCollection().put("AbstractCollection -> TreeSet", testingAbstractCollectionTreeSet());
		getCollection().put("ConcurrentSkipListSet -> ConcurrentSkipListSet", testingConcurrentSkipListSet());
		getCollection().put("NavigableSet -> ConcurrentSkipListSet", testingNavigableSetConcurrentSkipListSet());
		getCollection().put("Set -> ConcurrentSkipListSet", testingSetConcurrentSkipListSet());
		getCollection().put("SortedSet -> ConcurrentSkipListSet", testingSortedSetConcurrentSkipListSet());
		getCollection().put("AbstractSet -> ConcurrentSkipListSet", testingAbstractSetConcurrentSkipListSet());
		getCollection().put("Collection -> ConcurrentSkipListSet", testingCollectionConcurrentSkipListSet());
		getCollection().put("AbstractCollection -> ConcurrentSkipListSet", testingAbstractCollectionConcurrentSkipListSet());
		getCollection().put("CopyOnWriteArraySet - > CopyOnWriteArraySet", testingCopyOnWriteArraySet());
		getCollection().put("Set - > CopyOnWriteArraySet", testingSetCopyOnWriteArraySet());
		getCollection().put("AbstractSet - > CopyOnWriteArraySet", testingAbstractSetCopyOnWriteArraySet());
		getCollection().put("Collection - > CopyOnWriteArraySet", testingCollectionCopyOnWriteArraySet());
		getCollection().put("AbstractCollection - > CopyOnWriteArraySet", testingAbstractCollectionCopyOnWriteArraySet());
		return getCollection();
	}

	private long testingHashSet() {
		HashSet<Object> array = new HashSet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingSetHashSet() {
		Set<Object> array = new HashSet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingCollectionHashSet() {
		Collection<Object> array = new HashSet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingAbstractCollectionHashSet() {
		AbstractCollection<Object> array = new HashSet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingAbstractSetHashSet() {
		AbstractSet<Object> array = new HashSet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingLinkedHashSet() {
		LinkedHashSet<Object> array = new LinkedHashSet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingHashSetLinkedHashSet() {
		HashSet<Object> array = new LinkedHashSet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingAbstractSetLinkedHashSet() {
		AbstractSet<Object> array = new LinkedHashSet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingAbstractCollectionLinkedHashSet() {
		AbstractCollection<Object> array = new LinkedHashSet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingCollectionLinkedHashSet() {
		Collection<Object> array = new LinkedHashSet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingSetLinkedHashSet() {
		Set<Object> array = new LinkedHashSet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingTreeSet() {
		TreeSet<Object> array = new TreeSet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingSortedSetTreeSet() {
		SortedSet<Object> array = new TreeSet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingNavigableSetTreeSet() {
		NavigableSet<Object> array = new TreeSet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingSetTreeSet() {
		Set<Object> array = new TreeSet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingAbstractSetTreeSet() {
		AbstractSet<Object> array = new TreeSet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingCollectionTreeSet() {
		Collection<Object> array = new TreeSet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingAbstractCollectionTreeSet() {
		AbstractCollection<Object> array = new TreeSet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingConcurrentSkipListSet() {
		ConcurrentSkipListSet<Object> array = new ConcurrentSkipListSet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingNavigableSetConcurrentSkipListSet() {
		NavigableSet<Object> array = new ConcurrentSkipListSet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingSortedSetConcurrentSkipListSet() {
		SortedSet<Object> array = new ConcurrentSkipListSet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingSetConcurrentSkipListSet() {
		Set<Object> array = new ConcurrentSkipListSet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingCollectionConcurrentSkipListSet() {
		Collection<Object> array = new ConcurrentSkipListSet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingAbstractCollectionConcurrentSkipListSet() {
		AbstractCollection<Object> array = new ConcurrentSkipListSet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingAbstractSetConcurrentSkipListSet() {
		AbstractSet<Object> array = new ConcurrentSkipListSet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingCopyOnWriteArraySet() {
		CopyOnWriteArraySet<Object> array = new CopyOnWriteArraySet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingSetCopyOnWriteArraySet() {
		Set<Object> array = new CopyOnWriteArraySet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingAbstractSetCopyOnWriteArraySet() {
		AbstractSet<Object> array = new CopyOnWriteArraySet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingCollectionCopyOnWriteArraySet() {
		Collection<Object> array = new CopyOnWriteArraySet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingAbstractCollectionCopyOnWriteArraySet() {
		AbstractCollection<Object> array = new CopyOnWriteArraySet<Object>();
		long time = 0;

		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.nanoTime();
		time += (end - start);
		refreshTotalTime(time);
		return time;

	}

	@Override
	public Long totalTime() {
		return getTotalTime();
	}

	@Override
	public Integer totalCollection() {
		return getCollection().size();
	}
}
