
public class Main {

	public static void main(String[] args) {
		
		System.out.println();
		Hrac hrac1 = new Hrac();
		hrac1.setJmeno("Hrac Ondra");
		hrac1.setPocetZivotu(10);
		hrac1.zmenPocetZivotu(-3);
		hrac1.setSila(7);
		hrac1.setNaseVypisovadlo(new Vypisovadlo());
		hrac1.vypis();
		
		System.out.println();
		Hrac hrac2 = new Hrac();
		hrac2.setJmeno("Hrac Robert");
		hrac2.setPocetZivotu(20);
		hrac2.zmenPocetZivotu(-7);
		hrac2.setSila(9);
		hrac2.setNaseVypisovadlo(new ZnakoveVypisovadlo());
		hrac2.vypis();
		
		System.out.println();
		Mag mag1 = new Mag();
		mag1.setJmeno("Mag Petr");
		mag1.setPocetZivotu(2);
		mag1.setAktualniPocetZivotu(8);
		mag1.setSila(4);
		mag1.setNaseVypisovadlo(new ProcentualniVypisovadlo());
		mag1.setPocetMany(6);
		mag1.setAktualniPocetMany(12);
		mag1.vypis();
		

	}

}
