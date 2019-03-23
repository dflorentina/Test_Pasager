package eu.ase;

import java.util.Arrays;

public class Matrice {
	private int nrLinii;
	private int nrColoane;
	private Object[][] container;

	public Matrice() {

	}

	public Matrice(int nrLinii, int nrColoane, Object[][] container) {
		super();
		this.nrLinii = nrLinii;
		this.nrColoane = nrColoane;
		this.container = container;
	}

	public int getNrLinii() {
		return nrLinii;
	}

	public void setNrLinii(int nrLinii) {
		this.nrLinii = nrLinii;
	}

	public int getNrColoane() {
		return nrColoane;
	}

	public void setNrColoane(int nrColoane) {
		this.nrColoane = nrColoane;
	}

	public Object[][] getContainer() {
		return container;
	}

	public void setContainer(Object[][] container) {
		this.container = container;
	}

	// TODO dupa ce criteriu cautam elementul minim
	public int afisareElementMinimMatrice() {
		int elementMinim = 0;
		for (int i = 0; i < container.length; i++) {
			for (int j = 0; j < container[i].length; j++) {
				if (container[i][j] != null) {
					elementMinim = (int) container[0][0];
					if ((int) container[i][j] < elementMinim) {
						elementMinim = (int) container[i][j];
					}
				}
			}
		}
		return elementMinim;
	}

	public void afiseazaMatrice() {
		for (int i = 0; i < container.length; i++) {
			for (int j = 0; j < container[i].length; j++) {
				System.out.println(container[i][j]);
			}
		}
	}

	@Override
	public String toString() {
		return "Matrice nrLinii=" + nrLinii + ", nrColoane=" + nrColoane;
	}

}
