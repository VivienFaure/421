public class Jeu421 {

    private Joueur421[] joueurs421;
    private Gobelet421 gobelet421;

    public Jeu421() {
        gobelet421 = new Gobelet421();
        joueurs421 = new Joueur421[3];
        joueurs421[0] = new Joueur421("Vivien");
        joueurs421[1] = new Joueur421("Lousion");
        joueurs421[2] = new Joueur421("Mathias");
    }

    public void jouerUnePartie() {

        while (pasDeGagnant()) {
            jouerUnTour();
        }
        afficheResult();
    }

    private void jouerUnTour() {
        for (Joueur421 j : joueurs421)
            j.jouerUnTour(gobelet421);
    }

    private boolean pasDeGagnant() {
        boolean pasDeGagnant = true;

        for (Joueur421 j : joueurs421) {
            if (j.asTuGagne()) {
                return false;
            }
        }
        return pasDeGagnant;
    }

    private void afficheResult() {
        for (Joueur421 j : joueurs421) {
            if (j.asTuGagne()) {
                System.out.println(j.getNom() + " remporte la victoire");
            }
        }
    }
}
