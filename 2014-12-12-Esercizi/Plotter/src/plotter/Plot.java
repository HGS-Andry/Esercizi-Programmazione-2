package plotter;

import java.util.Arrays;

public abstract class Plot {
	protected Sample[] samples;
	
	protected Plot() {
		samples=new Sample[0];
	}

	public final void add(Sample sample) throws DuplicatedSampleException, InconsistentSampleSizeException{
		
		//Controllo che la sample non sia già stata inserita
		for (Sample samp : samples)
			if(samp.equals(sample))
				throw new DuplicatedSampleException();
		
		//Controllo che la lunghezza sia uguale agli altri
		if(samples.length>0)
			if(sample.getSize()!=samples[0].getSize())
				throw new InconsistentSampleSizeException();
		
		samples=Arrays.copyOf(samples, samples.length+1);
		samples[samples.length-1]=sample;

		
	}
	
	public final void add(Plot plot) throws DuplicatedSampleException, InconsistentSampleSizeException{
		for (Sample sample : plot.samples)
			this.add(sample);
	}
	
	public final float getMax() {
		//il massimo valore fra tutte le sample
		float max = 0f;
		for (Sample sample: samples)
			max = Math.max(max, sample.getMax());
		return max;
	}
	
	public final boolean equals(Object other){
		//Controllo che sia un oggetto di tipo Plot
		if(other instanceof Plot){
			Plot altro=(Plot) other;
			
			//Controllo che il numero dei samples siano uguarli
			if(samples.length!=altro.samples.length)
				return false;
			
			//itero su samples e controllo che ogni sample sia uguale uno a uno
			for (int i = 0; i < samples.length; i++)												
				if(!samples[i].equals(altro.samples[i]))
					return false;
			
			//Se non ci sono differenze vuol dire che è uguale
			return true;
		}
		else
			return false;
	}
	
	protected final Sample[] getSamples() {
		return samples;
	}
	
	public abstract String toString();
}
