package eu.ase;

public class Main {

	public static void main(String[] args) throws Exception {
		PasagerVIP pv = new PasagerVIP("Jane", 1, 25, "112");
		PasagerVIP pv1 = new PasagerVIP("John", 2, 30, "122");

		PasagerEc pe = new PasagerEc("Mia", 11, 23, "225");
		PasagerEc pe1 = new PasagerEc("Mike", 13, 33, "325");

		System.out.println(pv.getIdRezervareAbs());
		System.out.println(pe.getIdRezervareAbs());

		System.out.println(pv.getNume());

		System.out.println("Clone:");
		PasagerEc pe2 = (PasagerEc) pe.clone();
		PasagerVIP pv2 = (PasagerVIP) pv.clone();

		System.out.println(pv.getIdRezervareAbs());
		System.out.println(pe.getIdRezervareAbs());

		System.out.println("==:");
		System.out.println(pe == pe1);
		System.out.println(pv == pv1);

		System.out.println("Equals");
		System.out.println(pe.equals(pe2));
		System.out.println(pv.equals(pv2));

		System.out.println("Folosire setNrCard: ");
		pe2.setNrCardEc("001");
		pv2.setNrCardVip("020");

		System.out.println(pv.getIdRezervareAbs());
		System.out.println(pe.getIdRezervareAbs());

		System.out.println(" equals si == dupa ce modific nr card:");
		System.out.println("==:");
		System.out.println(pe == pe1);
		System.out.println(pv == pv1);

		System.out.println("Equals");
		System.out.println(pe.equals(pe2));
		System.out.println(pv.equals(pv2));

		Pasager[][] avion = new Pasager[][] { { pv, pv1 }, { pv2, pe }, { pe1, pe2 } };

		Matrice matrice = new Matrice(2, 3, avion);
		System.out.println(matrice);

		System.out.println("-----------------");
		matrice.afisareMatrice();
		float a=matrice.afisareElementMinimMatrice();
		System.out.println(a);
		
		matrice.scriePasageri("C:\\Users\\Flori\\Desktop\\avion.txt");
		matrice.setContainer(null);
		
		matrice.incarcaPasageri("C:\\Users\\Flori\\Desktop\\avion.txt");
		matrice.afisareMatrice();
	}

}
