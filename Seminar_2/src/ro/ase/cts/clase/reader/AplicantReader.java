package ro.ase.cts.clase.reader;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {
    public abstract List<Aplicant> readAplicanti(String file) throws FileNotFoundException;
    protected void readApplicant(Scanner fileScanner, Aplicant outAplicant){

        String nume = fileScanner.next();
        String prenume = fileScanner.next();
        int varsta = fileScanner.nextInt();
        int punctaj = fileScanner.nextInt();
        int nrProiecte = fileScanner.nextInt();
        String[] denumireProiect = new String[nrProiecte];

        for (int i = 0; i < nrProiecte; i++) {
            denumireProiect[i] = fileScanner.next();
        }

        outAplicant.setNume(nume);
        outAplicant.setPrenume(prenume);
        outAplicant.setVarsta(varsta);
        outAplicant.setPunctaj(punctaj);
        outAplicant.setNrProiecte(nrProiecte);
        outAplicant.setDenumireProiect(denumireProiect);
    }
}


