package projet;
import java.lang.Math.*;

public class Etoile extends CorpsCeleste {
    private double RayChaleur;

    public Etoile (int t, float d, float g, Position pos){
        super(t, d, g, pos);
        this.RayChaleur=this.getDiam()/2*1.5;
    }

    public boolean estDangereux(){
        System.out.println("Vous êtes mort brulé par une étoile !");
        return true;
    }

    public boolean estVivable(){
        return false;
    }
    public void seDeplacer(){
        
    }

    public boolean estDansRay(Astronaute man){
        double distance;

        distance = Math.sqrt(Math.pow(this.getPos().getX() - man.getPos().getX(),2) + Math.pow(this.getPos().getY() - man.getPos().getY(),2));
        
        if(distance <= this.RayChaleur){
            return true;
        }
        return false;
    }

    @Override
    public void afficherCorpsCeleste(){};
}