public class De421 {
    private int valeurFace;
    private final int NOMBRE_FACE = 6;

    public De421() {
        valeurFace = 1;
    }

    public int lireValeur() {
        return valeurFace;
    }

    public void lancer() {
        valeurFace = (int) (Math.random() * NOMBRE_FACE) + 1;
    }
}
