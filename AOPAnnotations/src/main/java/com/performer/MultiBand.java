package com.performer;

import java.util.ArrayList;

import com.instruments.Instrument;

public class MultiBand implements Performer{
	ArrayList<Instrument> al;
	
	public ArrayList<Instrument> getAl() {
		return al;
	}

	public void setAl(ArrayList<Instrument> al) {
		this.al = al;
	}

	@Override
	public String toString() {
		return "MultiBand [al=" + al + "]";
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		
		for(Instrument in:al)
		{
			in.play();
		}
	}

}
