import java.util.ArrayList;

public abstract class Piece {

    /** Couleur : 0 - Blanc | 1 - Noir */
    protected int couleur;
    /** Nombre de points de la piece */
    protected int points;
    /** Position courante */
    protected String positionCourante;

    /**
     * Auteur : @malo2b
     * Constructeur de piece
     * @param points
     * @param couleur
     */
    protected Piece(int points, int couleur, String positionCourante) {
        this.points = points;
        this.couleur = couleur;
    }

    protected abstract ArrayList<String> calculerDeplacementsPossiblesTheoriques();

}