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
}