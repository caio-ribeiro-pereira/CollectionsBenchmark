package com.appspot.collection.java.benchmark;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.management.relation.RoleList;

public class ListBenchmark extends CollectionBenchmark implements JavaBenchMark {

	public ListBenchmark(int max, Object val) {
		super(max, val);
	}

	@Override
	public Map<String, Long> executar() {
		Map<String, Long> resultado = new TreeMap<String, Long>();
		resultado.put("Array", testingArray());
		resultado.put("ArrayList -> ArrayList", testingArrayList());
		resultado.put("List -> ArrayList", testingListArrayList());
		resultado.put("AbstractList -> ArrayList", testingAbstractListArrayList());
		resultado.put("Collection -> ArrayList", testingCollectionArrayList());
		resultado.put("AbstractCollection -> ArrayList", testingAbstractCollectionArrayList());
		resultado.put("LinkedList -> LinkedList", testingLinkedList());
		resultado.put("List -> LinkedList", testingListLinkedList());
		resultado.put("AbstractList -> LinkedList", testingAbstractListLinkedList());
		resultado.put("AbstractSequentialList -> LinkedList", testingAbstractSequentialListLinkedList());
		resultado.put("Collection -> LinkedList", testingCollectionLinkedList());
		resultado.put("AbstractCollection -> LinkedList", testingAbstractCollectionLinkedList());
		resultado.put("Deque -> LinkedList", testingDequeLinkedList());
		resultado.put("Queue -> LinkedList", testingQueueLinkedList());
		resultado.put("Stack -> Stack", testingStack());
		resultado.put("List -> Stack", testingListStack());
		resultado.put("AbstractList -> Stack", testingAbstractListStack());
		resultado.put("Collection -> Stack", testingCollectionStack());
		resultado.put("AbstractCollection -> Stack", testingAbstractCollectionStack());
		resultado.put("Vector -> Stack", testingVectorStack());
		resultado.put("Vector -> Vector", testingVector());
		resultado.put("List -> Vector", testingListVector());
		resultado.put("AbstractList -> Vector", testingAbstractListVector());
		resultado.put("Collection -> Vector", testingCollectionVector());
		resultado.put("AbstractCollection -> Vector", testingAbstractCollectionVector());
		resultado.put("RoleList -> RoleList", testingRoleList());
		resultado.put("List -> RoleList", testingListRoleList());
		resultado.put("ArrayList -> RoleList", testingArrayListRoleList());
		resultado.put("AbstractList -> RoleList", testingAbstractListRoleList());
		resultado.put("Collection -> RoleList", testingCollectionRoleList());
		resultado.put("AbstractCollection -> RoleList", testingAbstractCollectionRoleList());
		resultado.put("CopyOnWriteArrayList -> CopyOnWriteArrayList", testingCopyOnWriteArrayList());
		resultado.put("List -> CopyOnWriteArrayList", testingListCopyOnWriteArrayList());
		resultado.put("Collection -> CopyOnWriteArrayList", testingCollectionCopyOnWriteArrayList());
		return resultado;
	}

	private long testingArray() {
		Object[] array = new Object[getMax()];
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array[i] = getVal();
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingArrayList() {
		ArrayList<Object> array = new ArrayList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingListArrayList() {
		List<Object> array = new ArrayList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractListArrayList() {
		AbstractList<Object> array = new ArrayList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingCollectionArrayList() {
		Collection<Object> array = new ArrayList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractCollectionArrayList() {
		AbstractCollection<Object> array = new ArrayList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingLinkedList() {
		LinkedList<Object> array = new LinkedList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingListLinkedList() {
		List<Object> array = new LinkedList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractListLinkedList() {
		AbstractList<Object> array = new LinkedList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingCollectionLinkedList() {
		Collection<Object> array = new LinkedList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractCollectionLinkedList() {
		AbstractCollection<Object> array = new LinkedList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingDequeLinkedList() {
		Deque<Object> array = new LinkedList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingQueueLinkedList() {
		Queue<Object> array = new LinkedList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractSequentialListLinkedList() {
		AbstractSequentialList<Object> array = new LinkedList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingStack() {
		Stack<Object> array = new Stack<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingListStack() {
		List<Object> array = new Stack<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractListStack() {
		AbstractList<Object> array = new Stack<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingCollectionStack() {
		Collection<Object> array = new Stack<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractCollectionStack() {
		AbstractCollection<Object> array = new Stack<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingVectorStack() {
		Vector<Object> array = new Stack<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingVector() {
		Vector<Object> array = new Vector<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingListVector() {
		List<Object> array = new Vector<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractListVector() {
		AbstractList<Object> array = new Vector<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingCollectionVector() {
		Collection<Object> array = new Vector<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractCollectionVector() {
		AbstractCollection<Object> array = new Vector<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingCopyOnWriteArrayList() {
		CopyOnWriteArrayList<Object> array = new CopyOnWriteArrayList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingListCopyOnWriteArrayList() {
		List<Object> array = new CopyOnWriteArrayList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingCollectionCopyOnWriteArrayList() {
		Collection<Object> array = new CopyOnWriteArrayList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingRoleList() {
		RoleList array = new RoleList();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingListRoleList() {
		List<Object> array = new RoleList();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractListRoleList() {
		AbstractList<Object> array = new RoleList();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingCollectionRoleList() {
		Collection<Object> array = new RoleList();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingAbstractCollectionRoleList() {
		AbstractCollection<Object> array = new RoleList();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}

	private long testingArrayListRoleList() {
		ArrayList<Object> array = new RoleList();
		long start = System.currentTimeMillis();
		for (int i = 0; i < getMax(); i++) {
			array.add(getVal());
		}
		long end = System.currentTimeMillis();

		return (end - start);
	}
}
