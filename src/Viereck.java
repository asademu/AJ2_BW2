public class Viereck {
    private double breite, hoehe;

    public Viereck(double a, double b) {
        if (a > 0 && b > 0) {
            breite = a;
            hoehe = b;
        }
    }

    public double flaechenberechnung(double u_breite, double u_hoehe) {
        double u_flaeche = u_breite * u_hoehe;
        return u_flaeche;
    }

    public void ergebnisausgabe(double u_flaeche) {
        if (u_flaeche > 0) {
            System.out.println("Flaeche: " + u_flaeche);
        }
    }
}
