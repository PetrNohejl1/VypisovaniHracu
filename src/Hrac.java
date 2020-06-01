
public class Hrac {
	private String jmeno;
	private int pocetZivotu;
	private int aktualniPocetZivotu;
	private int sila;
	private IVypisovadlo naseVypisovadlo;

	
	
	public String getJmeno() {
		return jmeno;
	}

	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}

	public int getPocetZivotu() {
		return pocetZivotu;
	}

	public void setPocetZivotu(int pocetZivotu) {
		this.pocetZivotu = pocetZivotu;
		this.aktualniPocetZivotu = pocetZivotu;
	}
		
	public int getAktualniPocetZivotu() {
		return aktualniPocetZivotu;
	}
	
	

	public int getSila() {
		return sila;
	}

	public void setSila(int sila) {
		this.sila = sila;
	}

	public IVypisovadlo getNaseVypisovadlo() {
		return naseVypisovadlo;
	}

	public void setNaseVypisovadlo(IVypisovadlo naseVypisovadlo) {
		this.naseVypisovadlo = naseVypisovadlo;
	}

	public int zmenPocetZivotu(int zmena) {
		
		aktualniPocetZivotu = aktualniPocetZivotu + zmena;
		return aktualniPocetZivotu;
	}
	
	public void setAktualniPocetZivotu(int aktualniPocetZivotu) {
		this.aktualniPocetZivotu = aktualniPocetZivotu;
	}

	public void vypis() {
		System.out.println("Jmeno: "+ jmeno);
		System.out.println("Pocet zivotu: "+naseVypisovadlo.preved(aktualniPocetZivotu, pocetZivotu));
		System.out.println("Sila: "+ sila);
	}
	
}
