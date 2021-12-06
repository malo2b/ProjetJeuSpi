import java.util.ArrayList;

public class Cavalier extends Piece {

    protected Cavalier(int couleur, String positionCourante) {
        super(3, couleur, positionCourante);
    }

    @Override
    protected ArrayList<String> calculerDeplacementsPossiblesTheoriques() {
        ArrayList<String> deplacements = new ArrayList<String>(); // 5 déplacements au maximum pour un pion
        return deplacements;
    }

}
