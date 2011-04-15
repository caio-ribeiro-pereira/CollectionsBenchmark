package com.appspot.collection.java.benchmark;

import java.util.AbstractCollection;
import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeBenchmark extends CollectionBenchmark implements JavaBenchMark {

	public DequeBenchmark(int max, Object val) {
		super(max, val);
	}

	@Override
	public Map<String, Long> executar() {
		Map<String, Long> resultado = new TreeMap<String, Long>();
		resultado.put("ArrayDeque -> ArrayDeque", testingArrayDeque());
		resultado.put("Deque -> ArrayDeque", testingDequeArrayDeque());
		resultado.put("Queue -> ArrayDeque", testingQueueArrayDeque());
		resultado.put("Collection -> ArrayDeque", testingCollectionArrayDeque());
		resultado.put("AbstractCollection -> ArrayDeque", testingAbstractCollectionArrayDeque());
		resultado.put("LinkedBlockingDeque -> LinkedBlockingDeque", testingLinkedBlockingDeque());
		resultado.put("AbstractQueue -> LinkedBlockingDeque", testingAbstractQueueLinkedBlockingDeque());
		resultado.put("Queue -> LinkedBlockingDeque", testingQueueLinkedBlockingDeque());
		resultado.put("Deque -> LinkedBlockingDeque", testingDequeLinkedBlockingDeque());
		resultado.put("BlockingQueue -> LinkedBlockingDeque", testingBlockingQueueLinkedBlockingDeque());
		resultado.put("BlockingDeque -> LinkedBlockingDeque", testingBlockingDequeLinkedBlockingDeque());
		resultado.put("Collection -> LinkedBlockingDeque", testingCollectionLinkedBlockingDeque());
		resultado.put("AbstractCollection -> LinkedBlockingDeque", testingAbstractCollectionLinkedBlockingDeque());
		return resultado;
	}

	private long testingArrayDeque() {
		ArrayDeque<Object> array = new ArrayDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingDequeArrayDeque() {
		Deque<Object> array = new ArrayDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingQueueArrayDeque() {
		Queue<Object> array = new ArrayDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingCollectionArrayDeque() {
		Collection<Object> array = new ArrayDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractCollectionArrayDeque() {
		AbstractCollection<Object> array = new ArrayDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingLinkedBlockingDeque() {
		LinkedBlockingDeque<Object> array = new LinkedBlockingDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractQueueLinkedBlockingDeque() {
		AbstractQueue<Object> array = new LinkedBlockingDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingQueueLinkedBlockingDeque() {
		Queue<Object> array = new LinkedBlockingDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingDequeLinkedBlockingDeque() {
		Deque<Object> array = new LinkedBlockingDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingBlockingDequeLinkedBlockingDeque() {
		BlockingDeque<Object> array = new LinkedBlockingDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingBlockingQueueLinkedBlockingDeque() {
		BlockingQueue<Object> array = new LinkedBlockingDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingCollectionLinkedBlockingDeque() {
		Collection<Object> array = new LinkedBlockingDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractCollectionLinkedBlockingDeque() {
		AbstractCollection<Object> array = new LinkedBlockingDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}
}
