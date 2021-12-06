import java.util.ArrayList;

public class Roi extends Piece {

    protected Roi(int couleur, String positionCourante) {
        super(99, couleur, positionCourante);
    }

    @Override
    protected ArrayList<String> calculerDeplacementsPossiblesTheoriques() {
        ArrayList<String> deplacements = new ArrayList<String>(); // 5 déplacements au maximum pour un pion
        return deplacements;
    }

}
