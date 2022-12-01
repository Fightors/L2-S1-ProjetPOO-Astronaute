package projet;

public class Tellurique extends Planete {

    public Tellurique (int temp, float dia, float grav, Position pos ,int tO, boolean aN){
        super(temp,dia,grav,pos, tO, aN);
    }

    public boolean estDangereux(){
        if(this.getGrav()<0.5 || this.getGrav()>2 || this.getAirNocif()==true || this.getTemp()<-50 || this.getTemp()>90){
            System.out.println("Vous êtes mort des caractéristiques mortelles de cette planète !");
            return true;
        }
        else{
            return false;
        }
    }

    public boolean estVivable(){
        return (this.getGrav()<2 && this.getGrav()>=1 && this.getAirNocif()==false && this.getTemp()>0 && this.getTemp()<50);
    }
}