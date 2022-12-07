package projet;

/**
* Classe representant toutes les planetes Gazeuse
* Classe fille de Planete
*/
public class Gazeuse extends Planete {
    

    /**
     * Constructeur d'une instance de Gazeuse
     * Tous ses attributs sont crees grace a sa classe-mere (Planete)
     *
     * @param temp La temperature
     * @param dia Le diametre
     * @param grav L'indice gravitationel
     * @param pos La position
     * @param tO Le taux d'oxygene
     */
    public Gazeuse(int temp, float dia, float grav, Position pos, int tO) {
        super(temp, dia, grav, pos, tO, true);
    }

    /**
    * Determine la dangerosite de Gazeuse
    * Une Gazeuse n'est pas dangereuse donc retourne false
    *
    * @return estDangereux 
    */
    public boolean estDangereux(){
        return false;
    }

    /**
    * Une planete gazeuse ne permet pas la survie au long terme de Astronaute
    * Retourne toujours false
    *
    * @return estVivable
    */
    public boolean estVivable(){
        return false;
    }

    /**
    * Methode vide 
    * Gazeuse ne se deplace pas
    */
    public void seDeplacer(){

    }
}