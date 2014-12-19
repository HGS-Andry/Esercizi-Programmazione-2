package Gioco15Nuovo;

/**
 * Tessera del gioco del 15 alfabetico
 * @author Andrea
 *
 */
public final class TesseraAlfabetica extends Tessera {
	
	private final String s;
	
	TesseraAlfabetica(String s) {
		this.s = s;
	}
	/**
	 * Ritorna 0 se this è uguale all'argomento, n>0 se this è maggiore dell'argomento, altrimenti n<0.
	 * Nel caso l'argomento non sia una TesseraAlfabetica lancia una {@link IllegalArgumentException}
	 */
	@Override
	public int compareTo(Tessera o) {
		if (o instanceof  TesseraAlfabetica)
			return s.compareTo(((TesseraAlfabetica)o).s);
		else
			throw new IllegalArgumentException();
	}

	@Override
	public boolean equals(Object other) {
		return other instanceof TesseraAlfabetica && s.equals(((TesseraAlfabetica)other).s);
	}

	@Override
	public String toString() {
		return s;
	}

}
