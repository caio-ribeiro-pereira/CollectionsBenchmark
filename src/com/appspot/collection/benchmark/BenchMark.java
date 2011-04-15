package com.appspot.collection.benchmark;

import java.util.Map;

/**
 * 
 * Java Collections Benchmark
 * 
 * Um aplicativo para medir a performance das principais estruturas
 * (Collections) do Java SE 6.
 * 
 * Classe Interface que retorna os resultados principais de um Benchmark.
 * 
 * @author Caio Ribeiro Pereira
 * @see https://github.com/caio-ribeiro-pereira/CollectionsBenchmark
 * @see www.twitter.com/crp_underground
 * @since 15/04/2011
 */
public interface BenchMark {

	/**
	 * Executa uma todas as variações de uma Collection (List, Set ou Map).
	 * 
	 * @author Caio Ribeiro Pereira
	 * @since 15/04/2011
	 * @return Map com os resultados do benchmark. String -> Variação de uma
	 *         Collection. Ex.: Set -> HashSet, Map -> TreeMap... Long -> Tempo
	 *         em milisegundos da execução de uma variação.
	 */
	public Map<String, Long> execute();

	/**
	 * Retorna o tempo total gasto na execução de uma CollectionBenchmark
	 * 
	 * @author Caio Ribeiro Pereira
	 * @since 15/04/2011
	 * @return tempo total de execução em nanosegundos de todas as variações.
	 */
	public Long totalTime();

	/**
	 * Retorna o total de variações realiazadas em uma específica
	 * CollectionBenchmark.
	 * 
	 * @author Caio Ribeiro Pereira
	 * @since 15/04/2011
	 * @return total de variações executadas de uma CollectionBenchmark.
	 */
	public Integer totalCollection();
}
