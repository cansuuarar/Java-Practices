package Lambda;


import java.util.Comparator;

import java.util.function.BinaryOperator;

public class BinaryOperatorExp {

	public static void main(String[] args) {
		
		binaryOperatorExpample();
		

	}
	
	public static void binaryOperatorExpample() {
		
		Book book1 = new Book();
		Book book2 = new Book();
	
		Comparator<Integer> comparator = (a, b) -> a - b;
				
		 book1 = new Book("The Cat in the Hat", "Dr", "Seuss", 400);
		 book2 = new Book("Harry Potter and The Sorcerers Stone", "JK", "Rowling", 411);
		
		BinaryOperator<Integer> maxPages = BinaryOperator.maxBy(comparator);
		
		
		
		System.out.println(maxPages.apply(book1.getPages(), book2.getPages()));
		
		
	}
	

}
