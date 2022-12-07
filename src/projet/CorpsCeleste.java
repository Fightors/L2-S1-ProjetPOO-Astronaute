package projet;

/**
* Classe mere de tous les types de corps celestes
* Implemente l'interface Deplacement
* Classe abstraite
*/
public abstract class CorpsCeleste implements Deplacement {
    /**
    * La temperature du CorpsCeleste
    */
    private int temperature;
    /**
    * La diametre du CorpsCeleste
    */
    private float diametre;
    /**
    * L'indice gravitationel du CorpsCeleste
    */
    private float gravite;
    /**
    * La position du CorpsCeleste
    */
    private Position pos;
    
  
    /**
    * Constructeur d'une instance de CorpsCeleste

     * @param t La temperature
     * @param d Le diametre
     * @param g L'indice gravitationel
     * @param pos La position
     */
    public CorpsCeleste (int t, float d, float g, Position pos){
        this.temperature = t;
        this.diametre = d;
        this.gravite = g;
        this.pos = pos;
    }

    /**
    * Si les limites supportables pour le corps humain sont depassees
    * Approcher du corps celeste -> mort de Astronaute
    *
    * @return Methode abstraite, ne retourne rien
    */
    public abstract boolean estDangereux();

    /**
    * Determine si Astronaute peut survivre au long terme sur ce CorpsCeleste
    *
    * @return Methode abstraite, ne retourne rien
    */
    public abstract boolean estVivable();

    /**
    * Permet l'affichage des donnees d'un corps celeste
    * Methode abstraite
    */
    public abstract void afficherCorpsCeleste();

    /**
    * Getter d'un attribut de CorpsCeleste
    *
    * @return temperature
    */
    public int getTemp (){
        return this.temperature;
    }
    /**
    * Getter d'un attribut de CorpsCeleste
    *
    * @return  diametre
    */
    public float getDiam (){
        return this.diametre;
    }
    /**
    * Getter d'un attribut de CorpsCeleste
    *
    * @return  gravite
    */
    public float getGrav (){
        return this.gravite;
    }
    /**
    * Getter d'un attribut de CorpsCeleste
    *
    * @return  pos 
    */
    public Position getPos (){
        return this.pos;
    }
}