package eu.ase;

public class PasagerEc extends Pasager implements Cloneable {
	private String nrCardEc;

	public PasagerEc(String nume, float numarLoc, float varsta, String nrCardEc) throws Exception {
		super(nume, numarLoc, varsta);
		this.nrCardEc = nrCardEc;
		if (numarLoc < 0) {
			throw new Exception("Numarul nu poate fi negativ");
		}
	}

	@Override
	public String getIdRezervareAbs() {
		return getIdRezervare() + " " + nrCardEc;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PasagerEc other = (PasagerEc) obj;
		if (nrCardEc == null) {
			if (other.nrCardEc != null)
				return false;
		} else if (!nrCardEc.equals(other.nrCardEc))
			return false;
		return true;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getNrCardEc() {
		return nrCardEc;
	}

	public void setNrCardEc(String nrCardEc) {
		this.nrCardEc = nrCardEc;
	}

	@Override
	public String toString() {
		return "PasagerEc nrCardEc=" + nrCardEc + ", nume=" + getNume() + ", nr loc=" + getNrLoc()
				+ ", varsta=" + getVarsta() + ", id rezervare=" + getIdRezervare();
	}
	
	
}
