public class Case {

    private int colonne;
    private int ligne;

    private Piece pPiece;

    /**
     * Constructeur Case
     * Auteur : @malo2b
     * @param numeroCase
     */
    Case (int numeroCase) {
        pPiece = null;
        colonne = numeroCase % 8;
        ligne = numeroCase / 8;
    }

    /**
     * Retourne l'identifiant de la case sous forme
     * colonne ligne (a1)
     * Auteur : @malo2b
     */
    @Override
    public String toString() {
        char identifiantColonne = (char)colonne;
        identifiantColonne += 'A';
        return String.format("%c%d", identifiantColonne, this.ligne);
    }

}
