public class Planete extends CorpsCeleste {
    public int tauxO2;
    public boolean airNocif;

    public Planete (int temp, boolean perm, float dia, float grav, Position pos ,int tO, boolean aN){
        super(temp,perm,dia,grav,pos);
        this.tauxO2 = tO;
        this.airNocif = aN;
    }
}