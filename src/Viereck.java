public class Viereck {
    private double breite, hoehe;

    public Viereck(double a, double b) {
        if (a > 0 && b > 0) {
            breite = a;
            hoehe = b;
        }
    }

    public void setBreite(double breite) {
        System.out.print("Breite: ");
        this.breite = breite;
    }

    public void setHoehe(double hoehe) {
        System.out.print("Hoehe: ");
        this.hoehe = hoehe;
    }

    public double getBreite() {
        return breite;
    }

    public double getHoehe() {
        return hoehe;
    }

    public double flaechenberechnung() {
        double u_flaeche = getBreite() * getHoehe();
        return u_flaeche;
    }

    public void ergebnisausgabe(double u_flaeche) {
        if (u_flaeche > 0) {
            System.out.println("Flaeche: " + u_flaeche);
        }
    }
}
