package projet;

public class BouteilleO2 {
    /**
    * Attributs de Bouteille02
    */
    private int capaO2Max;
    private int O2actuel;

    /**
    * Constructeur d'une instance de Bouteille02
    */
    public BouteilleO2(int capaO2Max, int O2actuel) {
        this.capaO2Max = capaO2Max;
        this.O2actuel = O2actuel;
    }

    /**
    * Getters des attributs de Bouteille02
    *
    * @return int capa02Max
    * @return int 02actuel   
    */
    public int getcapaO2Max(){
        return this.capaO2Max;
    }
    public int getO2actuel(){
        return this.O2actuel;
    }

    /**
    * Setters des attributs de Bouteille02
    */
    public void setCapaO2Max(int capaO2Max) {
        this.capaO2Max = capaO2Max;
    }
    public void setO2actuel(int O2actuel) {
        this.O2actuel = O2actuel;
    }
}