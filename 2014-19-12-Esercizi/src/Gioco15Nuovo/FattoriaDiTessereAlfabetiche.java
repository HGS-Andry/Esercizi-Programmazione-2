package Gioco15Nuovo;
import java.util.Random;

public class FattoriaDiTessereAlfabetiche implements FattoriaDiTessere {

	Random rand=new Random();
	
	public FattoriaDiTessereAlfabetiche() {}
	
	@Override
	public Tessera mkRandom() {
		String str="";
		String alf="abcdefghijklmnopqrstuvwz";
		for (int i = 0; i <= rand.nextInt(5)+1; i++)
			str+=alf.charAt(rand.nextInt(alf.length()));
		return new TesseraAlfabetica(str);
	}
}
