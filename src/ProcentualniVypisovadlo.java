
public class ProcentualniVypisovadlo implements IVypisovadlo{

	@Override
	public String preved(int aktual, int max) {
		String text = ""+ ((double)aktual/max)*100.0;
		
		
		return text +"%";
	}

	@Override
	public String preved(int num) {
		String text = ""+num;
		
		return text;
	}

}
