package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		// somat�rio dos elementos da lista
		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Soma = " + sum);
		
		// multiplica��o dos elementos da lista
		int mult = list.stream().reduce(1, (x, y) -> x * y);
		System.out.println("Multiplica��o = " + mult);
		
		//pipeline - n�meros multiplica��o dos pares 
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.collect(Collectors.toList());
		System.out.println("Mulitplica��o dos pares = " + Arrays.toString(newList.toArray()));
	}
}
