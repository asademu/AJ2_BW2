public class MCkunde {
    public static void menu() {
        System.out.println("1: Dateneingabe");
        System.out.println("2: Datenausgabe");
        System.out.println("0: Beenden");
        int wahl = Tastatur.liesInt();
        switch (wahl) {
            case 1:

        }
    }

    public static void main(String[] args) {
        Kunde kunde1 = new Kunde("Stefan", "Daarius", "MGL");
        Kunde kunde2 = new Kunde("Luessem", "Jan", "Brandenburg");
        Kunde kunde3 = new Kunde("Hasse", "Julian", "Berlin");

        int wahl = 0;

        System.out.println("Kunde auswaehlen: 1-3");
        System.out.println("Beenden: 0");
        wahl = Tastatur.liesInt();

        switch (wahl) {
            case 1:

        }
    }
}
