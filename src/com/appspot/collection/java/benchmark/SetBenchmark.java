package com.appspot.collection.java.benchmark;

import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetBenchmark extends CollectionBenchmark implements JavaBenchMark {

	public SetBenchmark(int max, Object val) {
		super(max, val);
	}

	@Override
	public Map<String, Long> executar() {
		Map<String, Long> resultado = new TreeMap<String, Long>();
		resultado.put("HashSet -> HashSet", testingHashSet());
		resultado.put("Set -> HashSet", testingSetHashSet());
		resultado.put("AbstractSet -> HashSet", testingAbstractSetHashSet());
		resultado.put("Collection -> HashSet", testingCollectionHashSet());
		resultado.put("AbstractCollection -> HashSet", testingAbstractCollectionHashSet());
		resultado.put("LinkedHashSet -> LinkedHashSet", testingLinkedHashSet());
		resultado.put("Set -> LinkedHashSet", testingSetLinkedHashSet());
		resultado.put("HashSet -> LinkedHashSet", testingHashSetLinkedHashSet());
		resultado.put("AbstractSet -> LinkedHashSet", testingAbstractSetLinkedHashSet());
		resultado.put("Collection -> LinkedHashSet", testingCollectionLinkedHashSet());
		resultado.put("AbstractCollection -> LinkedHashSet", testingAbstractCollectionLinkedHashSet());
		resultado.put("TreeSet -> TreeSet", testingTreeSet());
		resultado.put("Set -> TreeSet", testingSetTreeSet());
		resultado.put("SortedSet -> TreeSet", testingSortedSetTreeSet());
		resultado.put("NavigableSet -> TreeSet", testingNavigableSetTreeSet());
		resultado.put("AbstractSet -> TreeSet", testingAbstractSetTreeSet());
		resultado.put("Collection -> TreeSet", testingCollectionTreeSet());
		resultado.put("AbstractCollection -> TreeSet", testingAbstractCollectionTreeSet());
		resultado.put("ConcurrentSkipListSet -> ConcurrentSkipListSet", testingConcurrentSkipListSet());
		resultado.put("NavigableSet -> ConcurrentSkipListSet", testingNavigableSetConcurrentSkipListSet());
		resultado.put("Set -> ConcurrentSkipListSet", testingSetConcurrentSkipListSet());
		resultado.put("SortedSet -> ConcurrentSkipListSet", testingSortedSetConcurrentSkipListSet());
		resultado.put("AbstractSet -> ConcurrentSkipListSet", testingAbstractSetConcurrentSkipListSet());
		resultado.put("Collection -> ConcurrentSkipListSet", testingCollectionConcurrentSkipListSet());
		resultado.put("AbstractCollection -> ConcurrentSkipListSet", testingAbstractCollectionConcurrentSkipListSet());
		resultado.put("CopyOnWriteArraySet - > CopyOnWriteArraySet", testingCopyOnWriteArraySet());
		resultado.put("Set - > CopyOnWriteArraySet", testingSetCopyOnWriteArraySet());
		resultado.put("AbstractSet - > CopyOnWriteArraySet", testingAbstractSetCopyOnWriteArraySet());
		resultado.put("Collection - > CopyOnWriteArraySet", testingCollectionCopyOnWriteArraySet());
		resultado.put("AbstractCollection - > CopyOnWriteArraySet", testingAbstractCollectionCopyOnWriteArraySet());
		return resultado;
	}

	private long testingHashSet() {
		HashSet<Object> array = new HashSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingSetHashSet() {
		Set<Object> array = new HashSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingCollectionHashSet() {
		Collection<Object> array = new HashSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractCollectionHashSet() {
		AbstractCollection<Object> array = new HashSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractSetHashSet() {
		AbstractSet<Object> array = new HashSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingLinkedHashSet() {
		LinkedHashSet<Object> array = new LinkedHashSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingHashSetLinkedHashSet() {
		HashSet<Object> array = new LinkedHashSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractSetLinkedHashSet() {
		AbstractSet<Object> array = new LinkedHashSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractCollectionLinkedHashSet() {
		AbstractCollection<Object> array = new LinkedHashSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingCollectionLinkedHashSet() {
		Collection<Object> array = new LinkedHashSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingSetLinkedHashSet() {
		Set<Object> array = new LinkedHashSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingTreeSet() {
		TreeSet<Object> array = new TreeSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingSortedSetTreeSet() {
		SortedSet<Object> array = new TreeSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingNavigableSetTreeSet() {
		NavigableSet<Object> array = new TreeSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingSetTreeSet() {
		Set<Object> array = new TreeSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractSetTreeSet() {
		AbstractSet<Object> array = new TreeSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingCollectionTreeSet() {
		Collection<Object> array = new TreeSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractCollectionTreeSet() {
		AbstractCollection<Object> array = new TreeSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingConcurrentSkipListSet() {
		ConcurrentSkipListSet<Object> array = new ConcurrentSkipListSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingNavigableSetConcurrentSkipListSet() {
		NavigableSet<Object> array = new ConcurrentSkipListSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingSortedSetConcurrentSkipListSet() {
		SortedSet<Object> array = new ConcurrentSkipListSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingSetConcurrentSkipListSet() {
		Set<Object> array = new ConcurrentSkipListSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingCollectionConcurrentSkipListSet() {
		Collection<Object> array = new ConcurrentSkipListSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractCollectionConcurrentSkipListSet() {
		AbstractCollection<Object> array = new ConcurrentSkipListSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractSetConcurrentSkipListSet() {
		AbstractSet<Object> array = new ConcurrentSkipListSet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingCopyOnWriteArraySet() {
		CopyOnWriteArraySet<Object> array = new CopyOnWriteArraySet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingSetCopyOnWriteArraySet() {
		Set<Object> array = new CopyOnWriteArraySet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractSetCopyOnWriteArraySet() {
		AbstractSet<Object> array = new CopyOnWriteArraySet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingCollectionCopyOnWriteArraySet() {
		Collection<Object> array = new CopyOnWriteArraySet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractCollectionCopyOnWriteArraySet() {
		AbstractCollection<Object> array = new CopyOnWriteArraySet<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

}
