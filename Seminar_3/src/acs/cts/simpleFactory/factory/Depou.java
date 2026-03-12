package acs.cts.simpleFactory.factory;

import acs.cts.simpleFactory.clase.Autobuz;
import acs.cts.simpleFactory.clase.Tramvai;
import acs.cts.simpleFactory.clase.MijlocTransport;

import static acs.cts.simpleFactory.factory.Tipuri.Troleibuz;

public class Depou {

    public MijlocTransport getMijlocTransport(Tipuri tip, int nrRoti, String nrInmatriculare){

        switch(tip){
            case Autobuz:
                return new Autobuz(nrRoti, nrInmatriculare);

            case Tramvai:
                return new Tramvai(nrRoti, nrInmatriculare);

            case Troleibuz:
                //return new Troleibuz(nrRoti, nrInmatriculare);

            default:
                return null;
        }
    }
}