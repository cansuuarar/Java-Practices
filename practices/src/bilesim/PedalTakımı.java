package bilesim;

public class PedalTakımı {
	
private String name;
	
	public PedalTakımı(String name) {
		this.name = name;
		System.out.println("A PedalTakımı is created: " + name);
	}
	
	public void push(){
		System.out.println("PedalTakımı is pushed.");
	}

}
