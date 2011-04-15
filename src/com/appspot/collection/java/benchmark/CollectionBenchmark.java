package com.appspot.collection.java.benchmark;

public abstract class CollectionBenchmark {

	private int max;
	private Object val;

	public CollectionBenchmark(int max, Object val) {
		this.max = max;
		this.val = val;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public Object getVal() {
		return val;
	}

	public void setVal(Object val) {
		this.val = val;
	}
}
