package ro.ase.cts.clase.reader;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PupilReader extends AplicantReader{
    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {

        Scanner fileScanner = new Scanner(new File(file));
        fileScanner.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (fileScanner.hasNext()) {
            Elev elev = new Elev();
            super.readApplicant(fileScanner, elev);
            elev.setClasa(fileScanner.nextInt());
            elev.setTutore(fileScanner.next());
            elevi.add(elev);
        }

        fileScanner.close();
        return elevi;
    }
}
