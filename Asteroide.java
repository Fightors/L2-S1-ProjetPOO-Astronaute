public class Asteroide extends CorpsCeleste implements Deplacement {
    Position vecteur;
    public Asteroide (int t, boolean p, float d, float g, Position pos, Position vect){
        super(t,p,d,g,pos);
        this.vecteur = vect;
    }

    //fonction de deplacement linéaire de l'astéroide.
    @Override
    public void seDeplacer(){
        this.getPos().additionnerPosition(this.vecteur);
    }
}