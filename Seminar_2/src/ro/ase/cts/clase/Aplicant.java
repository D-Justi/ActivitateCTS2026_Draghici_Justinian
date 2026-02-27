package ro.ase.cts.clase;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumireProiect;

	public Aplicant() {
		super();
	}

	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nrProiecte;
		this.denumireProiect = denumireProiect;
	}

	public String getNume() {
		return this.nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return this.prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return this.varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public int getPunctaj() {
		return this.punctaj;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public int getNrProiecte() {
		return this.nrProiecte;
	}

	public void setNrProiecte(int nrProiecte) {
		this.nrProiecte = nrProiecte;
	}

	public String[] getDenumireProiect() {
		return this.denumireProiect;
	}

	public void setDenumireProiect(String[] denumireProiect) {
		this.denumireProiect = denumireProiect;
	}

	public boolean statut(){
		if(this.punctaj > 80) {
			System.out.println("Aplicantul " + this.nume + " " + this.prenume + " a fost acceptat.");
			return true;
		}

		System.out.println("Aplicantul " + this.nume + " " + this.prenume + " nu a fost acceptat.");
		return false;
	}

	public abstract int finantare(int suma);
}
