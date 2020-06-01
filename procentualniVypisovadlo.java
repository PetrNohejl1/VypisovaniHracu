public class ProcentualniVypisovadlo implements IVypisovadlo{

	@Override
	public String preved(int aktual, int max) {
		String text = ""+ (aktual/max)*100;
		
		
		return text +"%";
	}

	@Override
	public String preved(int num) {
		String text = ""+num;
		
		return text;
	}

}
