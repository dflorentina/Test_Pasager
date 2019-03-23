package eu.ase;

import java.io.Serializable;

public abstract class Pasager implements Cloneable,Serializable {
	private String nume;
	private float numarLoc;
	private float varsta;
	private final int idRezervare = 0;

	public Pasager(String nume, float numarLoc, float varsta) {
		this.nume = nume;
		this.numarLoc = numarLoc;
		this.varsta = varsta;
	}

	public String getNume() {
		return nume;
	}

	public float getNrLoc() {
		return numarLoc;
	}

	public float getVarsta() {
		return varsta;
	}

	public int getIdRezervare() {
		return idRezervare;
	}

	public abstract String getIdRezervareAbs();
}
