package thiss.university;
/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Test {

	public static void main(String[] args) {
		Department department1 = new Department();
		department1.name = "Software Engineering";
		
		Department department2 = new Department();
		department2.name = "Philosophy";
		
        Professor professor1 = new Professor();
        professor1.name = "Ahmet Arslan";
        Professor professor2 = new Professor();
        professor2.name = "Ali Veli";
        Professor professor3 = new Professor();
        professor3.name = "Ayse Fatma";
        
        
        Course course1 = new Course();
        course1.name = "Int. to Software Engineering";
        Course course2 = new Course();
        Course course3 = new Course();
        course2.name = "Ethics";
        course3.name = "Ontology";
        
        
        Student student1 = new Student();
        student1.name = "Akin Kaldiroglu";
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        student2.name = "Zeynep gül";
        student3.name = "Metin Sağlam";
        student4.name = "Murat Atılgan";
        
        
        // Head of Software Engineering department is Ahmet Arslan and consequently his department is Software Engineering.
        department1.head = professor1; 
        professor1.department = department1;
        
        // Department of Int. to Software Engineering course is Software Engineering and consequently the course
        // Int. to Software Engineering belongs to Software Engineering department.
        course1.department = department1;
        department1.courses = new Course[100];
        department1.courses[0] = course1;
        
        course2.department = department2;
        department2.courses = new Course[5];
        //department2.course[0] = course2;
        
        course1.teacher = professor1;
        professor1.coursesGiven = new Course[5];
        professor1.coursesGiven[0] = course1;
        
        professor1.advisee = new Student[10];
        professor1.advisee[0] = student1;
        student1.advisor = professor1;
        
        student1.coursesTaken = new Course[7];
        student1.coursesTaken[0] = course1;
        
        student2.coursesTaken = new Course[2];
        student2.coursesTaken[0] = course2;
        
        course1.students = new Student[100];
        course1.students[0] = student1;
        
        System.out.println("Name of student student1's first course is " + student1.coursesTaken[0].name);
        System.out.println("Name of student student1's first course's professor is " + student1.coursesTaken[0].teacher.name);
        System.out.println("Name of student studen t1's first course's professor's department is " + student1.coursesTaken[0].teacher.department.name);
        
        
        System.out.println("***********************");
        System.out.println("name of student2's first course is: " + student2.coursesTaken[0].name);
        
	}
	
}
