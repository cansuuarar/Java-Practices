package Lambda;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EvenNumberBuiltInInterfaces {

	public static void main(String[] args) {

		
		//is even number?
		Predicate<Integer> isEven = e -> {
			if(e%2 == 0) {
				return true;
			}else {
				return false;
			}
		};
		
		
		System.out.println("is even number? :  " + isEven.test(10));
		
		
		//print even numbers
		
		Function<Integer, String> printEvenNums = num -> {
			int array[] = new int[5];
			for(int i = 0; i< num; i+=2) {
				System.out.println(i + " ");
			}
			return null;
			
						
		};
		
		System.out.println(printEvenNums.apply(10));
		
		//
		
		
	}

}
