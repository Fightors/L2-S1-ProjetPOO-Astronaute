package projet;
import java.lang.Math.*;

public class Etoile extends CorpsCeleste {
    /**
    * Attribut de Etoile
    */
    private double RayChaleur;

    /**
    * Constructeur d'une instance de Etoile
    * Mis à part RayChaleur, tous ses attributs sont issus de la classe mère CorpsCeleste
    */
    public Etoile (int t, float d, float g, Position pos){
        super(t, d, g, pos);
        this.RayChaleur=this.getDiam()/2*1.5;
    }

    /**
    * Dangerosité de l'Etoile
    * Retourne toujours true car Astronaute brûlé par RayChaleur
    *
    * @return boolean true 
    */
    public boolean estDangereux(){
        System.out.println("Vous êtes mort brûlé par une étoile !");
        return true;
    }

    /**
    * Etoile est dangereux donc non vivable
    * Retourne toujours false
    *
    * @return boolean false 
    */
    public boolean estVivable(){
        return false;
    }
    /**
    * Etoile ne se déplace pas
    * Aucune valeur retournée
    */
    public void seDeplacer(){
        
    }

    /**
    * Si Astronaute est dans la zone de chaleur émise par Etoile (calcul distance)
    * Il sera brûlé donc mort
    *
    * @return boolean estDansRay 
    */
    public boolean estDansRay(Astronaute man){
        double distance;

        distance = Math.sqrt(Math.pow(this.getPos().getX() - man.getPos().getX(),2) + Math.pow(this.getPos().getY() - man.getPos().getY(),2));
        
        if(distance <= this.RayChaleur){
            return true;
        }
        return false;
    }

    /**
    * Permet l'affichage des données d'une Etoile
    * Aucune valeur retournée
    */
    @Override
    public void afficherCorpsCeleste(){};
}