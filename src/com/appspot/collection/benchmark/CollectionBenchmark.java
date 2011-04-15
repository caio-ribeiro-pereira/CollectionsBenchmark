package com.appspot.collection.benchmark;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 * Java Collections Benchmark
 * 
 * Um aplicativo para medir a performance das principais estruturas
 * (Collections) do Java SE 6.
 * 
 * Classe Abstrata para as classes de Benchmark utilizarem.
 * 
 * @author Caio Ribeiro Pereira
 * @see https://github.com/caio-ribeiro-pereira/CollectionsBenchmark
 * @see www.twitter.com/crp_underground
 * @since 15/04/2011
 */
public abstract class CollectionBenchmark {

	private int max;
	private long totalTime;
	private Map<String, Long> collection;

	public CollectionBenchmark(int max) {
		this.max = max;
		this.totalTime = 0;
		this.collection = new LinkedHashMap<String, Long>();
	}

	protected int getMax() {
		return max;
	}

	protected void setMax(int max) {
		this.max = max;
	}

	protected void refreshTotalTime(long time) {
		this.totalTime += time;
	}

	protected long getTotalTime() {
		return this.totalTime;
	}

	protected Map<String, Long> getCollection() {
		return collection;
	}

}
