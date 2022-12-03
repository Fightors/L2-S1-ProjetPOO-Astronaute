package projet;

public abstract class Planete extends CorpsCeleste {
    /**
    * Attributs de Planete
    */
    private int tauxO2;
    private boolean airNocif;

    /**
    * Constructeur de Planete
    * taux02 et airNocif sont inscrits dans cette classe,
    * les autres attributs sont issus de la classe mère CorpsCeleste
    */
    public Planete (int temp, float dia, float grav, Position pos ,int tO, boolean aN){
        super(temp,dia,grav,pos);
        this.tauxO2 = tO;
        this.airNocif = aN;
    }

    /**
    * Getters des attributs de Planete
    *
    * @return int taux02
    * @return boolean airNocif 
    */
    public int getTauxO2 (){
        return this.tauxO2;
    }
    public boolean getAirNocif (){
        return this.airNocif;
    }

    /**
    * Setters des attributs de Planete
    * Aucune valeur retournée
    * 
    * @param int taux02 
    * @param boolean airNocif 
    */
    public void setTauxO2(int tauxO2) {
        this.tauxO2 = tauxO2;
    }
    public void setAirNocif(boolean airNocif) {
        this.airNocif = airNocif;
    }

    /**
    * Affichage des informations sur Planete
    * Aucun retour de valeur
    */
    @Override
    public void afficherCorpsCeleste(){
        System.out.println("Cette planète a une temperature: " + this.getTemp() + "°C, avec un diametre: " + this.getDiam() + " km, et une gravite de : "
                             + this.getGrav() + "Elle est située à la position X: " + this.getPos().getX() + " ,position Y: " + this.getPos().getY() + ", et possède un taux O2: " + this.tauxO2 
                             + ", l'air est nocif: " + this.airNocif);
    }
}