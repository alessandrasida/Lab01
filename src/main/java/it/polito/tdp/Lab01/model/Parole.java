package it.polito.tdp.Lab01.model;

import java.util.List;
import java.util.*;

public class Parole {
		
	List<String> parole;
	
	public Parole() {
		parole = new LinkedList<String>();
	}
	
	public void addParola(String p) {
		parole.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(parole);
		return parole;
	}
	
	public void reset() {
		parole.removeAll(parole); 
	}
	
	public void cancellaUltima( String s) {
		parole.remove(s);
		
	}
}