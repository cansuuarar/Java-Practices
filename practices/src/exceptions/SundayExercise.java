package exceptions;

import java.util.Scanner;

class BaseException extends Exception {
	public BaseException(String message) {
		super(message);
	}

	public BaseException() {
	}

}

class NameNotValidException extends BaseException {

	String name;

	public NameNotValidException(String message, String name) {
		super(message);
		this.name = name;

	}

	public NameNotValidException() {
		super();
	}

}

class TcknNotValidException extends BaseException {

}

class YearNotValidException extends BaseException {
	
}

class EmailNotValidException extends BaseException{
	
}

public class SundayExercise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter your first name: ");
			String firstName = sc.next();
			isValidName(firstName);

			System.out.println("enter your last name: ");
			String lastName = sc.next();
			isValidName(lastName);

			System.out.println("enter your tckn: ");
			String tcKn = sc.next();
			isValidTckn(tcKn);
			
			System.out.println("enter your birth year: ");
			Integer year = sc.nextInt();
			isValidBirthYear(year);
			
			System.out.println("enter your email: ");
			String email = sc.next();
			isValidEmail(email);

		} catch (NameNotValidException e) {
			e.printStackTrace();
		} catch (TcknNotValidException e) {
			e.printStackTrace();
		} catch (YearNotValidException e) {
			e.printStackTrace();
		} catch (EmailNotValidException e) {
			e.printStackTrace();
		}

	}

	public static boolean isValidName(String name) throws NameNotValidException {
		boolean a = false;
		for (int i : name.toCharArray()) {
			if (Character.isLetter(i)) {
				a = true;
			} else
				throw new NameNotValidException();

		}
		return a;

	}

	public static boolean isValidTckn(String tckn) throws TcknNotValidException {
		boolean isValidTckn = false;

		for (int i : tckn.toCharArray()) {
			if (tckn.length() == 11 && Character.isDigit(i)) {
				isValidTckn = true;
			} else {
				throw new TcknNotValidException();
			}

		}

		return isValidTckn;

	}

	public static boolean isValidBirthYear(Integer year) throws YearNotValidException {
		boolean isValidYear = false;
		for(int i : year.toString().toCharArray()) {
			if(year.toString().length() == 4 && Character.isDigit(i) ) {
				isValidYear = true;
			}else {
				throw new YearNotValidException();
			}
		}
		return false;
		
	}

	public static boolean isValidEmail(String email) throws EmailNotValidException {
		boolean isValidEmail = false;
		
		for(int i : email.toCharArray()) {
			if(email.endsWith(".com") && email.contains("@")) {
				isValidEmail = true;
			}else {
				throw new EmailNotValidException();
			}
		}
		
		return isValidEmail;
		
	}
}
