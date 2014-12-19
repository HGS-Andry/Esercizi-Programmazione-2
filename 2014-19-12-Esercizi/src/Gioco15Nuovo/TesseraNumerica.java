package Gioco15Nuovo;

/**
 * Tessera del gioco del 15 numerico
 * @author Andrea
 *
 */
public final class TesseraNumerica extends Tessera {

	private final int num;
	
	TesseraNumerica(int num){
		this.num=num;
	}

	@Override
	public int compareTo(Tessera arg0) {
		if (arg0 instanceof  TesseraNumerica) {
			
		}
		else
			throw new IllegalArgumentException();
	}


	@Override
	public boolean equals(Object other) {
		return other instanceof TesseraNumerica && this.num==((TesseraNumerica)other).num;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
