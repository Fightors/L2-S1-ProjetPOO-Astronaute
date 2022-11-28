package projet;

public class Planete extends CorpsCeleste {
    private int tauxO2;
    private boolean airNocif;

    public Planete (int temp, boolean perm, float dia, float grav, Position pos ,int tO, boolean aN){
        super(temp,perm,dia,grav,pos);
        this.tauxO2 = tO;
        this.airNocif = aN;
    }

    //les getters
    public int getTauxO2 (){
        return this.tauxO2;
    }
    public boolean getAirNocif (){
        return this.airNocif;
    }

    public void setTauxO2(int tauxO2) {
        this.tauxO2 = tauxO2;
    }

    public void setAirNocif(boolean airNocif) {
        this.airNocif = airNocif;
    }

    @Override
    public void afficherCorpsCeleste(){
        System.out.println("La temperature: " + this.getTemp() + "°C, avec diametre: " + this.getDiam() + " km, avec gravite: "
                             + this.getGrav() + ", a la position: " + this.getPos() + ", taux O2: " + this.tauxO2 
                             + ", l'air est nocif: " + this.airNocif);
    }
}