public class Planete extends CorpsCeleste {
    public int tauxO2;
    public boolean airNocif;

    public Planete (int tO, boolean aN){
        //ERREUR SI UTILISE: super(this.temperature,this.permetAtterrissage,this.diametre,this.gravite,this.pos);
        this.tauxO2 = tO;
        this.airNocif = aN;
    }

    //methodes de Planete
    //TODO
}