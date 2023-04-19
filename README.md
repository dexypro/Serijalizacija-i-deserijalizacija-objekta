# Serijalizacija-i-deserijalizacija-objekta
Serijalizacija objekta u Javi se koristi za pretvaranje objekata u niz bajtova, koji može biti sačuvan ili prenesen kroz mrežu. Ovaj proces omogućava programerima da sačuvaju stanje objekta na trajni medij, kao što je hard disk, ili da ga šalju drugim aplikacijama ili servisima.

Serijalizacija ima nekoliko korisnih primena, uključujući:

1. Čuvanje stanja objekata: Serijalizacija omogućava čuvanje trenutnog stanja objekta u fajlu, koji se kasnije može učitati u memoriju i ponovno kreirati isti objekat sa istim stanjem.

2. Komunikacija između aplikacija: Objekti se često moraju slati iz jedne aplikacije u drugu, naročito u distribuiranim sistemima. Serijalizacija omogućava da se objekti lako prenose kroz mrežu.

3. Keširanje podataka: Serijalizacija se može koristiti za keširanje podataka tako što se objekti sačuvaju u memoriji ili na disku, a zatim se brzo učitavaju kada su potrebni.

4. Deep copying: Serijalizacija može biti korišćena za duboko kopiranje objekata tako što se objekat serijalizuje, a zatim deserijalizuje. Ovo će rezultirati novim objektom sa istim stanjem, ali sa novom referencom u memoriji.

Da biste koristili serijalizaciju u Javi, objekat mora implementirati interfejs Serializable, koji nema metoda, ali označava da je objekat spreman za serijalizaciju. Zatim možete koristiti ObjectOutputStream za serijalizaciju objekta u niz bajtova i ObjectInputStream za deserijalizaciju niza bajtova nazad u objekat.
