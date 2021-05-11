package at.ac.fhcampuswien;

public class LichtSchalter extends Befehl {
    private Licht licht;
    private boolean lichtIstAn;

    public LichtSchalter(Licht licht) {
        this.licht = licht;
    }

    @Override
    public void fuehreAus() {
        if (lichtIstAn) {
            licht.lichtAus();
            lichtIstAn = false;
        } else {
            licht.lichtAn();
            lichtIstAn = true;
        }
    }
}
