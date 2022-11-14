public class CorpsCeleste {
    public int temperature;
    public boolean permetAtterrissage;
    public float diametre;
    public float gravite;
    public Position pos;

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
    public boolean estDangereux (int temperature, float gravite){
        if (temperature > 100 || gravite > 2){
            return true;
        }
        return false;
    }

    //les differents getters
    public int getTemp (int temperature){
        return this.temperature;
    }
    public boolean getPermAtt (boolean permetAtterrissage){
        return this.permetAtterrissage;
    }
    public float getDiam (float diametre){
        return this.diametre;
    }
    public float getGrav (float gravite){
        return this.gravite;
    }
    public Position getPos (Position pos){
        return this.pos;
    }
}