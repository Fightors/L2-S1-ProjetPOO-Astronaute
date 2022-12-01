package projet;

public abstract class Planete extends CorpsCeleste {
    private int tauxO2;
    private boolean airNocif;

    public Planete (int temp, float dia, float grav, Position pos ,int tO, boolean aN){
        super(temp,dia,grav,pos);
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
        System.out.println("Cette planète a une temperature: " + this.getTemp() + "°C, avec un diametre: " + this.getDiam() + " km, et une gravite de : "
                             + this.getGrav() + "Il est situé à la position X: " + this.getPos().getX() + " ,position Y: " + this.getPos().getY() + ", et possède un taux O2: " + this.tauxO2 
                             + ", l'air est nocif: " + this.airNocif);
    }
}