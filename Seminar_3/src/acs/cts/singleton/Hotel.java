package acs.cts.singleton;

public class Hotel{
    private String numeHotel;
    private int nrCamere;
    private int nrCamereOcupate;
    private static Hotel instance = null;

    private Hotel(String numeHotel, int nrCamere, int nrCamereOcupate) {
        this.numeHotel = numeHotel;
        this.nrCamere = nrCamere;
        this.nrCamereOcupate = nrCamereOcupate;
    }

    public static Hotel getInstance(String numeHotelint, int nrCamere, int nrCamereOcupate){
        if(instance == null){
            instance = new Hotel(numeHotelint, nrCamere, nrCamereOcupate);
        }
        return instance;
    }

    public void rezervareCamera(){
        if(this.nrCamereOcupate<this.nrCamere){
            System.out.println("Rezervare realizata");
            nrCamereOcupate++;
        }
        else{
            System.out.println("Nu mai exista camere disponibile");
        }
    }
    public void afisareDetaliiHotel(){
        StringBuilder builder = new StringBuilder();
        builder.append("Hotel: ").append(this.numeHotel);
        builder.append("\nNr camere: ").append(this.nrCamere);
        builder.append("\nNr camere ocupate: ").append(this.nrCamereOcupate);
        System.out.println(builder.toString());
    }
}