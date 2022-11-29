package projet;

public class BouteilleO2 {
    private int capaO2Max;
    private int O2actuel;

    public BouteilleO2(int capaO2Max, int O2actuel) {
        this.capaO2Max = capaO2Max;
        this.O2actuel = O2actuel;
    }

    public int getcapaO2Max(){
        return this.capaO2Max;
    }

    public int getO2actuel(){
        return this.O2actuel;
    }

    public void setCapaO2Max(int capaO2Max) {
        this.capaO2Max = capaO2Max;
    }

    public void setO2actuel(int O2actuel) {
        this.O2actuel = O2actuel;
    }
}