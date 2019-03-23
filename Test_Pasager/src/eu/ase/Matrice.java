package eu.ase;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class Matrice implements Comparable<Matrice>, Serializable {
	private int nrLinii;
	private int nrColoane;
	private Pasager[][] container;

	public Matrice() {
	}

	public Matrice(int nrLinii, int nrColoane, Object[][] container) {
		super();
		this.nrLinii = nrLinii;
		this.nrColoane = nrColoane;
		this.container = (Pasager[][]) container;
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
		this.container = (Pasager[][]) container;
	}
	
		public float afisareElementMinimMatrice() {
			float elementMinim = 0;
			for (int i = 0; i < container.length; i++) {
				for (int j = 0; j < container[i].length; j++) {
					if (container[i][j] != null) {
						elementMinim = (float) container[0][0].getVarsta();
						if ((int) container[i][j].getVarsta() < elementMinim) {
							elementMinim = (float) container[i][j].getVarsta();
						}
					}
				}
			}
			return elementMinim;
		}
		
		public void afisareMatrice() {
			for (int i = 0; i < container.length; i++) {
				for (int j = 0; j < container[i].length; j++) {
					System.out.println(container[i][j]);
				}
			}
		}

		@Override
		public int compareTo(Matrice m) {
			if (nrLinii == m.nrLinii) {
				return 0;
			} else if (nrLinii > m.nrLinii) {
				return 1;
			} else {
				return -1;
			}
		}
		
		// TODO tokenizer
		public void scriePasageri(String numeFisier) {
			try (FileOutputStream fos = new FileOutputStream(numeFisier);
					ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(this);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// TODO tokenizer
		public void incarcaPasageri(String numeFisier) {
			try (FileInputStream fis = new FileInputStream(numeFisier);
					ObjectInputStream ois = new ObjectInputStream(fis)) {
				Matrice matrice = (Matrice) ois.readObject();
				this.nrLinii = matrice.nrLinii;
				this.nrColoane = matrice.nrColoane;
				this.container = matrice.container;

			} catch (IOException | ClassNotFoundException  e) {
				e.printStackTrace();
			}
		}

}