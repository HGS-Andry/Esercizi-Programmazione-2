package Gioco15Nuovo;

import java.util.ArrayList;
import java.util.Random;

public class Gioco {
	
	private final Tessera[][] tessere;
	
	public Gioco(FattoriaDiTessere fattoria, int width, int height) {
		tessere= new Tessera[width][height];
		Random rand= new Random();
		ArrayList<Tessera>giaGenerate = new ArrayList<>();
		//TODO
	}
	
	@Override
	public String toString() {
		//TODO
		return null;
	}
	public boolean risolto() {
		//TODO
		return false;
	}

}
