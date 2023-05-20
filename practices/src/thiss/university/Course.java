package thiss.university;

import java.util.Date;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */

public class Course {
	String code;

	{
		System.out.println("instance initializer block-code");
		code = "abc";
	}

	String name;

	{
		System.out.println("instance initializer block-name");
		name = "def";
	}

	Department department;

	{
		System.out.println("instance initializer block-department");
		department.name = "software";
	}

	Professor teacher;

	{
		System.out.println(" instance initializer block-teacher");
		teacher.name = "akın";
	}

	Student[] students;

	{
		System.out.println(" instance initializer block-students");

	}

	String[] days;
	Date time;

	// no-arg constructor
	public Course() {

	}

	// arg constructor
	public Course(String code, String name, Department department, Professor teacher, Student[] students, String[] days,
			Date time) {
		this.code = code;
		this.name = name;
		this.department = department;
		this.teacher = teacher;
		this.students = students;
		this.time = time;

	}

	public Course(String code, String name) {
		this.code = code;
		this.name = name;

	}

	public Course(String code) {
		this(code, "cansu");
	}
	
	

}
