package bilesim;

// git --> bisiklet ilerlemeli
// pedal döndüğünde bike ilerlemeli

public class Bike {

	private String brand;

	private Sele sele;
	private Tekerlek[] tekerlek;
	private int tekerSayısı;
	private PedalTakımı pedalTakımı;

	public Bike(String brand, Sele sele, PedalTakımı pedalTakımı, int tekerSayısı) {
		this.brand = brand;

		this.sele = sele;
		sele = new Sele("salcano");

		this.tekerSayısı = tekerSayısı;
		tekerlek = new Tekerlek[this.tekerSayısı];
		tekerlek[0] = new Tekerlek("ön tekerlek");
		tekerlek[1] = new Tekerlek("arka tekerlek");
		
		this.pedalTakımı = pedalTakımı;

	}
	
	public void push() {
		pedalTakımı.push();
	}

}
