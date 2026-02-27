package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant{
	protected String facultate;
	protected int anStudii;

	public String getFacultate() {
		return this.facultate;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public int getAnStudii() {
		return this.anStudii;
	}

	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}

	public Student() {
		super();
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte,
				   String[] denumireProiect, String facultate, int anStudii) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumireProiect);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}

	@Override
	public String toString() {
		return "Student: Nume=" + super.nume + ", Prenume=" + super.prenume + ", Varsta=" + super.varsta +
				", Punctaj=" + super.punctaj + ", Nr_proiecte=" +
				super.nrProiecte +  ", DenumireProiect=" + Arrays.toString(super.denumireProiect) +
				"Facultate=" + this.facultate + ", An_studii=" + this.anStudii ;
	}

	@Override
	public int finantare(int suma) {
		if(super.statut()){
			System.out.println("Studentul " + super.getNume() + " " + super.getPrenume() +
					" primeste " + suma + " Euro/zi in proiect.");
			return suma;
		}

		return 0;
	}
}
