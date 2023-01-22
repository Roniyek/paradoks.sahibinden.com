package paradoks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class VeriTabani extends Paradoks_Ticaret{
private static Scanner konsol;
static int cikis = 0;
public static int AnaGiris() throws Exception {
	 Scanner konsol = new Scanner(System.in);
	 int kullaniciSayisi = 0;

			System.out.println("Hosgeldiniz");
		System.out.println("Kayit olmak icin 1");
		System.out.println("Giris yapmak icin 2");
		System.out.println("Cikis yapmak icin 3");
		int secenek = konsol.nextInt();
		switch (secenek) {
		case 1:
			kayıtOl();
			break;
		case 2:
			System.out.println("Lutfen kullanici adi giriniz: ");
			String kullanıcıAdı = konsol.next();

			System.out.println("Lutfen sifre giriniz: ");
			String şifre = konsol.next();
			boolean girişYap = girişYap(kullanıcıAdı, şifre);
			if(girişYap) {
				System.out.println("Basarili bir sekilde giris yaptiniz " + kullanıcıAdı);
				
			} else {
				System.out.println("Boyle bir kullanici bulunamadi.");
				return AnaGiris();
			}
                        
			 break;
		case 3:
			System.exit(0);
			
			
			
		default:
			System.out.println("Yanlis bir tusa bastiniz");
			return AnaGiris();
			
		}
		return cikis=0;
	}

	
	public static int kayıtOl() throws Exception {
		System.out.println("Lutfen kullanici adi giriniz: ");
		konsol = new Scanner(System.in);
		
		String kullanıcıAdı = konsol.next();

		System.out.println("Lutfen sifre giriniz: ");
		String şifre = konsol.next();

		System.out.println("Lutfen adinizi giriniz: ");
		String isim = konsol.next();

		System.out.println("Lutfen soyadinizi giriniz: ");
		String soyad = konsol.next();

		Writer r = new FileWriter("kullanicilar.csv", true);
		r.write(kullanıcıAdı + ";" + şifre + ";" + isim + ";" + soyad + "\n");
		r.close();
		
		System.out.println("Basarili bir sekilde kayit oldunuz.");
		return AnaGiris();

	}

	public static boolean girişYap(String kullanıcıAdı, String şifre) throws FileNotFoundException {
		File dosya = new File("kullanicilar.csv");
		Scanner s = new Scanner(dosya);
		
		boolean başarılımı = false;
		while(s.hasNextLine()) {
			int kullaniciSayisi = 0;
			kullaniciSayisi++;
			String satir = s.nextLine();
			String[] split = satir.split(";");
			String veritabanıKullanıcıAdı = "";
			String veritabanıŞifre = "";
			for(int i = 0; i < split.length; i++) {
				if(i == 0) {
					veritabanıKullanıcıAdı = split[0];
				} else if(i == 1) {
					veritabanıŞifre = split[1];
				}
			}
			if(veritabanıKullanıcıAdı.equals(kullanıcıAdı) && şifre.equals(veritabanıŞifre)) {
				başarılımı = true;
				
			}
		}
		s.close();
		if(başarılımı) {
			return true;
		} else {
			return false;
		}
		
		}
	public static void main(String[] args) {
		
	}

		
	
}