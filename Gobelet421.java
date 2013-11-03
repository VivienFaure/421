public class Gobelet421 {

    private De421[] des421;

    public Gobelet421() {
        des421 = new De421[3];
        des421[0] = new De421();
        des421[1] = new De421();
        des421[2] = new De421();
    }

    public void lancer() {
        for (De421 i : des421) {
            i.lancer();
        }
    }

    public boolean score421() {
            return
                (des421[0].lireValeur() == 4) && (des421[1].lireValeur() == 2) && (des421[2].lireValeur() == 1) ||
                (des421[0].lireValeur() == 4) && (des421[1].lireValeur() == 1) && (des421[2].lireValeur() == 2) ||
                (des421[0].lireValeur() == 1) && (des421[1].lireValeur() == 2) && (des421[2].lireValeur() == 4) ||
                (des421[0].lireValeur() == 1) && (des421[1].lireValeur() == 4) && (des421[2].lireValeur() == 2) ||
                (des421[0].lireValeur() == 2) && (des421[1].lireValeur() == 4) && (des421[2].lireValeur() == 1) ||
                (des421[0].lireValeur() == 2) && (des421[1].lireValeur() == 1) && (des421[2].lireValeur() == 4);
    }
}
