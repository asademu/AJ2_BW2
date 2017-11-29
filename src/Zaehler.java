public class Zaehler {
    private int zaehlerstand;

    public Zaehler() {
        zaehlerstand = 0;
    }

    public Zaehler(int zahl) {
        if (zahl > 0) {
            zaehlerstand = zahl;
        }
    }

    public void setZaehlerstand(int zahl) {
        if (zahl > 0) {
            zaehlerstand = zahl;
        }
    }

    public int getZaehlerstand() {
        return zaehlerstand;
    }

    public void erhoeheZaehler(int plusZahl) {
        plusZahl += getZaehlerstand();
        setZaehlerstand(plusZahl);
    }

    public void verringereZaehler(int minusZahl) {
        minusZahl = getZaehlerstand() - minusZahl;
        setZaehlerstand(minusZahl);
    }
}
