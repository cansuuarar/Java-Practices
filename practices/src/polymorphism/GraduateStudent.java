package polymorphism;

import java.util.Date;

public class GraduateStudent extends AbstractStudent{

	public GraduateStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
		// TODO Auto-generated constructor stub
	}
	
	public GraduateStudent() {
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
	
	public void writeThesis() {
		
	}
	
	public void meetWithAdvisor() {
		System.out.println("meet with advisor");
	}

}
