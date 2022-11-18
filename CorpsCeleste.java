public class CorpsCeleste {
    private int temperature;
    private boolean permetAtterrissage;
    private float diametre;
    private float gravite;
    private Position pos;

    public CorpsCeleste (int t, boolean p, float d, float g, Position pos){
        this.temperature = t;
        this.permetAtterrissage = p;
        this.diametre = d;
        this.gravite = g;
        this.pos = pos;
    }

    //methodes de CorpsCeleste

    //si les limites supportables pour le corps humain sont depassees
    //approcher du corps celeste => risque de MORT
    public boolean estDangereux (){
        if (this.temperature > 100 || this.gravite > 2){
            return true;
        }
        return false;
    }

    //les differents getters
    public int getTemp (){
        return this.temperature;
    }
    public boolean getPermAtt (){
        return this.permetAtterrissage;
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