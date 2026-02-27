package ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	
	public int getClasa() {
		return this.clasa;
	}
	public void setClasa(int clasa) {
		this.clasa = clasa;
	}
	public String getTutore() {
		return this.tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	@Override
	public String toString() {
		return "Elev: Nume=" + super.nume + ", Prenume=" + super.prenume + ", Varsta="
				+ super.varsta + ", Punctaj=" + super.punctaj + ", Nr_proiecte=" + super.nrProiecte  + ", DenumireProiect="
				+ Arrays.toString(super.denumireProiect) + "Clasa=" + this.clasa + ", Tutore=" + this.tutore;
	}
	
	public Elev() {
		super();
	}

	@Override
	public int finantare(int suma) {
		if(super.statut()){
			System.out.println("Elevul " + super.getNume() + " " + super.getPrenume() +
					" primeste " + suma + " Euro/zi in proiect.");
			return suma;
		}

		return 0;
	}

	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}

}
