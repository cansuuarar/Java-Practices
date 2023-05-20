package polymorphism;

import java.util.Date;

public abstract class AbstractStudent implements Student{
	protected int no;
	protected String name;
	protected int year;
	protected Date dob;
	protected String major;
	
	public AbstractStudent() {
		// TODO Auto-generated constructor stub
	}
	
	public AbstractStudent(int no, String name, int year, Date dob,String major ) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.dob = dob;
		this.major = major;
	}
	
	
}
