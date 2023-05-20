package thiss.university;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Professor {
	String no;
	String name;
	String dob;
	String rank;
	Department department;
	Student[] advisee;
	Course[] coursesGiven;

	public Professor() {

	}

	public Professor(String no, String name, String dob, String rank, Department department, Student[] advisee,
			Course[] coursesGiven) {
		this.no = no;
		this.name = name;
		this.dob = dob;
		this.rank = rank;
		this.department = department;
		this.advisee = advisee;
		this.coursesGiven = coursesGiven;
	}

}
