
class Cuillere extends Ustensile {
    private double longueur;


    public Cuillere(int anneeFabrication, double longueur) {
        super(anneeFabrication);
        this.longueur = longueur;
    }


    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    @Override
    public double calculerValeur(int anneeActuelle) {
        if (anneeActuelle - getAnneeFabrication() < 50) {
            return 0;
        }
        return (anneeActuelle - getAnneeFabrication() - 50);
    }
}
