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

	/**
	 * Ritorna 0 se this è uguale all'argomento, n>0 se this è maggiore dell'argomento, altrimenti n<0.
	 * Nel caso l'argomento non sia una TesseraNumerica lancia una {@link IllegalArgumentException}
	 */
	@Override
	public int compareTo(Tessera arg0) {
		if (arg0 instanceof  TesseraNumerica)
			return this.num-((TesseraNumerica)arg0).num;
		else
			throw new IllegalArgumentException();
	}

	/**
	 * Ritorna true se this è uguale all'argomento, altrimenti false.
	 */
	@Override
	public boolean equals(Object other) {
		return other instanceof TesseraNumerica && this.num==((TesseraNumerica)other).num;
	}


	@Override
	public String toString() {
		return String.valueOf(num);
	}

}
