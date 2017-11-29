public class Sparkonto {
    private double geldbetrag, zinssatz;

    public Sparkonto(){
        geldbetrag = 0;
        zinssatz = 0;
    }

    public Sparkonto(double u_geld, double u_zins){
        geldbetrag = u_geld;
        zinssatz = u_zins;
    }

    public void setGeldbetrag(double u_geldbetrag) {
        geldbetrag = u_geldbetrag;
    }

    public void setZinssatz(double u_zinssatz){

        zinssatz = u_zinssatz;
    }

    public double getGeldbetrag() {
        return geldbetrag;
    }

    public double getZinssatz() {
        return zinssatz;
    }

    public void einzahlung(double u_geld){
        if (u_geld > 0){
            setGeldbetrag(getGeldbetrag() + u_geld);
        }
    }

    public void auszahlung(double u_geld){
        if (getGeldbetrag() >= u_geld && u_geld >= 0) {
            setGeldbetrag(getGeldbetrag() - u_geld);
        }
        else {
            System.out.println("Fehleingabe!");
        }
    }

    public void verzinsung(){
        double u_geld = getGeldbetrag() + getGeldbetrag() * getZinssatz() / 100;
        setGeldbetrag(u_geld);
    }

    public void zinsaenderung(double u_zinssatz){
        if (u_zinssatz > 0){
            setZinssatz(u_zinssatz);
        }
    }

    public void ausgabe(){
        System.out.printf("Kontostand: %.2f Euro", getGeldbetrag());
    }
}
