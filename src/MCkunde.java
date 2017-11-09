public class MCkunde {
        public static void main(String[] args) {
        Kunde kunde1 = new Kunde("Hinterseer", "Hansi", "Kitzbuehel");
        Kunde kunde2 = new Kunde("Voeller", "Rudi", "Hanau");
        Kunde kunde3 = new Kunde("van Gaal", "Louis", "Amsterdam");
        Kunde auswahl = kunde1;

        boolean x;
        int wahl1, wahl2;

        do {
            x = false;
            System.out.println("Kunde auswaehlen: 1-3");
            System.out.println("Beenden: 0");
            wahl1 = Tastatur.liesInt();

            switch (wahl1){
                case 1:
                    auswahl = kunde1;
                    x = true;
                    break;
                case 2:
                    auswahl = kunde2;
                    x = true;
                    break;
                case 3:
                    auswahl = kunde3;
                    x = true;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Fehleingabe!");
                    break;
            }

            if (x) {
                do {
                    System.out.println("1: Dateneingabe");
                    System.out.println("2: Datenausgabe");
                    System.out.println("0: Zurueck");
                    wahl2 = Tastatur.liesInt();

                    switch (wahl2) {
                        case 1:
                            auswahl.datenEingabe();
                            break;
                        case 2:
                            auswahl.datenAusgabe();
                            break;
                        default:
                            System.out.println("Fehleingabe!");
                            break;
                        case 0:
                            break;
                    }
                }while (wahl2 != 0);
            }
        }while (wahl1 != 0);

            /*
            does this work?
            switch (wahl1) {
                case 1:
                    do {
                        System.out.println("1: Dateneingabe");
                        System.out.println("2: Datenausgabe");
                        System.out.println("0: Zurueck");
                        wahl2 = Tastatur.liesInt();
                        switch (wahl2) {
                            case 1:
                                kunde1.datenEingabe();
                                break;
                            case 2:
                                kunde1.datenAusgabe();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Fehleingabe");
                                break;
                        }
                        break;
                    }while (wahl2 != 0);
                    break;
                case 2:
                    do {
                        System.out.println("1: Dateneingabe");
                        System.out.println("2: Datenausgabe");
                        System.out.println("0: Zurueck");
                        wahl2 = Tastatur.liesInt();
                        switch (wahl2) {
                            case 1:
                                kunde2.datenEingabe();
                                break;
                            case 2:
                                kunde2.datenAusgabe();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Fehleingabe");
                                break;
                        }
                        break;
                    }while (wahl2 != 0);
                    break;
                case 3:
                    do {
                        System.out.println("1: Dateneingabe");
                        System.out.println("2: Datenausgabe");
                        System.out.println("0: Zurueck");
                        wahl2 = Tastatur.liesInt();
                        switch (wahl2) {
                            case 1:
                                kunde3.datenEingabe();
                                break;
                            case 2:
                                kunde3.datenAusgabe();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Fehleingabe");
                                break;
                        }
                        break;
                    }while (wahl2 != 0);
                    break;
            }*/
    }
}
