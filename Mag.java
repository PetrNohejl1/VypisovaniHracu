
public class Mag extends Hrac {
private int pocetMany;
private int aktualniPocetMany;

public int getPocetMany() {
	return pocetMany;
}
public void setPocetMany(int pocetMany) {
	this.pocetMany = pocetMany;
}
public int getAktualniPocetMany() {
	return aktualniPocetMany;
}
public void setAktualniPocetMany(int aktualniPocetMany) {
	this.aktualniPocetMany = aktualniPocetMany;
}

public void vypis() {
	super.vypis();
	System.out.println("Mana:" + getNaseVypisovadlo().preved(aktualniPocetMany, pocetMany));
}
}
