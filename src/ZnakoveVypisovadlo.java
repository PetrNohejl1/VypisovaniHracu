
public class ZnakoveVypisovadlo implements IVypisovadlo {

	@Override
	public String preved(int aktual, int max) {
		String text = "";
		for (int i=0; i<aktual; i++) {
			text = text + "*";
		}
		text = text + "/";
		for (int i=0; i<max; i++) {
			text = text + "o";
		}
		
		
		return text;
	}

	@Override
	public String preved(int num) {
		String text = "";
		for (int i=0; i<num; i++) {
			text = text + "x";
		}
		
		return text;
	}

}
