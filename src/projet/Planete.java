package projet;

/**
* Classe representant toutes les Planete
* Classe fille de CorpsCeleste
* Classe abstraite
*/
public abstract class Planete extends CorpsCeleste {
    /**
    * Le taux d'oxygene
    */
    private int tauxO2;
    /**
    * L'air est toxique ou non 
    */
    private boolean airNocif;

    /**
     * Constructeur de Planete
     * taux02 et airNocif sont inscrits dans cette classe,
     * les autres attributs sont issus de la classe mere CorpsCeleste
     * 
     * @param temp La temperature
     * @param dia Le diametre
     * @param grav L'indice gravitationel
     * @param pos La Position de la Planete
     * @param tO Le taux d'oxygene
     * @param aN L'air est toxique ou non
     */
    public Planete (int temp, float dia, float grav, Position pos ,int tO, boolean aN){
        super(temp,dia,grav,pos);
        this.tauxO2 = tO;
        this.airNocif = aN;
    }

    /**
    * Getter d'un attribut de Planete
    *
    * @return taux02
    */
    public int getTauxO2 (){
        return this.tauxO2;
    }
    /**
     * Getter d'un attribut de Planete
     * 
     * @return airNocif
     */
    public boolean getAirNocif (){
        return this.airNocif;
    }

    /**
     * Setter d'un attribut de Planete
     * 
     * @param tauxO2 Niveau actuel d'oxygene
     */
    public void setTauxO2(int tauxO2) {
        this.tauxO2 = tauxO2;
    }

    /**
     * Setter d'un attribut de Planete
     * 
     * @param airNocif Air est nocif ou non
     */
    public void setAirNocif(boolean airNocif) {
        this.airNocif = airNocif;
    }

    /**
    * Affichage dans le terminal des informations sur la Planete
    */
    @Override
    public void afficherCorpsCeleste(){
        System.out.println("Cette planète a une temperature: " + this.getTemp() + "°C, avec un diametre: " + this.getDiam() + " km, et une gravite de : "
                             + this.getGrav() + "Elle est située à la position X: " + this.getPos().getX() + " ,position Y: " + this.getPos().getY() + ", et possède un taux O2: " + this.tauxO2 
                             + ", l'air est nocif: " + this.airNocif);
    }
}