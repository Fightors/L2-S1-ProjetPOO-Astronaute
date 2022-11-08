public class Asteroide extends CorpsCeleste {
    public Asteroide (int t, boolean p, float d, float g, Position pos){
        this.temperature = t;
        this.permetAtterrissage = p;
        this.diametre = d;
        this.gravite = g;
        this.pos = pos;
    }

    //mouvement de l'astéroide pour suivre astronaute?? à voir!
    public Position seDeplacer(Position p1){
        this.pos = p1;
    }
}