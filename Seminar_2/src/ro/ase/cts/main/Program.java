package ro.ase.cts.main;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.reader.AngajatReader;
import ro.ase.cts.clase.reader.AplicantReader;

public class Program {

	public static void main(String[] args) {
		AplicantReader aplicantReader= new AngajatReader();
		try {
			List<Aplicant> listaAngajati = aplicantReader.readAplicanti("angajati.txt");

			for(Aplicant angajat:listaAngajati) {
				System.out.println(angajat.toString());
				angajat.finantare(200);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
