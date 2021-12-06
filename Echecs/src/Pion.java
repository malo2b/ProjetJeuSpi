public class Pion extends Piece {

    private boolean aBouge;

    public Pion(int couleur, String positionCourante) {
        super(1, couleur, positionCourante);
        aBouge = false;
    }

    /**
     * Méthode de calcul des déplacements possibles théoriques
     * (Sans tenir compte des autres pièces ou éventuellement Echecs)
     * Tenir compte de la prise d'un pion
     * Tenir compte de la prise en passant (A faire plus tard)
    */
    @Override
    protected String[] calculerDeplacementsPossiblesTheoriques() {
        String[] deplacements = new String[6]; // 5 déplacements au maximum pour un pion
        if (couleur == 0) {
            // deplacements[0] = positionCourante.charAt(1)
        }


        return null;
    }

}
