package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	
	public String getOcupatie() {
		return this.ocupatie;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public int getSalariu() {
		return this.salariu;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	public Angajat(String nume, String prenume, int varsta, int punctaj,
				   int nr_proiecte, String[] denumire_Proiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumire_Proiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}

	public Angajat() {
		super();
	}

	@Override
	public int finantare(int suma) {
		if(super.statut()){
			System.out.println("Angajatul " + super.getNume() + " " + super.getPrenume() +
					" primeste " + suma + " Euro/zi in proiect.");
			return suma;
		}

		return 0;
	}

	@Override
	public String toString() {
		return "Angajat: Nume=" + super.nume + ", Prenume=" + super.prenume
				+ ", Varsta=" + super.varsta + ", Punctaj=" + super.punctaj +
				", Nr_proiecte=" + super.nrProiecte + ", DenumireProiect="
				+ Arrays.toString(super.denumireProiect) + "Ocupatie=" + this.ocupatie + ", salariu=" + this.salariu;
	}

}
