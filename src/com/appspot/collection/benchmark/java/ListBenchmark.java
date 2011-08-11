package com.appspot.collection.benchmark.java;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractQueue;
import java.util.AbstractSequentialList;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

import javax.management.relation.RoleList;

import com.appspot.collection.benchmark.BenchMark;
import com.appspot.collection.benchmark.CollectionBenchmark;

/**
 * 
 * Java Collections Benchmark
 * 
 * Um aplicativo para medir a performance das principais estruturas
 * (Collections) do Java SE 6.
 * 
 * Classe que realiza benchmark com a maioria das variações de um List.
 * 
 * @author Caio Ribeiro Pereira
 * @see https://github.com/caio-ribeiro-pereira/CollectionsBenchmark
 * @see www.twitter.com/crp_underground
 * @since 15/04/2011
 */
public class ListBenchmark extends CollectionBenchmark implements BenchMark {

	public ListBenchmark(int max) {
		super(max);
	}

	@Override
	public Map<String, Long> execute() {
		getCollection().put("Array", testingArray());
		getCollection().put("ArrayList -> ArrayList", testingArrayList());
		getCollection().put("List -> ArrayList", testingListArrayList());
		getCollection().put("AbstractList -> ArrayList", testingAbstractListArrayList());
		getCollection().put("Collection -> ArrayList", testingCollectionArrayList());
		getCollection().put("AbstractCollection -> ArrayList", testingAbstractCollectionArrayList());
		getCollection().put("LinkedList -> LinkedList", testingLinkedList());
		getCollection().put("List -> LinkedList", testingListLinkedList());
		getCollection().put("AbstractList -> LinkedList", testingAbstractListLinkedList());
		getCollection().put("AbstractSequentialList -> LinkedList", testingAbstractSequentialListLinkedList());
		getCollection().put("Collection -> LinkedList", testingCollectionLinkedList());
		getCollection().put("AbstractCollection -> LinkedList", testingAbstractCollectionLinkedList());
		getCollection().put("Deque -> LinkedList", testingDequeLinkedList());
		getCollection().put("Queue -> LinkedList", testingQueueLinkedList());
		getCollection().put("Stack -> Stack", testingStack());
		getCollection().put("List -> Stack", testingListStack());
		getCollection().put("AbstractList -> Stack", testingAbstractListStack());
		getCollection().put("Collection -> Stack", testingCollectionStack());
		getCollection().put("AbstractCollection -> Stack", testingAbstractCollectionStack());
		getCollection().put("Vector -> Stack", testingVectorStack());
		getCollection().put("Vector -> Vector", testingVector());
		getCollection().put("List -> Vector", testingListVector());
		getCollection().put("AbstractList -> Vector", testingAbstractListVector());
		getCollection().put("Collection -> Vector", testingCollectionVector());
		getCollection().put("AbstractCollection -> Vector", testingAbstractCollectionVector());
		getCollection().put("ArrayDeque -> ArrayDeque", testingArrayDeque());
		getCollection().put("Deque -> ArrayDeque", testingDequeArrayDeque());
		getCollection().put("Queue -> ArrayDeque", testingQueueArrayDeque());
		getCollection().put("Collection -> ArrayDeque", testingCollectionArrayDeque());
		getCollection().put("AbstractCollection -> ArrayDeque", testingAbstractCollectionArrayDeque());
		getCollection().put("LinkedBlockingDeque -> LinkedBlockingDeque", testingLinkedBlockingDeque());
		getCollection().put("AbstractQueue -> LinkedBlockingDeque", testingAbstractQueueLinkedBlockingDeque());
		getCollection().put("Queue -> LinkedBlockingDeque", testingQueueLinkedBlockingDeque());
		getCollection().put("Deque -> LinkedBlockingDeque", testingDequeLinkedBlockingDeque());
		getCollection().put("BlockingQueue -> LinkedBlockingDeque", testingBlockingQueueLinkedBlockingDeque());
		getCollection().put("BlockingDeque -> LinkedBlockingDeque", testingBlockingDequeLinkedBlockingDeque());
		getCollection().put("Collection -> LinkedBlockingDeque", testingCollectionLinkedBlockingDeque());
		getCollection().put("AbstractCollection -> LinkedBlockingDeque", testingAbstractCollectionLinkedBlockingDeque());
		getCollection().put("RoleList -> RoleList", testingRoleList());
		getCollection().put("List -> RoleList", testingListRoleList());
		getCollection().put("ArrayList -> RoleList", testingArrayListRoleList());
		getCollection().put("AbstractList -> RoleList", testingAbstractListRoleList());
		getCollection().put("Collection -> RoleList", testingCollectionRoleList());
		getCollection().put("AbstractCollection -> RoleList", testingAbstractCollectionRoleList());
		getCollection().put("CopyOnWriteArrayList -> CopyOnWriteArrayList", testingCopyOnWriteArrayList());
		getCollection().put("List -> CopyOnWriteArrayList", testingListCopyOnWriteArrayList());
		getCollection().put("Collection -> CopyOnWriteArrayList", testingCollectionCopyOnWriteArrayList());
		return getCollection();
	}

	private long testingArray() {
		Object[] array = new Object[getMax()];
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array[i] = i;
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingArrayList() {
		ArrayList<Object> array = new ArrayList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingListArrayList() {
		List<Object> array = new ArrayList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingAbstractListArrayList() {
		AbstractList<Object> array = new ArrayList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingCollectionArrayList() {
		Collection<Object> array = new ArrayList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingAbstractCollectionArrayList() {
		AbstractCollection<Object> array = new ArrayList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingLinkedList() {
		LinkedList<Object> array = new LinkedList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingListLinkedList() {
		List<Object> array = new LinkedList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingAbstractListLinkedList() {
		AbstractList<Object> array = new LinkedList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingCollectionLinkedList() {
		Collection<Object> array = new LinkedList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingAbstractCollectionLinkedList() {
		AbstractCollection<Object> array = new LinkedList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingDequeLinkedList() {
		Deque<Object> array = new LinkedList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingQueueLinkedList() {
		Queue<Object> array = new LinkedList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingAbstractSequentialListLinkedList() {
		AbstractSequentialList<Object> array = new LinkedList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingStack() {
		Stack<Object> array = new Stack<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingListStack() {
		List<Object> array = new Stack<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingAbstractListStack() {
		AbstractList<Object> array = new Stack<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingCollectionStack() {
		Collection<Object> array = new Stack<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingAbstractCollectionStack() {
		AbstractCollection<Object> array = new Stack<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingVectorStack() {
		Vector<Object> array = new Stack<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingVector() {
		Vector<Object> array = new Vector<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingListVector() {
		List<Object> array = new Vector<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingAbstractListVector() {
		AbstractList<Object> array = new Vector<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingCollectionVector() {
		Collection<Object> array = new Vector<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingAbstractCollectionVector() {
		AbstractCollection<Object> array = new Vector<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingArrayDeque() {
		ArrayDeque<Object> array = new ArrayDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingDequeArrayDeque() {
		Deque<Object> array = new ArrayDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingQueueArrayDeque() {
		Queue<Object> array = new ArrayDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingCollectionArrayDeque() {
		Collection<Object> array = new ArrayDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingAbstractCollectionArrayDeque() {
		AbstractCollection<Object> array = new ArrayDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingLinkedBlockingDeque() {
		LinkedBlockingDeque<Object> array = new LinkedBlockingDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingAbstractQueueLinkedBlockingDeque() {
		AbstractQueue<Object> array = new LinkedBlockingDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingQueueLinkedBlockingDeque() {
		Queue<Object> array = new LinkedBlockingDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingDequeLinkedBlockingDeque() {
		Deque<Object> array = new LinkedBlockingDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingBlockingDequeLinkedBlockingDeque() {
		BlockingDeque<Object> array = new LinkedBlockingDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingBlockingQueueLinkedBlockingDeque() {
		BlockingQueue<Object> array = new LinkedBlockingDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingCollectionLinkedBlockingDeque() {
		Collection<Object> array = new LinkedBlockingDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingAbstractCollectionLinkedBlockingDeque() {
		AbstractCollection<Object> array = new LinkedBlockingDeque<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);
		return time;

	}

	private long testingCopyOnWriteArrayList() {
		CopyOnWriteArrayList<Object> array = new CopyOnWriteArrayList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingListCopyOnWriteArrayList() {
		List<Object> array = new CopyOnWriteArrayList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingCollectionCopyOnWriteArrayList() {
		Collection<Object> array = new CopyOnWriteArrayList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingRoleList() {
		RoleList array = new RoleList();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingListRoleList() {
		List<Object> array = new RoleList();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingAbstractListRoleList() {
		AbstractList<Object> array = new RoleList();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingCollectionRoleList() {
		Collection<Object> array = new RoleList();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingAbstractCollectionRoleList() {
		AbstractCollection<Object> array = new RoleList();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
		long time = (end - start);
		refreshTotalTime(time);

		return time;
	}

	private long testingArrayListRoleList() {
		ArrayList<Object> array = new RoleList();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(i);
		}
		long end = System.currentTimeMillis();
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
