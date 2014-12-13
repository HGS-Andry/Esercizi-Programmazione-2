package plotter;

public class Sample {
	private final String name;
	private final float[] values;
	
	public Sample(String name, float[] values) {
		this.name = name;
		this.values = values;
		for (float f : values) 
			if(f<0)
				throw new IllegalArgumentException();
	}
	
	public String getName() {
		return name;
	}
	
	public int getSize() {
		return values.length;
	}
	
	public float getMax() { 
		float max = 0f;
		for (float f : values)
			if (f>max) 
				max=f;
		return max;
	}
	
	public float getValue(int pos) {
		return values[pos]; 
	}

	public boolean equals(Object other){
		
		//Controllo che sia un oggetto di tipo Sample
		if(other instanceof Sample){
			Sample altro=(Sample) other;
			
			//Controllo che il nome e la lunghezza siano uguali
			if(!name.equals(altro.getName())||values.length!=altro.getSize())
				return false;
			
			//itero su values e controllo una a una che siano uguali
			for (int i = 0; i < values.length; i++)												
				if(values[i]!=altro.getValue(i))
					return false;
			
			//Se non ci sono differenze vuol dire che è uguale
			return true;
		}
		else
			return false;
	}
}
