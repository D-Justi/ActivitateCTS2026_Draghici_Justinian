package ro.ase.cts.main;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.reader.AngajatiReader;
import ro.ase.cts.clase.reader.AplicantReader;

import java.util.List;


public class Program {
    public static void main(String[] args){
        List<Aplicant> listaAngajati;
        System.out.println("DA");
        try{
            AplicantReader angajatReader = new AngajatiReader("./angajati.txt");
            listaAngajati = angajatReader.readAplicanti();

            Angajat.setValoareFinantareAngajat(50);
            for(Aplicant angajat : listaAngajati){
                System.out.println(angajat.toString());

                angajat.afiseazaFinantare();
                angajat.afiseazaStatut();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}