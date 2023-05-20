import java.util.Arrays;

public class ArrayAsParameter {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3 };
		System.out.println("orj array: " + Arrays.toString(array));
		modifyArray(array);
		
		System.out.println("modified array " + Arrays.toString(array));
		
	}
	
	public static void modifyArray(int[] arr) {
		arr[0] = 5;
		arr = new int[] {7,8,9};
	}

}
