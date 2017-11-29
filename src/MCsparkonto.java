import javafx.beans.binding.ObjectExpression;

public class MCsparkonto {
    public static void main(String[] args) {
        boolean x;
        int kundenwahl, wahl;
        double geld = 0, zinssatz = 0;
        Sparkonto SparkontoMueller = new Sparkonto();
        Sparkonto SparkontoSchmidt = new Sparkonto();
        Sparkonto ObjectToChange = SparkontoMueller;

        do {
            System.out.println("\nSparkonto auswaehlen");
            System.out.println("1 - Mueller");
            System.out.println("2 - Schmidt");
            System.out.println("0 - Beenden");
            kundenwahl = Tastatur.liesInt();

            do {
                x = false;
                switch (kundenwahl) {
                    case 1:
                        ObjectToChange = SparkontoMueller;
                        break;
                    case 2:
                        ObjectToChange = SparkontoSchmidt;
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Fehleingabe");
                        x = true;
                }
            } while (x);

            if (kundenwahl != 0) {
                do {
                    System.out.println("\n1 - Einzahlen");
                    System.out.println("2 - Auszahlen");
                    System.out.println("3 - Verzinsen");
                    System.out.println("4 - Zinsaenderung");
                    System.out.println("5 - Kontostand");
                    System.out.println("0 - Zurueck");
                    wahl = Tastatur.liesInt();

                    switch (wahl) {
                        //
                        case 1:
                            System.out.print("Betrag: ");
                            ObjectToChange.einzahlung(Tastatur.liesDouble());
                            break;
                        case 2:
                            System.out.print("Betrag: ");
                            ObjectToChange.auszahlung(Tastatur.liesDouble());
                            break;
                        case 3:
                            ObjectToChange.verzinsung();
                            break;
                        case 4:
                            System.out.print("Neuer Zinssatz in Prozent: ");
                            ObjectToChange.zinsaenderung(Tastatur.liesDouble());
                            break;
                        case 5:
                            ObjectToChange.ausgabe();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Fehleingabe");
                    }
                }while (wahl != 0);

                System.out.println(SparkontoMueller.getGeldbetrag());
            }
        }while (kundenwahl != 0);
    }
}
