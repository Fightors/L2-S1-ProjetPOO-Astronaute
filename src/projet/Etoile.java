package projet;

/**
* Classe representant toutes les Etoile
* Classe fille de CorpsCeleste
*/
public class Etoile extends CorpsCeleste {
    /**
    * 
    */
    private double RayChaleur;


    /**
    * Constructeur d'une instance de Etoile
    * Mis a part RayChaleur, tous ses attributs sont issus de la classe mere CorpsCeleste

     * @param t La temperature
     * @param d Le diametre
     * @param g L'indice gravitationel
     * @param pos La position
     */
    public Etoile (int t, float d, float g, Position pos){
        super(t, d, g, pos);
        this.RayChaleur=this.getDiam()/2*1.5;
    }

    /**
    * Dangerosite de l'Etoile
    * Retourne toujours true car Astronaute est brule en rentrant dans le rayon de chaleur de l'etoile
    *
    * @return boolean true 
    */
    @Override
    public boolean estDangereux(){
        System.out.println("Vous êtes mort brûlé par une étoile !");
        return true;
    }

    /**
    * Une Etoile n'est pas vivable
    * Retourne toujours false
    *
    * @return estVivable 
    */
    @Override
    public boolean estVivable(){
        return false;
    }

    /**
    * Methode vide 
    * Etoile ne se deplace pas
    * Aucune valeur retournee
    */
    @Override
    public void seDeplacer(){}

    /**
    * Si Astronaute est dans la zone de chaleur emise par Etoile (calcul distance)
    * Il brulera donc il meurt
    *
    * @param man L'Astronaute qui se deplace dans la simulation
    * @return estDansRay 
    */
    public boolean estDansRay(Astronaute man){
        double distance;
        
        //Calcul de la distance entre l'Astronaute et l'Etoile
        distance = Math.sqrt(Math.pow(this.getPos().getX() - man.getPos().getX(),2) + Math.pow(this.getPos().getY() - man.getPos().getY(),2));
        
        if(distance <= this.RayChaleur){
            return true;
        }
        return false;
    }

    /**
    * Permet l'affichage des donnees d'une Etoile
    * Aucune valeur retournee
    */
    @Override
    public void afficherCorpsCeleste(){};
}