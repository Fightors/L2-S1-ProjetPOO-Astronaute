package projet;
import java.lang.Math.*;

public class Etoile extends CorpsCeleste {
    private double diamRayChaleur;

    public Etoile (int t, float d, float g, Position pos){
        super(t, d, g, pos);
        this.diamRayChaleur=this.getDiam()*1.5;
    }

    public boolean estDangereux(){
        System.out.println("Vous vous êtes mort percuté brulé par une étoile !");
        return true;
    }

    public boolean estVivable(){
        return false;
    }

    public boolean estDansRay(Astronaute man){
        double distance;

        distance = Math.sqrt(Math.pow(this.getPos().getX() - man.getPos().getX(),2) + Math.pow(this.getPos().getX() - man.getPos().getX(),2));
        
        if(distance <= this.diamRayChaleur){
            return true;
        }
        return false;
    }

    @Override
    public void afficherCorpsCeleste(){};
}