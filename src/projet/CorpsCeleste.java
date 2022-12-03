package projet;

/**
* Classe mère de tous les types de corps célestes
* Classe abstraite
*/
public abstract class CorpsCeleste implements Deplacement {
    /**
    * Attributs de CorpsCeleste
    */
    private int temperature;
    private float diametre;
    private float gravite;
    private Position pos;
    
    /**
    * Constructeur de CorpsCeleste
    */
    public CorpsCeleste (int t, float d, float g, Position pos){
        this.temperature = t;
        this.diametre = d;
        this.gravite = g;
        this.pos = pos;
    }

    /**
    * Si les limites supportables pour le corps humain sont depassées
    * Approcher du corps celeste => mort de Astronaute
    *
    * @return boolean estDangereux
    */
    public abstract boolean estDangereux();

    /**
    * Détermine si Astronaute peut survivre au long terme sur ce CorpsCeleste
    *
    * @return boolean estVivable
    */
    public abstract boolean estVivable();

    /**
    * Permet l'affichage des données d'un corps céleste
    * Aucune valeur retournée
    */
    public abstract void afficherCorpsCeleste();

    /**
    * Getters des attributs de CorpsCeleste
    *
    * @return int temperature
    * @return float diametre
    * @return float gravite
    * @return Position pos 
    */
    public int getTemp (){
        return this.temperature;
    }
    public float getDiam (){
        return this.diametre;
    }
    public float getGrav (){
        return this.gravite;
    }
    public Position getPos (){
        return this.pos;
    }
}