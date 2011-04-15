package com.appspot.collection.benchmark.java;

import java.util.AbstractMap;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

import com.appspot.collection.benchmark.BenchMark;
import com.appspot.collection.benchmark.CollectionBenchmark;

/**
 * 
 * Java Collections Benchmark
 * 
 * Um aplicativo para medir a performance das principais estruturas
 * (Collections) do Java SE 6.
 * 
 * Classe que realiza benchmark com a maioria das variações de um Map.
 * 
 * @author Caio Ribeiro Pereira
 * @see https://github.com/caio-ribeiro-pereira/CollectionsBenchmark
 * @see www.twitter.com/crp_underground
 * @since 15/04/2011
 */
public class MapBenchmark extends CollectionBenchmark implements BenchMark {

	public MapBenchmark(int max) {
		super(max);

	}

	@Override
	public Map<String, Long> execute() {
		getCollection().put("HashMap -> HashMap", testingHashMap());
		getCollection().put("Map -> HashMap", testingMapHashMap());
		getCollection().put("AbstracMap -> HashMap", testingAbstractMapHashMap());
		getCollection().put("LinkedHashMap -> LinkedHashMap", testingLinkedHashMap());
		getCollection().put("HashMap -> LinkedHashMap", testingHashMapLinkedHashMap());
		getCollection().put("Map -> LinkedHashMap", testingMapLinkedHashMap());
		getCollection().put("AbstractMap -> LinkedHashMap", testingAbstractMapLinkedHashMap());
		getCollection().put("HashTable -> HashTable", testingHashTable());
		getCollection().put("Dictionary -> HashTable", testingDictionaryHashTable());
		getCollection().put("Map -> HashTable", testingMapHashTable());
		getCollection().put("TreeMap -> TreeMap", testingTreeMap());
		getCollection().put("Map -> TreeMap", testingMapTreeMap());
		getCollection().put("AbstractMap -> TreeMap", testingAbstractMapTreeMap());
		getCollection().put("SortedMap -> TreeMap", testingSortedMapTreeMap());
		getCollection().put("NavigableMap -> TreeMap", testingNavigableMapTreeMap());
		getCollection().put("WeakHashMap -> WeakHashMap", testingWeakHashMap());
		getCollection().put("Map -> WeakHashMap", testingMapWeakHashMap());
		getCollection().put("AbstractMap -> WeakHashMap", testingAbstractMapWeakHashMap());
		getCollection().put("ConcurrentHashMap -> ConcurrentHashMap", testingConcurrentHashMap());
		getCollection().put("ConcurrentMap -> ConcurrentHashMap", testingConcurrentMapConcurrentHashMap());
		getCollection().put("Map -> ConcurrentHashMap", testingMapConcurrentHashMap());
		getCollection().put("AbstractMap -> ConcurrentHashMap", testingAbstractMapConcurrentHashMap());
		getCollection().put("IdentityHashMap -> IdentityHashMap", testingIdentityHashMap());
		getCollection().put("Map -> IdentityHashMap", testingMapIdentityHashMap());
		getCollection().put("AbstractMap -> IdentityHashMap", testingAbstractMapIdentityHashMap());
		getCollection().put("ConcurrentSkipListMap -> ConcurrentSkipListMap", testingConcurrentSkipListMap());
		getCollection().put("Map -> ConcurrentSkipListMap", testingMapConcurrentSkipListMap());
		getCollection().put("AbstractMap -> ConcurrentSkipListMap", testingAbstractMapConcurrentSkipListMap());
		getCollection().put("ConcurrentMap -> ConcurrentSkipListMap", testingConcurrentMapConcurrentSkipListMap());
		getCollection().put("ConcurrentNavigableMap -> ConcurrentSkipListMap", testingConcurrentNavigableMapConcurrentSkipListMap());
		getCollection().put("NavigableMap -> ConcurrentSkipListMap", testingNavigableMapConcurrentSkipListMap());
		getCollection().put("SortedMap -> ConcurrentSkipListMap", testingSortedMapConcurrentSkipListMap());
		return getCollection();
	}

	private long testingHashMap() {
		HashMap<Integer, Object> array = new HashMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingMapHashMap() {
		Map<Integer, Object> array = new HashMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingAbstractMapHashMap() {
		AbstractMap<Integer, Object> array = new HashMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingLinkedHashMap() {
		LinkedHashMap<Integer, Object> array = new LinkedHashMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingHashMapLinkedHashMap() {
		HashMap<Integer, Object> array = new LinkedHashMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingMapLinkedHashMap() {
		Map<Integer, Object> array = new LinkedHashMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingAbstractMapLinkedHashMap() {
		AbstractMap<Integer, Object> array = new LinkedHashMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingHashTable() {
		Hashtable<Integer, Object> array = new Hashtable<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingDictionaryHashTable() {
		Dictionary<Integer, Object> array = new Hashtable<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingMapHashTable() {
		Map<Integer, Object> array = new Hashtable<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingTreeMap() {
		TreeMap<Integer, Object> array = new TreeMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingMapTreeMap() {
		Map<Integer, Object> array = new TreeMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingAbstractMapTreeMap() {
		AbstractMap<Integer, Object> array = new TreeMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingNavigableMapTreeMap() {
		NavigableMap<Integer, Object> array = new TreeMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingSortedMapTreeMap() {
		SortedMap<Integer, Object> array = new TreeMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingWeakHashMap() {
		WeakHashMap<Integer, Object> array = new WeakHashMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingMapWeakHashMap() {
		Map<Integer, Object> array = new WeakHashMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingAbstractMapWeakHashMap() {
		AbstractMap<Integer, Object> array = new WeakHashMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingConcurrentHashMap() {
		ConcurrentHashMap<Integer, Object> array = new ConcurrentHashMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingConcurrentMapConcurrentHashMap() {
		ConcurrentMap<Integer, Object> array = new ConcurrentHashMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingMapConcurrentHashMap() {
		Map<Integer, Object> array = new ConcurrentHashMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingAbstractMapConcurrentHashMap() {
		AbstractMap<Integer, Object> array = new ConcurrentHashMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingIdentityHashMap() {
		IdentityHashMap<Integer, Object> array = new IdentityHashMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingMapIdentityHashMap() {
		Map<Integer, Object> array = new IdentityHashMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingAbstractMapIdentityHashMap() {
		AbstractMap<Integer, Object> array = new IdentityHashMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingConcurrentSkipListMap() {
		ConcurrentSkipListMap<Integer, Object> array = new ConcurrentSkipListMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingMapConcurrentSkipListMap() {
		Map<Integer, Object> array = new ConcurrentSkipListMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingAbstractMapConcurrentSkipListMap() {
		AbstractMap<Integer, Object> array = new ConcurrentSkipListMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingConcurrentMapConcurrentSkipListMap() {
		ConcurrentMap<Integer, Object> array = new ConcurrentSkipListMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingConcurrentNavigableMapConcurrentSkipListMap() {
		ConcurrentNavigableMap<Integer, Object> array = new ConcurrentSkipListMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingNavigableMapConcurrentSkipListMap() {
		NavigableMap<Integer, Object> array = new ConcurrentSkipListMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingSortedMapConcurrentSkipListMap() {
		SortedMap<Integer, Object> array = new ConcurrentSkipListMap<Integer, Object>();
		long start = System.nanoTime();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, i);
		}
		long end = System.nanoTime();
		long time = (end - start);
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
