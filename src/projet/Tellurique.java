package projet;

/**
* Classe representant toutes les planetes Tellurique
* Classe fille de Planete
*/
public class Tellurique extends Planete {
    
    /**
     * Constructeur de Tellurique
     * Tous ses attributs sont issus de la classe mere Planete
     * 
     * @param temp La temperature
     * @param dia Le diametre
     * @param grav L'indice gravitationel
     * @param pos La Position de la Planete
     * @param tO Le taux d'oxygene
     * @param aN L'air est toxique ou non
     */
    public Tellurique (int temp, float dia, float grav, Position pos ,int tO, boolean aN){
        super(temp,dia,grav,pos, tO, aN);
    }

    /**
    * Determine la dangerosite de la planete Tellurique,
    * Et si elle entraine la mort de Astronaute
    *
    * @return estDangereux 
    */
    @Override
    public boolean estDangereux(){
        if(this.getGrav()<0.5 || this.getGrav()>2 || this.getAirNocif()==true || this.getTemp()<-50 || this.getTemp()>90){
            System.out.println("Vous êtes mort des conditions mortelles de cette planète !");
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Methode vide
     * Tellurique ne se deplace pas
     */
    @Override
    public void seDeplacer(){
        
    }

    /**
    * Fonction qui aide a determiner si Tellurique permet
    * la survie au long terme de Astronaute (ce qui entraine la fin de la simulation)
    *
    * @return estVivable 
    */
    @Override
    public boolean estVivable(){
        return (this.getGrav()<2 && this.getGrav()>=1 && this.getAirNocif()==false && this.getTemp()>0 && this.getTemp()<50);
    }
}