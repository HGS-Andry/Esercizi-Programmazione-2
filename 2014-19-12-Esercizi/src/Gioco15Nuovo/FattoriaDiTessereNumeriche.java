package Gioco15Nuovo;
import java.util.Random;

public class FattoriaDiTessereNumeriche implements FattoriaDiTessere {

	private final int max;
	private final Random rand= new Random();
	
	public FattoriaDiTessereNumeriche(int max) {
		this.max=max;
	}
	
	/**
	 * Generea una tessaera con un numero a caso tra 1 e max compreso
	 */
	@Override
	public Tessera mkRandom() {
		return new TesseraNumerica(rand.nextInt(max)+1);
	}

}
