package polymorphism;

import java.util.Date;

public class UndergraduateStudent extends AbstractStudent {

	public UndergraduateStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void study() {

	}

	@Override
	public void register() {

	}
	
	@Override
	public String toString() {
		return major;
		
	}
	
	

}
