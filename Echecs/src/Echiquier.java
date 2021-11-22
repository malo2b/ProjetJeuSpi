
public class Echiquier {

    /**
     * Cases : Type Case [][] ([colonne][ligne])
     */
    private Case [][] Cases;

    /**
     * Constructeur de Echiquier
     * L'instanciation d'un objet Echiquier marque le debut d'une partie
     * Auteur : @malo2b
     */
    Echiquier() {
        int numeroCase = 0;
        Cases = new Case[8][8];
        for (Case[] colonne : Cases) {
            for (Case elCase : colonne) {
                elCase = new Case(numeroCase);
                numeroCase++;
            }
        }
    }

}
