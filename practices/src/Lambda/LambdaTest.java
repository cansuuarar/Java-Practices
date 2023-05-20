package Lambda;

public class LambdaTest {

	public static void main(String[] args) {
		
		Selamlama selamInEnglish = (String kimi) -> {System.out.println("welcome " + kimi ); };
		selamlamaTest(selamInEnglish, "cansu");
		//selamlamaTest(selamInEnglish, "cansu");
		
		System.out.println();
		
		Selamlama selamInFrench = (String kimi) -> {System.out.println("bienvenu " + kimi);};
		selamlamaTest(selamInFrench, "cansu");
		
		System.out.println("*******************************");
		
		
		TemperatureConversion celciusToFahrenheit = (double temperature) -> {System.out.println(temperature*1.8 + 32);}; 
		conversionTest(celciusToFahrenheit, 100);

	}
	
	public static void selamlamaTest(Selamlama selamlama, String kimi) {
		 selamlama.f(kimi);
		// Selamlama.cansu(kimi);
	}
	
	
	public static void conversionTest(TemperatureConversion temperatureConversion, double temperature) {
		temperatureConversion.convert(temperature);
	}

}
