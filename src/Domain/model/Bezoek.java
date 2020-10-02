package Domain.model;

import java.time.LocalDate;

public class Bezoek {
    private String naam, rijksregister;
    private int beginuur, telefoonnummer;
    private LocalDate datum;

    public Bezoek(String naam, String rijksregister, int beginuur, int telefoonnummer, LocalDate datum){
        if(naam != null && rijksregister != null && beginuur >= 0 && beginuur <= 23 && datum != null){
            setBeginuur(beginuur);
            setDatum(datum);
            setRijksregister(rijksregister);
            setNaam(naam);
            setTelefoonnummer(telefoonnummer);
        }
    }

    public void setBeginuur(int beginuur) {
        this.beginuur = beginuur;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setRijksregister(String rijksregister) {
        this.rijksregister = rijksregister;
    }

    public void setTelefoonnummer(int telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }
}
