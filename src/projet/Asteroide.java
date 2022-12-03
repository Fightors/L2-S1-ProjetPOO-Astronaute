package projet;

public class Asteroide extends CorpsCeleste{
    /**
    * Attribut de CorpsCeleste
    */ 
    private Position vecteur;

    /**
    * Constructeur d'une instance de Asteroide
    * Ses attributs, mis à part vecteur,
    * sont attributs de la classe mère CorpsCeleste
    */
    public Asteroide (int t, float d, float g, Position pos, Position vect){
        super(t,d,g,pos);
        this.vecteur = vect;
    }

    /**
    * Procédure de déplacement de Asteroide
    * Ne retourne aucune Position, la modifie seulement
    */  
    @Override
    public void seDeplacer(){
        this.getPos().additionnerPosition(this.vecteur);
    }

    /**
    * Fonction indiquant la dangerosité de Asteroide
    * Retourne toujours vrai car collision = mort de Astronaute
    *
    * @return boolean vrai  
    */
    public boolean estDangereux(){
        System.out.println("Vous êtes mort percuté par un astéroïde !");
        return true;
    }

    /**
    * Fonction indiquant si il est possible de terminer la simulation
    * En ayant 'réussi' à vivre sur Asteroide
    * Retourne toujours faux
    *
    * @return boolean faux   
    */
    public boolean estVivable(){
        return false;
    }

    /**
    * Getter de l'attribut vecteur (Position)
    * Retourne sa valeur en Position
    *
    * @return Position 
    */
    public Position getVecteur() {
        return this.vecteur;
    }

    /**
    * Permet l'affichage des données d'un corps céleste
    * Aucune valeur retournée
    */
    @Override
    public void afficherCorpsCeleste(){};
}