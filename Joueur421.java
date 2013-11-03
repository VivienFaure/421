public class Joueur421 {

    private int score;
    private String nom;

    public Joueur421(String nomJoueur) {
        score = 0;
        nom = nomJoueur;
    }

    public void jouerUnTour(Gobelet421 gobelet421) {
        gobelet421.lancer();
        if (gobelet421.score421()) {
            score = score + 1;
        }
    }

    public String getNom() {
        return nom;
    }

    public boolean asTuGagne() {
        return (score == 5);
    }
}
