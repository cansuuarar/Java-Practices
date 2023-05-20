package polymorphism;

import java.util.Date;

public class MasterStudent extends GraduateStudent {
	
	public MasterStudent() {};
	
	public MasterStudent(int no, String name, int year, Date dob, String major) {
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

	@Override
	public void writeThesis() {

	}

	@Override
	public void meetWithAdvisor() {

	}

}
