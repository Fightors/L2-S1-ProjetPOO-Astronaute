package projet;

public class Gazeuse extends Planete {
    
    public Gazeuse(int temp, float dia, float grav, Position pos, int tO) {
        super(temp, dia, grav, pos, tO, true);
    }

    public boolean estDangereux(){
        return false;
    }

    public boolean estVivable(){
        return false;
    }
    public void seDeplacer(){

    }
}