package plotter;

public class SequentialPlot extends Plot {
	private final int MAX_CHAR_LENGTH = 40;

	@Override
	public String toString() {
		
		//Array di caratteri disponibili e indici per muovermi al supo interno
		char[] caratteri={'*','@','$'};
		int currChar = 0;
		
		//Stringa finale
		String finale="";
		
		
		//Trovo la lunghezza massima e trovo il ratio per la lunghezza
		float maxLength = 0f;
		for (Sample sample : samples)
			maxLength=Math.max(maxLength, sample.getMax());
		int drawBarRatio=(int) (maxLength/MAX_CHAR_LENGTH);
		
		//passo tutti i sample
		for (int i = 0; i < samples.length; i++){
			
			//stampo il nome
			finale+=samples[i].getName()+":\n";
			
			//passo tutti i valori del sample
			for (int j = 0; j < samples[i].getSize(); j++) {
				finale+="| ";
				
				//stampo i caratteri
				for (int j2 = 0; j2 < samples[i].getValue(j)/drawBarRatio; j2++)
					finale+=caratteri[currChar];
				
				//stampo il valore
				finale+=" ("+samples[i].getValue(j)+")\n";
			}
			
			//ciclo tra i caratteri disponibili
			currChar++;
			currChar%=caratteri.length;
			
			//vado a capo per cambiare sample
			finale+="\n";
		}
		
		return finale;
	}

}
