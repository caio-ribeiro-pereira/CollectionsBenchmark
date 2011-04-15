package com.appspot.collection.java.benchmark;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int running = 1;
		while (running != 0) {
			System.out.println("Java SE 6 Collections Benchmark");
			System.out.print("Digite o total de elementos a inserir nas Collections: ");
			int max = scn.nextInt();
			System.out.print("Digite um tipo de valor qualquer: ");
			String val = scn.next();
			System.out.println("Inserindo: " + max + " Objects");
			System.out.println("Valor: " + val);
			System.out.println("Executando...");
			long time = 0;
			time += setBenchmark(max, val);
			time += listBenchmark(max, val);
			time += mapBenchmark(max, val);
			time += dequeBenchmark(max, val);
			System.out.println("Tempo total de execução: " + time + " ms");
			System.out.print("Deseja executar novamente? (1 - Sim | 0 - Não):");
			running = scn.nextInt();
		}
	}

	private static long setBenchmark(int max, Object val) {
		SetBenchmark benchmark = new SetBenchmark(max, val);
		System.out.println("Executando Variações de Sets.");
		System.out.println("----------------------------------------------------");
		long time = printBenchmark(benchmark);
		System.out.println("----------------------------------------------------");
		return time;
	}

	private static long listBenchmark(int max, Object val) {
		ListBenchmark benchmark = new ListBenchmark(max, val);
		System.out.println("Executando Variações de Lists.");
		System.out.println("----------------------------------------------------");
		long time = printBenchmark(benchmark);
		System.out.println("----------------------------------------------------");
		return time;
	}

	private static long mapBenchmark(int max, Object val) {
		MapBenchmark benchmark = new MapBenchmark(max, val);
		System.out.println("Executando Variações de Maps.");
		System.out.println("----------------------------------------------------");
		long time = printBenchmark(benchmark);
		System.out.println("----------------------------------------------------");
		return time;
	}

	private static long dequeBenchmark(int max, Object val) {
		DequeBenchmark benchmark = new DequeBenchmark(max, val);
		System.out.println("Executando Variações de Deques.");
		System.out.println("----------------------------------------------------");
		long time = printBenchmark(benchmark);
		System.out.println("----------------------------------------------------");
		return time;
	}

	private static long printBenchmark(JavaBenchMark benchmark) {
		long init = System.currentTimeMillis();
		Map<String, Long> resultado = benchmark.executar();
		long end = System.currentTimeMillis();
		Set<String> keys = resultado.keySet();
		for (String key : keys) {
			System.out.printf("Tempo: %d ms | Instância: %s\n", resultado.get(key), key);
		}
		long time = (end - init);
		System.out.println("Tempo gasto: " + time + " ms");
		return time;
	}

}
