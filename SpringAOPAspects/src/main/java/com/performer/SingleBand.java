package com.performer;

import com.instruments.Instrument;

public class SingleBand implements Performer {
	  Instrument instrument;
	@Override
	public void perform() {
		// TODO Auto-generated method stub
    instrument.play();
      
	}
	public Instrument getInstrument() {
		return instrument;
	}
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	@Override
	public String toString() {
		return "SingleBand [instrument=" + instrument + "]";
	}

}
