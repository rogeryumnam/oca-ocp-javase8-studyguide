package com.jashepherd.studies.java.ocajavase8studyguide.ch04.e19_encapsulating_data;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Encapsulating Data<br>
 * pages 205-206
 */
public class Swan {
	private int numberEggs;  // private

	public int getNumberEggs() {  // getter
		return numberEggs;
	}
	public void setNumberEggs(int numberEggs) {  // setter
		if (numberEggs >= 0)  // guard condition
			this.numberEggs = numberEggs;
	}

	// which lines follow JavaBeans naming convention
	private boolean playing;
	private String name;
	public boolean getPlaying() { return playing; }  // should be isPlaying()
	public boolean isPlaying() { return playing; }
	public String name() { return name; }            // should be getName()
	public void updateName(String n) { name = n; }   // should be setName()
	public void setname(String n) { name = n; }      // should be setName() - not capitalized correctly
}
