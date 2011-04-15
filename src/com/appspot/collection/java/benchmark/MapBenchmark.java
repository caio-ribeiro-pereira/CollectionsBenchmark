package com.appspot.collection.java.benchmark;

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

public class MapBenchmark extends CollectionBenchmark implements JavaBenchMark {

	public MapBenchmark(int max, Object val) {
		super(max, val);

	}

	@Override
	public Map<String, Long> executar() {
		Map<String, Long> resultado = new TreeMap<String, Long>();
		resultado.put("HashMap -> HashMap", testingHashMap());
		resultado.put("Map -> HashMap", testingMapHashMap());
		resultado.put("AbstracMap -> HashMap", testingAbstractMapHashMap());
		resultado.put("LinkedHashMap -> LinkedHashMap", testingLinkedHashMap());
		resultado.put("HashMap -> LinkedHashMap", testingHashMapLinkedHashMap());
		resultado.put("Map -> LinkedHashMap", testingMapLinkedHashMap());
		resultado.put("AbstractMap -> LinkedHashMap", testingAbstractMapLinkedHashMap());
		resultado.put("HashTable -> HashTable", testingHashTable());
		resultado.put("Dictionary -> HashTable", testingDictionaryHashTable());
		resultado.put("Map -> HashTable", testingMapHashTable());
		resultado.put("TreeMap -> TreeMap", testingTreeMap());
		resultado.put("Map -> TreeMap", testingMapTreeMap());
		resultado.put("AbstractMap -> TreeMap", testingAbstractMapTreeMap());
		resultado.put("SortedMap -> TreeMap", testingSortedMapTreeMap());
		resultado.put("NavigableMap -> TreeMap", testingNavigableMapTreeMap());
		resultado.put("WeakHashMap -> WeakHashMap", testingWeakHashMap());
		resultado.put("Map -> WeakHashMap", testingMapWeakHashMap());
		resultado.put("AbstractMap -> WeakHashMap", testingAbstractMapWeakHashMap());
		resultado.put("ConcurrentHashMap -> ConcurrentHashMap", testingConcurrentHashMap());
		resultado.put("ConcurrentMap -> ConcurrentHashMap", testingConcurrentMapConcurrentHashMap());
		resultado.put("Map -> ConcurrentHashMap", testingMapConcurrentHashMap());
		resultado.put("AbstractMap -> ConcurrentHashMap", testingAbstractMapConcurrentHashMap());
		resultado.put("IdentityHashMap -> IdentityHashMap", testingIdentityHashMap());
		resultado.put("Map -> IdentityHashMap", testingMapIdentityHashMap());
		resultado.put("AbstractMap -> IdentityHashMap", testingAbstractMapIdentityHashMap());
		resultado.put("ConcurrentSkipListMap -> ConcurrentSkipListMap", testingConcurrentSkipListMap());
		resultado.put("Map -> ConcurrentSkipListMap", testingMapConcurrentSkipListMap());
		resultado.put("AbstractMap -> ConcurrentSkipListMap", testingAbstractMapConcurrentSkipListMap());
		resultado.put("ConcurrentMap -> ConcurrentSkipListMap", testingConcurrentMapConcurrentSkipListMap());
		resultado.put("ConcurrentNavigableMap -> ConcurrentSkipListMap", testingConcurrentNavigableMapConcurrentSkipListMap());
		resultado.put("NavigableMap -> ConcurrentSkipListMap", testingNavigableMapConcurrentSkipListMap());
		resultado.put("SortedMap -> ConcurrentSkipListMap", testingSortedMapConcurrentSkipListMap());
		return resultado;
	}

	private long testingHashMap() {
		HashMap<Integer, Object> array = new HashMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingMapHashMap() {
		Map<Integer, Object> array = new HashMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractMapHashMap() {
		AbstractMap<Integer, Object> array = new HashMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingLinkedHashMap() {
		LinkedHashMap<Integer, Object> array = new LinkedHashMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingHashMapLinkedHashMap() {
		HashMap<Integer, Object> array = new LinkedHashMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingMapLinkedHashMap() {
		Map<Integer, Object> array = new LinkedHashMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractMapLinkedHashMap() {
		AbstractMap<Integer, Object> array = new LinkedHashMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingHashTable() {
		Hashtable<Integer, Object> array = new Hashtable<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingDictionaryHashTable() {
		Dictionary<Integer, Object> array = new Hashtable<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingMapHashTable() {
		Map<Integer, Object> array = new Hashtable<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingTreeMap() {
		TreeMap<Integer, Object> array = new TreeMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingMapTreeMap() {
		Map<Integer, Object> array = new TreeMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractMapTreeMap() {
		AbstractMap<Integer, Object> array = new TreeMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingNavigableMapTreeMap() {
		NavigableMap<Integer, Object> array = new TreeMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingSortedMapTreeMap() {
		SortedMap<Integer, Object> array = new TreeMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingWeakHashMap() {
		WeakHashMap<Integer, Object> array = new WeakHashMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingMapWeakHashMap() {
		Map<Integer, Object> array = new WeakHashMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractMapWeakHashMap() {
		AbstractMap<Integer, Object> array = new WeakHashMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingConcurrentHashMap() {
		ConcurrentHashMap<Integer, Object> array = new ConcurrentHashMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingConcurrentMapConcurrentHashMap() {
		ConcurrentMap<Integer, Object> array = new ConcurrentHashMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingMapConcurrentHashMap() {
		Map<Integer, Object> array = new ConcurrentHashMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractMapConcurrentHashMap() {
		AbstractMap<Integer, Object> array = new ConcurrentHashMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingIdentityHashMap() {
		IdentityHashMap<Integer, Object> array = new IdentityHashMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingMapIdentityHashMap() {
		Map<Integer, Object> array = new IdentityHashMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractMapIdentityHashMap() {
		AbstractMap<Integer, Object> array = new IdentityHashMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingConcurrentSkipListMap() {
		ConcurrentSkipListMap<Integer, Object> array = new ConcurrentSkipListMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingMapConcurrentSkipListMap() {
		Map<Integer, Object> array = new ConcurrentSkipListMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractMapConcurrentSkipListMap() {
		AbstractMap<Integer, Object> array = new ConcurrentSkipListMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingConcurrentMapConcurrentSkipListMap() {
		ConcurrentMap<Integer, Object> array = new ConcurrentSkipListMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingConcurrentNavigableMapConcurrentSkipListMap() {
		ConcurrentNavigableMap<Integer, Object> array = new ConcurrentSkipListMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingNavigableMapConcurrentSkipListMap() {
		NavigableMap<Integer, Object> array = new ConcurrentSkipListMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingSortedMapConcurrentSkipListMap() {
		SortedMap<Integer, Object> array = new ConcurrentSkipListMap<Integer, Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.put(i, getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}
}
