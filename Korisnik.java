package task2;

import java.io.Serializable;

//@formatter:on
/*3. Интерфејс Serializable – објаснити и имплементирати.
 * 
 * Interfejs Serializable u Javi je marker interfejs koji omogućava 
 * serijalizaciju objekta. Kada objekat implementira Serializable interfejs, 
 * to znači da objekat može biti pretvoren u niz bajtova koji se zatim mogu 
 * sačuvati na disku, preneti preko mreže ili koristiti za druge svrhe, kao 
 * što je duboko kopiranje
 * */
//@formatter:off
public class Korisnik implements Serializable {
	//@formatter:on
	/**
	 * 4. Податак serialVersionID објаснити и имплементирати.
	 * 
	 * serialVersionUID je statički finalni podatak (konstanta) tipa long u klasama
	 * koje implementiraju Serializable interfejs. Ovaj podatak se koristi kao
	 * verzija identifikatora za serijalizovanu klasu. serialVersionUID služi da
	 * osigura kompatibilnost između različitih verzija serijalizovane klase
	 * prilikom deserijalizacije.
	 *///@formatter:off
	private static final long serialVersionUID = 468458623484232034L;
	public int korisnickiID;
	public String ime;
	public String email;
}
