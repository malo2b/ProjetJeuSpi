import java.util.ArrayList;

public class Tour extends Piece {

    protected Tour(int couleur, String positionCourante) {
        super(5, couleur, positionCourante);
    }

    @Override
    protected ArrayList<String> calculerDeplacementsPossiblesTheoriques() {
        ArrayList<String> deplacements = new ArrayList<String>(); // 5 déplacements au maximum pour un pion
        return deplacements;
    }

}
