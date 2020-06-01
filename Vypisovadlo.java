public class Vypisovadlo implements IVypisovadlo {

	@Override
	public String preved(int aktual, int max) {
		String text = ""+aktual+"/"+max;
		
		return text;
	}

	@Override
	public String preved(int num) {
		String text = ""+num;
		
		return text;
	}

}
