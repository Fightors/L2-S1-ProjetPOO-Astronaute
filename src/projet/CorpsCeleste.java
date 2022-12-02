package projet;

public abstract class CorpsCeleste implements Deplacement {
    private int temperature;
    private float diametre;
    private float gravite;
    private Position pos;
    
    public CorpsCeleste (int t, float d, float g, Position pos){
        this.temperature = t;
        this.diametre = d;
        this.gravite = g;
        this.pos = pos;
    }

    //methodes de CorpsCeleste

    //si les limites supportables pour le corps humain sont depassees
    //approcher du corps celeste => risque de mort
    public abstract boolean estDangereux();

    public abstract boolean estVivable();

    //methode abstraire afficher les donnees d'une Corps Celeste
    public abstract void afficherCorpsCeleste();

    //les differents getters
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