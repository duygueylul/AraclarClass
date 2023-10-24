package OopClass;

public class Araclar {
	public String arac_sınıfı;
	public int g;
	public double motor_hacmi;
	public int max_hız;
	

	public static void main(String[] args) {
		
		
		Araclar oto = new Araclar();
		Araclar moto = new Araclar();
		
		oto.arac_sınıfı = "Otomobil";
		oto.g = 2500;
		oto.motor_hacmi = 2.0;
		oto.max_hız = 250;
		
		
		moto.arac_sınıfı = "Motosiklet";
		moto.g = 300;
		moto.motor_hacmi = 1000.0;
		moto.max_hız = 300;
		
		
		System.out.println("Araçlar sınıfından türetilmiş OTOMOBİL nesnesi değerleri: ");
		System.out.println("Araç Sınıfı: " + oto.arac_sınıfı);
		System.out.println("Araç Ağırlığı: " + oto.g);
		System.out.println("Motor Hacmi: " + oto.motor_hacmi);
		System.out.println("Max Hızı: " + oto.max_hız);
		
		
		
		System.out.println("Araçlar sınıfından türetilmiş MOTOSİKLET nesnesi değerleri: ");
		System.out.println("Araç Sınıfı: " + moto.arac_sınıfı);
		System.out.println("Araç Ağırlığı: " + moto.g);
		System.out.println("Motor Hacmi: " + moto.motor_hacmi);
		System.out.println("Max Hızı: " + moto.max_hız);
		
		
		

	}

}
