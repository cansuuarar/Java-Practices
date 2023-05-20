package classesAndObjects1;

public class Reader {

	String name;
	int age;
	char sex;
	
	void read(Book book) {
		System.out.println("kitap okundu");
	}
	
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	int getAge() {
		return age;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	char getSex() {
		return sex;
	}
	
	void setSex(char sex) {
		this.sex = sex;
	}

}
