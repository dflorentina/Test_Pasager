package eu.ase;

public class PasagerVIP extends Pasager {

	private String nrCardVip;

	public PasagerVIP(String nume, float numarLoc, float varsta, String nrCardVip) throws Exception {
		super(nume, numarLoc, varsta);
		this.nrCardVip = nrCardVip;
		if (numarLoc < 0) {
			throw new Exception("Numarul nu poate fi negativ");
		}
	}

	@Override
	public String getIdRezervareAbs() {
		return getIdRezervare() + " " + nrCardVip;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PasagerVIP other = (PasagerVIP) obj;
		if (nrCardVip == null) {
			if (other.nrCardVip != null)
				return false;
		} else if (!nrCardVip.equals(other.nrCardVip))
			return false;
		return true;
	}

	public String getNrCardVip() {
		return nrCardVip;
	}

	public void setNrCardVip(String nrCardVip) {
		this.nrCardVip = nrCardVip;
	}

}
