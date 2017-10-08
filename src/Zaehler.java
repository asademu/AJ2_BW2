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
        zaehlerstand += plusZahl;
        setZaehlerstand(zaehlerstand);
    }

    public void verringereZaehler(int minusZahl) {
        zaehlerstand -= minusZahl;
        setZaehlerstand(zaehlerstand);
    }

    public static void main(String[] args) {
        Zaehler vogelZaehler = new Zaehler();
        Zaehler personenZaehler = new Zaehler(15);
        int z = 0, anzahl = 0;

        System.out.println("1. Voegel");
        System.out.println("2. Personen");
        int wahl = Tastatur.liesInt();

        do {
            switch (wahl) {
                case 1:
                    System.out.println("Anzahl der Voegel");
                    System.out.println("===================");
                    System.out.println("1. Erhoehen");
                    System.out.println("2. Verringern");
                    System.out.println("3. Setzen");
                    System.out.println("4. Ausgeben");
                    System.out.println("0. Beenden");

                    wahl = Tastatur.liesInt();

                    switch (wahl) {
                        case 1:
                            z = Tastatur.liesInt();
                            vogelZaehler.erhoeheZaehler(z);
                            break;
                        case 2:
                            z = Tastatur.liesInt();
                            vogelZaehler.verringereZaehler(z);
                            break;
                        case 3:
                            z = Tastatur.liesInt();
                            vogelZaehler.setZaehlerstand(z);
                            break;
                        case 4:
                            anzahl = vogelZaehler.getZaehlerstand();
                            System.out.println(anzahl);
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Fehleingabe");
                    }
                    break;
                case 2:
                    System.out.println("Anzahl der Personen");
                    System.out.println("===================");
                    System.out.println("1. erhoehen");
                    System.out.println("2. verringern");
                    System.out.println("3. setzen");
                    System.out.println("4. ausgeben");
                    System.out.println("0. Beenden");

                    wahl = Tastatur.liesInt();

                    switch (wahl) {
                        case 1:


                            personenZaehler.erhoeheZaehler(z);
                            break;
                        case 2:
                            personenZaehler.verringereZaehler(z);
                            break;
                        case 3:
                            personenZaehler.setZaehlerstand(z);
                            break;
                        case 4:
                            personenZaehler.getZaehlerstand();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Fehleingabe");
                    }
                    break;
            }
        }while (wahl != 0);
    }
}
