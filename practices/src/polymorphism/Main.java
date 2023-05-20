package polymorphism;

import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		
		//Student student1 = new VocationalStudent(1, "cansu", 1995, new Date(2023,03,24) , "electrical engineering");
		
		Student student2 = new GraduateStudent(2, "akın", 2000, new Date(10), "software");
		
		
		
		Student student3 = new MasterStudent();
		
		if(student3 instanceof GraduateStudent) {
			GraduateStudent gstudent = (GraduateStudent) student3;
			gstudent.meetWithAdvisor();
		}else {
			System.out.println("no");
		}
		
		
		
		
	}

}
