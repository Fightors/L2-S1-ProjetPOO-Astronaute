package projet;

public class Asteroide extends CorpsCeleste{
    private Position vecteur;
    public Asteroide (int t, float d, float g, Position pos, Position vect){
        super(t,d,g,pos);
        this.vecteur = vect;
    }

    //fonction de deplacement linéaire de l'astéroide.
    @Override
    public void seDeplacer(){
        this.getPos().additionnerPosition(this.vecteur);
    }

    public boolean estDangereux(){
        System.out.println("Vous êtes mort percuté par un astéroïde !");
        return true;
    }

    public boolean estVivable(){
        return false;
    }

    //getter
    public Position getVecteur() {
        return this.vecteur;
    }

    @Override
    public void afficherCorpsCeleste(){};
}