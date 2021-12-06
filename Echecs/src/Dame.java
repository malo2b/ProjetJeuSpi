import java.util.ArrayList;

public class Dame extends Piece {

    protected Dame(int couleur, String positionCourante) {
        super(10, couleur, positionCourante);
    }

    @Override
    protected ArrayList<String> calculerDeplacementsPossiblesTheoriques() {
        ArrayList<String> deplacements = new ArrayList<String>(); // 5 déplacements au maximum pour un pion

        return deplacements;
    }

}
