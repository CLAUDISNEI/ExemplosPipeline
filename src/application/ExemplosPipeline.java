package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemplosPipeline {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,4,5,10,7);
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		int soma = list.stream().reduce(0, (x,y) -> x + y);
		System.out.println("Soma: " + soma);
		
		List<Integer> novaList = list.stream()
				.filter(x -> x % 2 == 0)
				.map(x ->  x * 10)
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(novaList.toArray()));

	}

}
