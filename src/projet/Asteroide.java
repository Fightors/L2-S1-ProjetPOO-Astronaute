package projet;

/**
* Classe representant tous les Asteroide
* Classe fille de CorpsCeleste
*/
public class Asteroide extends CorpsCeleste{
    /**
    * Vecteur de deplacement
    */ 
    private Position vecteur;


    /**
     *  Constructeur d'une instance de Asteroide
     *  Ses attributs, mis a part vecteur,
     *  sont attributs de la classe mere CorpsCeleste
     * 
     * @param t La temperature
     * @param d Le diametre
     * @param g L'indice gravitationel
     * @param pos La position
     * @param vect Le vecteur de deplacement
     */
    public Asteroide (int t, float d, float g, Position pos, Position vect){
        super(t,d,g,pos);
        this.vecteur = vect;
    }

    /**
    * Procedure de deplacement de Asteroide
    * Modifie la Position de l'Asteroide a chaque tour pour le faire se deplacer
    */  
    @Override
    public void seDeplacer(){
        this.getPos().additionnerPosition(this.vecteur);
    }

    /**
    * Fonction indiquant la dangerosite de Asteroide
    * Retourne toujours vrai car si contact -> mort de Astronaute
    *
    * @return estDangereux  
    */
    public boolean estDangereux(){
        System.out.println("Vous êtes mort percuté par un astéroïde !");
        return true;
    }

    /**
    * Fonction indiquant s'il est possible de vivre sur l'Asteroide
    * Retourne toujours faux car un Asteroide n'a pas des conditions vivables
    *
    * @return estVivable   
    */
    public boolean estVivable(){
        return false;
    }

    /**
    * Getter de l'attribut vecteur (Position)
    * Retourne sa valeur en Position
    *
    * @return vecteur 
    */
    public Position getVecteur() {
        return this.vecteur;
    }

    /**
    * Permet l'affichage des donnees d'un corps celeste
    * Aucune valeur retournee
    */
    @Override
    public void afficherCorpsCeleste(){};
}