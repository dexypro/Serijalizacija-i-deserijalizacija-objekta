package task2;

import java.io.*;

/*1. Због чега се ради серијализација и десеријализација објекта?
 * - Čuvanje trenutnog stanja objekta u fajlu, koji se kasnije može učitati u memoriju i ponovno kreirati isti objekat sa istim stanjem.
 * - Objekti se često moraju slati iz jedne aplikacije u drugu. Serijalizacija omogućava da se objekti lako prenose kroz mrežu.
 * - Serijalizacija se može koristiti za keširanje podataka tako što se objekti sačuvaju u memoriji ili na disku, a zatim se brzo učitavaju kada su potrebni.
 * - Serijalizacija može biti korišćena za duboko kopiranje objekata tako što se objekat serijalizuje, a zatim deserijalizuje. Ovo će rezultirati novim objektom sa istim stanjem, ali sa novom referencom u memoriji.
 * */
public class SerijalizacijaDeserijalizacija {

	public static void serijalizacijaObjekta() {
		Korisnik korisnik = new Korisnik();
		korisnik.korisnickiID = 2545;
		korisnik.ime = "Dejan";
		korisnik.email = "dejan91@gmail.com";

		try {
			/*
			 * Fajlovi sa ekstenzijom .ser su serijalizovani fajlovi u Javi. Kada se objekti
			 * serijalizuju, tj. konvertuju u binarni format kako bi se čuvali na disku ili
			 * prenosili preko mreže, obično se čuvaju u fajlovima sa ekstenzijom .ser.
			 */
			FileOutputStream fos = new FileOutputStream("korisnik.ser");
			/*//@formatter:on
			 * 2a. Koja klasa omogućuje serijalizaciju? 
			 * 
			 * U Javi, serijalizacija se omogućava
			 * putem java.io.ObjectOutputStream
			 *///@formatter:off
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			/*//@formatter:on
			 * 5. - Креирање фајла коришћењем серијализације објекта.
			 * 
			 * Metoda writeObject() se koristi za serijalizaciju objekta Korisnik i čuvanje
			 * tog objekta u fajlu. Ova metoda je deo klase java.io.ObjectOutputStream, koja
			 * je zadužena za serijalizaciju objekata u Javi.
			 *///@formatter:off
			oos.writeObject(korisnik);
			oos.close();
			System.out.println("Serijalizovani podaci su sačuvani u korisnik.ser fajl!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void deserijalizacijaObjekta() throws IOException, ClassNotFoundException {
		Korisnik korisnik = null;

		try {
			FileInputStream fis = new FileInputStream("korisnik.ser");
			/*
			 * 2b. Koja klasa omogućuje deserijalizaciju? java.io.ObjectInputStream klasa je
			 * za deserijalizaciju objekata.
			 */
			ObjectInputStream ois = new ObjectInputStream(fis);
			korisnik = (Korisnik) ois.readObject();
			ois.close();
			fis.close();
		} finally {
			System.out.println("Deserijalizacija Korisnika...");
			System.out.println("Korisnički ID: " + korisnik.korisnickiID);
			System.out.println("Ime korisnika: " + korisnik.ime);
			System.out.println("Korisnički email: " + korisnik.email);
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		serijalizacijaObjekta();
		deserijalizacijaObjekta();
	}
}
