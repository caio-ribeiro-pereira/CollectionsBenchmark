package com.appspot.collection.benchmark;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.appspot.collection.benchmark.java.ListBenchmark;
import com.appspot.collection.benchmark.java.MapBenchmark;
import com.appspot.collection.benchmark.java.SetBenchmark;

/**
 * 
 * Java Collections Benchmark
 * 
 * Um aplicativo para medir a performance das principais estruturas
 * (Collections) do Java SE 6.
 * 
 * Classe main que executa o benchmark.
 * 
 * @author Caio Ribeiro Pereira
 * @see https://github.com/caio-ribeiro-pereira/CollectionsBenchmark
 * @see www.twitter.com/crp_underground
 * @since 15/04/2011
 */
public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("Java SE 6 Collection Benchmark");
		System.out.println("Author: Caio Ribeiro Pereira");
		System.out.println("Twitter: crp_underground");
		System.out.println("GitHub: https://github.com/caio-ribeiro-pereira/CollectionsBenchmark");
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.print("Type the number of elements for the collections: ");
		int max = scn.nextInt();
		System.out.println("Adding: " + max + " Objects.");
		System.out.println("Starting...");
		System.out.println("---------------------------------------------------------------------------------------------------------");
		setBenchmark(max);
		listBenchmark(max);
		mapBenchmark(max);
	}

	private static void setBenchmark(int max) {
		SetBenchmark benchmark = new SetBenchmark(max);
		System.out.println("Benchmarking Sets.");
		System.out.println("---------------------------------------------------------------------------------------------------------");
		printBenchmark(benchmark);
		System.out.println("---------------------------------------------------------------------------------------------------------");

	}

	private static void listBenchmark(int max) {
		ListBenchmark benchmark = new ListBenchmark(max);
		System.out.println("Benchmarking Lists.");
		System.out.println("---------------------------------------------------------------------------------------------------------");
		printBenchmark(benchmark);
		System.out.println("---------------------------------------------------------------------------------------------------------");

	}

	private static void mapBenchmark(int max) {
		MapBenchmark benchmark = new MapBenchmark(max);
		System.out.println("Benchmarking Maps.");
		System.out.println("---------------------------------------------------------------------------------------------------------");
		printBenchmark(benchmark);
		System.out.println("---------------------------------------------------------------------------------------------------------");

	}

	private static void printBenchmark(BenchMark benchmark) {
		Map<String, Long> resultado = benchmark.execute();
		Set<String> keys = resultado.keySet();
		for (String key : keys) {
			System.out.printf("Collection: %47s | Time: %d nanoseconds.\n", key, resultado.get(key));
		}
		System.out.println("Total of Collections: " + benchmark.totalCollection());
		System.out.println("Time elapsed: " + benchmark.totalTime() + " nanoseconds.");
	}

}
