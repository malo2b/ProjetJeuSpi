
public class Echiquier {

    /**
     * Cases : Type Case [Lettre][Chiffre] ([colonne][ligne])
     * [0][0] --> A1
     */
    private Case [][] Cases;

    /**
     * Constructeur de Echiquier
     * L'instanciation d'un objet Echiquier marque le debut d'une partie
     * Auteur : @malo2b
     */
    public Echiquier() {
        int numeroCase = 0;
        Cases = new Case[8][8];
        for (int col = 0; col < 8; col++) { // Iteration sur colonne
            for (int line = 0; line < 8; line++) {
                Cases[col][line] = new Case((col*8)+line);
            }
        }
        initialiserPieces();
    }

    /**
     * Initialise les pieces sur l'échiquier
     * Auteur : @malo2b
     */
    public void initialiserPieces() {
        String [] POSITION_PIECES = {"A1_T","B1_C","C1_F","D1_D","E1_R","F1_F","G1_C","H1_T","A2","B2","C2","D2","E2","F2","G2","H2","A7","B7","C7","D7","E7","F7","G7","H7","A8_T","B8_C","C8_F","D8_D","E8_R","F8_F","G8_C","H8_T"};
        String [] tampon;
        Case caseCourrante = null;
        int cpt = 0;

        // Instanciation des pieces
        for (String position : POSITION_PIECES) {
            // Si piece différente de pion
            if (position.length() == 4) {
                tampon = position.split("_");
                caseCourrante = Cases[getNumeroLigne(tampon[0].charAt(0))][(int)tampon[0].charAt(1)-1-48]; // -48 pour enlever le code ascii du caractere 1
                switch (tampon[1]) {
                    // Tour
                    case "T":
                        System.out.println("Tour " + tampon[0] + " | Element du tableau : " + getNumeroLigne(tampon[0].charAt(0)) + " " + (char)((int)tampon[0].charAt(1)-1));
                        caseCourrante.positionnerPiece(new Tour(cpt > 20 ? 1 : 0, tampon[0]));
                        break;
                    // Cavalier
                    case "C":
                        System.out.println("Cavalier" + tampon[0] + " | Element du tableau : " + getNumeroLigne(tampon[0].charAt(0)) + " " + (char)((int)tampon[0].charAt(1)-1));
                        caseCourrante.positionnerPiece(new Cavalier(cpt > 20 ? 1 : 0, tampon[0]));
                        break;
                    // Fou
                    case "F":
                        System.out.println("Fou " + tampon[0] + " | Element du tableau : " + getNumeroLigne(tampon[0].charAt(0)) + " " + (char)((int)tampon[0].charAt(1)-1));
                        caseCourrante.positionnerPiece(new Fou(cpt > 20 ? 1 : 0, tampon[0]));
                        break;
                    // Dame
                    case "D":
                        System.out.println("Dame " + tampon[0] + " | Element du tableau : " + getNumeroLigne(tampon[0].charAt(0)) + " " + (char)((int)tampon[0].charAt(1)-1));
                        caseCourrante.positionnerPiece(new Dame(cpt > 20 ? 1 : 0, tampon[0]));
                        break;
                    // Roi
                    case "R":
                        System.out.println("Roi " + tampon[0] + " | Element du tableau : " + getNumeroLigne(tampon[0].charAt(0)) + " " + (char)((int)tampon[0].charAt(1)-1));
                        caseCourrante.positionnerPiece(new Roi(cpt > 20 ? 1 : 0, tampon[0]));
                        break;
                }
            // Si pion
            } else {
                System.out.println("Pion " + position + " | Element du tableau : " + (char)((int)position.charAt(1)-1) + " " + getNumeroLigne(position.charAt(0)));
                caseCourrante.positionnerPiece(new Pion(cpt > 20 ? 1 : 0, position));
            }
            cpt++;
        }
    }

    /**
     * Auteur : malo2b
     * Retourne l'indice du tableau en fonction de la lettre en entrée
     * @param colonne lettre de la colonne
     * @return indice de la colonne
     */
    public int getNumeroLigne(char colonne) {
        return (int)(colonne - 'A');
    }

}
