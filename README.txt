Java SE 6 Collection Benchmark.

Um aplicativo para medir a performance de escrita de elementos nas Classes Collections do Java.

Nesta versão foi implementado todas as variações de Lists, Maps e Sets.

Como utilizar?
 
1 - * Faça o download do aplicativo https://github.com/caio-ribeiro-pereira/CollectionsBenchmark/raw/master/collection-benchmark-1.0.jar
2 - Execute o terminal ou prompt de comando do seu sistema operacional e acesse via comando o diretório de origen do aplicativo.
3 - Execute o comando: "java -jar collection-benchmark-1.0.jar" (Sem aspas).
4 - ** Determine o número de elementos que serão inseridos no benchmark.

Exemplo de resultado gerado:
HashMap -> HashMap | 9016000 nanoseconds. = HashMap<Object, Object> map = new HashMap<Object, Object>();
        Map -> HashMap | 4931000 nanoseconds. = Map<Object, Object> map = new HashMap<Object, Object>();
     List -> ArrayList | 4000050 nanoseconds. = List<Object> list = new ArrayList<Object>();
    TreeSet -> TreeSet | 702000 nanoseconds.  = TreeSet<Object> set = new TreeSet<Object>();
        Set -> TreeSet | 718000 nanoseconds.  = Set<Object> set = new TreeSet<Object>();
  SortedSet -> TreeSet | 737000 nanoseconds.  = SortedSet<Object> set = new TreeSet<Object>();
        
Obs.: 
* Para utilizar este aplicativo é necessário ter instalado em sua máquina pelo menos um JRE versão 6 ou superior.
** Cuidado com o número de elementos a inserir, pois poderá ocorrer travamentos no sistema se for utilizar números absurdos para teste, recomendo no máximo a inclusão de 100000 elementos para teste.