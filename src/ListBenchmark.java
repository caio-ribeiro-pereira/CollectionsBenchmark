import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.management.relation.RoleList;

public class ListBenchmark {

	public static final int MAX = 1000000;
	public static final Object VAL = "TEST";

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Java SE 6 Collections Benchmark");
		System.out.println("Realizando testes com variações da Collection List");
		System.out.println("Aperte ENTER para começar!");
		scn.nextLine();
		System.out.println("Inserindo: " + MAX + " Objects");
		System.out.println("Tipo de dado: " + VAL.getClass().getSimpleName());
		System.out.println("Valor: " + VAL);
		System.out.println("Tempo\t|\tTipo de Instancia");
		System.out.println("==========================================================================");
		System.out.println(benchmarkArray(VAL) + " ms\t|\tArray");
		System.out.println("==========================================================================");
		System.out.println(benchmarkArrayList(VAL) + " ms\t|\tArrayList -> ArrayList");
		System.out.println(benchmarkListArrayList(VAL) + " ms\t|\tList -> ArrayList");
		System.out.println(benchmarkAbstractListArrayList(VAL) + " ms\t|\tAbstractList -> ArrayList");
		System.out.println(benchmarkCollectionArrayList(VAL) + " ms\t|\tCollection -> ArrayList");
		System.out.println(benchmarkAbstractCollectionArrayList(VAL) + " ms\t|\tAbstractCollection -> ArrayList");
		System.out.println("==========================================================================");
		System.out.println(benchmarkLinkedList(VAL) + " ms\t|\tLinkedList -> LinkedList");
		System.out.println(benchmarkListLinkedList(VAL) + " ms\t|\tList -> LinkedList");
		System.out.println(benchmarkAbstractListLinkedList(VAL) + " ms\t|\tAbstractList -> LinkedList");
		System.out.println(benchmarkAbstractSequentialListLinkedList(VAL) + " ms\t|\tAbstractSequentialList -> LinkedList");
		System.out.println(benchmarkCollectionLinkedList(VAL) + " ms\t|\tCollection -> LinkedList");
		System.out.println(benchmarkAbstractCollectionLinkedList(VAL) + " ms\t|\tAbstractCollection -> LinkedList");
		System.out.println(benchmarkDequeLinkedList(VAL) + " ms\t|\tDeque -> LinkedList");
		System.out.println(benchmarkQueueLinkedList(VAL) + " ms\t|\tQueue -> LinkedList");
		System.out.println("==========================================================================");
		System.out.println(benchmarkStack(VAL) + " ms\t|\tStack -> Stack");
		System.out.println(benchmarkListStack(VAL) + " ms\t|\tList -> Stack");
		System.out.println(benchmarkAbstractListStack(VAL) + " ms\t|\tAbstractList -> Stack");
		System.out.println(benchmarkCollectionStack(VAL) + " ms\t|\tCollection -> Stack");
		System.out.println(benchmarkAbstractCollectionStack(VAL) + " ms\t|\tAbstractCollection -> Stack");
		System.out.println(benchmarkVectorStack(VAL) + " ms\t|\tVector -> Stack");
		System.out.println("==========================================================================");
		System.out.println(benchmarkVector(VAL) + " ms\t|\tVector -> Vector");
		System.out.println(benchmarkListVector(VAL) + " ms\t|\tList -> Vector");
		System.out.println(benchmarkAbstractListVector(VAL) + " ms\t|\tAbstractList -> Vector");
		System.out.println(benchmarkCollectionVector(VAL) + " ms\t|\tCollection -> Vector");
		System.out.println(benchmarkAbstractCollectionVector(VAL) + " ms\t|\tAbstractCollection -> Vector");
		System.out.println("==========================================================================");
		System.out.println(benchmarkRoleList(VAL) + " ms\t|\tRoleList -> RoleList");
		System.out.println(benchmarkListRoleList(VAL) + " ms\t|\tList -> RoleList");
		System.out.println(benchmarkArrayListRoleList(VAL) + " ms\t|\tArrayList -> RoleList");
		System.out.println(benchmarkAbstractListRoleList(VAL) + " ms\t|\tAbstractList -> RoleList");
		System.out.println(benchmarkCollectionRoleList(VAL) + " ms\t|\tCollection -> RoleList");
		System.out.println(benchmarkAbstractCollectionRoleList(VAL) + " ms\t|\tAbstractCollection -> RoleList");
		System.out.println("==========================================================================");
		System.out.println(benchmarkCopyOnWriteArrayList(VAL) + " ms\t|\tCopyOnWriteArrayList -> CopyOnWriteArrayList");
		System.out.println(benchmarkListCopyOnWriteArrayList(VAL) + " ms\t|\tList -> CopyOnWriteArrayList");
		System.out.println(benchmarkCollectionCopyOnWriteArrayList(VAL) + " ms\t|\tCollection -> CopyOnWriteArrayList");

	}

	// ARRAY TEST
	public static long benchmarkArray(Object val) {
		Object[] array = new Object[MAX];
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array[i] = val;
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	// ARRAYLIST TEST
	public static long benchmarkArrayList(Object val) {
		ArrayList<Object> array = new ArrayList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkListArrayList(Object val) {
		List<Object> array = new ArrayList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkAbstractListArrayList(Object val) {
		AbstractList<Object> array = new ArrayList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkCollectionArrayList(Object val) {
		Collection<Object> array = new ArrayList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkAbstractCollectionArrayList(Object val) {
		AbstractCollection<Object> array = new ArrayList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	// LinkedList Test
	public static long benchmarkLinkedList(Object val) {
		LinkedList<Object> array = new LinkedList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkListLinkedList(Object val) {
		List<Object> array = new LinkedList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkAbstractListLinkedList(Object val) {
		AbstractList<Object> array = new LinkedList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkCollectionLinkedList(Object val) {
		Collection<Object> array = new LinkedList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkAbstractCollectionLinkedList(Object val) {
		AbstractCollection<Object> array = new LinkedList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkDequeLinkedList(Object val) {
		Deque<Object> array = new LinkedList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkQueueLinkedList(Object val) {
		Queue<Object> array = new LinkedList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkAbstractSequentialListLinkedList(Object val) {
		AbstractSequentialList<Object> array = new LinkedList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	// STACK TEST
	public static long benchmarkStack(Object val) {
		Stack<Object> array = new Stack<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkListStack(Object val) {
		List<Object> array = new Stack<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkAbstractListStack(Object val) {
		AbstractList<Object> array = new Stack<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkCollectionStack(Object val) {
		Collection<Object> array = new Stack<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkAbstractCollectionStack(Object val) {
		AbstractCollection<Object> array = new Stack<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkVectorStack(Object val) {
		Vector<Object> array = new Stack<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	// Vector Test
	public static long benchmarkVector(Object val) {
		Vector<Object> array = new Vector<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkListVector(Object val) {
		List<Object> array = new Vector<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkAbstractListVector(Object val) {
		AbstractList<Object> array = new Vector<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkCollectionVector(Object val) {
		Collection<Object> array = new Vector<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkAbstractCollectionVector(Object val) {
		AbstractCollection<Object> array = new Vector<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	// CopyOnWriteArrayList Test
	public static long benchmarkCopyOnWriteArrayList(Object val) {
		CopyOnWriteArrayList<Object> array = new CopyOnWriteArrayList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkListCopyOnWriteArrayList(Object val) {
		List<Object> array = new CopyOnWriteArrayList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkCollectionCopyOnWriteArrayList(Object val) {
		Collection<Object> array = new CopyOnWriteArrayList<Object>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	// ROLELIST TEST
	public static long benchmarkRoleList(Object val) {
		RoleList array = new RoleList();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkListRoleList(Object val) {
		List<Object> array = new RoleList();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkAbstractListRoleList(Object val) {
		AbstractList<Object> array = new RoleList();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkCollectionRoleList(Object val) {
		Collection<Object> array = new RoleList();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkAbstractCollectionRoleList(Object val) {
		AbstractCollection<Object> array = new RoleList();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}

	public static long benchmarkArrayListRoleList(Object val) {
		ArrayList<Object> array = new RoleList();
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			array.add(val);
		}
		long end = System.currentTimeMillis();
		System.gc();
		return (end - start);
	}
}
