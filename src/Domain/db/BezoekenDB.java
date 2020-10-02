package Domain.db;

import Domain.model.Bezoek;

import java.util.ArrayList;

public class BezoekenDB {
    private ArrayList<Bezoek>bezoeken = new ArrayList<>();

    public BezoekenDB(){
    }

    public void addBezoek(Bezoek bezoek){
        bezoeken.add(bezoek);
    }
}
