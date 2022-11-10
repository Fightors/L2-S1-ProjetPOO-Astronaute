public class Asteroide extends CorpsCeleste {
    Position vecteur;
    public Asteroide (int t, boolean p, float d, float g, Position pos, Position vect){
        super(t,p,d,g,pos);
        this.vecteur = vect;
    }

    //fonction de deplacement linéaire de l'astéroide.
    public void seDeplacer(){
        this.pos.additionnerPosition(this.vecteur);
    }
}