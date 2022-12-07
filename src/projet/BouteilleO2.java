package projet;

/**
* Classe representant une Bouteille d'O2
* Sera equipe a l'Astronaute
*/
public class BouteilleO2 {
    /**
    * Capacite maximum BouteilleO
    */
    private int capaO2Max;
    /**
    * Niveau actuel d'oxygene
    */
    private int O2actuel;

    /**
     * Constructeur d'une instance de BouteilleO2
     * 
     * @param capaO2Max Capacite maximum d'oxygene
     * @param O2actuel Niveau actuel d'oxygene
     */
    public BouteilleO2(int capaO2Max, int O2actuel) {
        this.capaO2Max = capaO2Max;
        this.O2actuel = O2actuel;
    }

    /**
    * Getter d'un attribut de BouteilleO2
    *
    * @return capaO2Max   
    */
    public int getcapaO2Max(){
        return this.capaO2Max;
    }
    /**
    * Getter d'un attribut de BouteilleO2
    *
    * @return O2actuel   
    */
    public int getO2actuel(){
        return this.O2actuel;
    }


    /**
    * Setter d'un attribut de BouteilleO2
    * 
    * @param capaO2Max Capacite maximum d'oxygene
    */
    public void setCapaO2Max(int capaO2Max) {
        this.capaO2Max = capaO2Max;
    }

    /**
    *Setter d'un attribut de BouteilleO2
    *
    * @param O2actuel Niveau actuel d'oxygene
    */
    public void setO2actuel(int O2actuel) {
        this.O2actuel = O2actuel;
    }
}