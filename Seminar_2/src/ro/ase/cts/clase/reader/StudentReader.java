package ro.ase.cts.clase.reader;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader{

    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {

        Scanner fileScanner = new Scanner(new File(file));
        fileScanner.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (fileScanner.hasNext()) {
            Student student = new Student();
            super.readApplicant(fileScanner, student);
            student.setAnStudii(fileScanner.nextInt());
            student.setFacultate(fileScanner.next());
            studenti.add(student);
        }

        fileScanner.close();
        return studenti;
    }
}
