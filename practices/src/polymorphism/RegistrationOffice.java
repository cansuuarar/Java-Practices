package polymorphism;

import java.util.Date;

public class RegistrationOffice extends AbstractStudent{

	public RegistrationOffice(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
		// TODO Auto-generated constructor stub
	}
	
	public RegistrationOffice() {
		// TODO Auto-generated constructor stub
	}
	
	public Student getAStudent() {
		return null;
		
	}
	
	public void registerStudent(Student student) {
		
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}

}
