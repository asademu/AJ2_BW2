public class MCsparkonto {
    public static void main(String[] args) {
        double geld = 100.00, zinssatz = 0.42, betrag;
        Sparkonto konto1 = new Sparkonto(geld, zinssatz);

        System.out.print("Einzahlung: ");
        betrag = Tastatur.liesDouble();

        konto1.einzahlung(betrag);

    }
}
