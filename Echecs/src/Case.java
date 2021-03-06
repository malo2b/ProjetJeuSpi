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
        ligne = numeroCase % 8;
        colonne = numeroCase / 8;
    }

    /**
     * Setter Piece
     * Auteur : @malo2b
     * @param piece
     */
    public void positionnerPiece(Piece piece) {
        pPiece = piece;
    }

    /**
     * Retourne l'identifiant de la case sous forme
     * colonne ligne (A1)
     * Auteur : @malo2b
     */
    @Override
    public String toString() {
        char identifiantColonne = (char)colonne;
        identifiantColonne += 'A';
        return String.format("%c%d", identifiantColonne, this.ligne + 1);
    }

}
