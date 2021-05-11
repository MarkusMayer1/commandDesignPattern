package at.ac.fhcampuswien;

import java.util.ArrayList;
import java.util.List;

public class Fernbedienung {
    private List<Befehl> history;

    public Fernbedienung() {
        this.history = new ArrayList<>();
    }

    public void knopfDruecken(Befehl befehl) {
        history.add(befehl);
        befehl.fuehreAus();
    }
}
