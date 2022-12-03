package projet;

public class Tellurique extends Planete {
    /**
    * Constructeur de Tellurique
    * Tous ses attributs sont issus de la classe mère CorpsCeleste
    */
    public Tellurique (int temp, float dia, float grav, Position pos ,int tO, boolean aN){
        super(temp,dia,grav,pos, tO, aN);
    }

    /**
    * Determine la dangerosité de Tellurique,
    * Et si elle entraîne la mort de Astronaute
    *
    * @return boolean estDangereux 
    */
    public boolean estDangereux(){
        if(this.getGrav()<0.5 || this.getGrav()>2 || this.getAirNocif()==true || this.getTemp()<-50 || this.getTemp()>90){
            System.out.println("Vous êtes mort des caractéristiques mortelles de cette planète !");
            return true;
        }
        else{
            return false;
        }
    }

    /**
    * Tellurique ne se déplace pas
    */
    public void seDeplacer(){
        
    }

    /**
    * Fonction qui aide à déterminer si Tellurique permet
    * La survie au long terme de Astronaute (ce qui entraîne fin de simulation)
    *
    * @return boolean estVivable 
    */
    public boolean estVivable(){
        return (this.getGrav()<2 && this.getGrav()>=1 && this.getAirNocif()==false && this.getTemp()>0 && this.getTemp()<50);
    }
}