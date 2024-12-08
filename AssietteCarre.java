
class AssietteCarree extends Assiette {
    private double cote;


    public AssietteCarree(int anneeFabrication, double cote) {
        super(anneeFabrication);
        this.cote = cote;
    }


    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }


    @Override
    public double calculerValeur(int anneeActuelle) {
        if (anneeActuelle - getAnneeFabrication() < 50) {
            return 0;
        }
        return 5 * (anneeActuelle - getAnneeFabrication() - 50);
    }


    @Override
    public double calculerSurface() {
        return cote * cote;
    }
}
