package Lambda;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class EvenNumberOperationsTest {
	
	int sum = 0;
	int product = 1;
	int[] square = new int[5];
	

	public static void main(String[] args) {
		
		EvenNumberOperationsTest test = new EvenNumberOperationsTest();


//		printEvenNumbers(10);
//
//			int result = calculateSumOfEvenNumbers(10);
//			System.out.println("Sum: " + result);
//
//			result = calculateProductOfEvenNumbers(10);
//			System.out.println("Product: " + result);
//
//			int[] square = calculateSquareOfEvenNumbers(10);
//			System.out.print("Squares: [ ");
//			for(int i : square)
//				System.out.print(i + " ");
//			System.out.println("]");
			
			
			EvenNumberOperation printEvenNumbers2 = (int j) -> {System.out.print(j + " ");};
			calculate(printEvenNumbers2, 10);
			
			System.out.println();
			
			EvenNumberOperation calculateSumOfEvenNumbers = (int k) -> {test.sum += k; };
			calculate(calculateSumOfEvenNumbers, 4);
			System.out.println(test.sum);
			
			
			EvenNumberOperation calculateProductOfEvenNumbers = (int k) -> {test.product*=k;};
			calculate(calculateProductOfEvenNumbers, 4);
			System.out.println(test.product);
			

	
			EvenNumberOperation calculateSquareOfEvenNumbers = (int k) -> {test.square[k/2 -1]= (int) Math.pow(k, k);};
			calculate(calculateSquareOfEvenNumbers,4);
			System.out.println(Arrays.toString(test.square));
			
		}

	static void calculate(EvenNumberOperation evenNumberOperation, int n) {

		for(int i = 2; i<=n; i+=2) {
			evenNumberOperation.operate(i);
		}

	}
	


	static void printEvenNumbers(int n) {
		for (int i = 2; i <= n; i += 2)
			System.out.print(i + " ");
		System.out.println();
	}

	static int calculateSumOfEvenNumbers(int n) {
		int sum = 0;
		for (int i = 2; i <= n; i += 2)
			sum += i;
		return sum;
	}

	static int calculateProductOfEvenNumbers(int n) {
		int product = 1;
		for (int i = 2; i <= n; i += 2)
			product *= i;
		return product;
	}

	static int[] calculateSquareOfEvenNumbers(int n) {
		int[] square = new int[5];
		for (int i = 2; i <= n; i += 2)
			square[i / 2 - 1] = i * i;
		return square;
	}

}
