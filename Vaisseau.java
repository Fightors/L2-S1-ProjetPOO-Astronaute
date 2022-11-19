public class Vaisseau extends Equipement{
    private int puissance;

    public Vaisseau(int puissance) {
        this.puissance = puissance;
    }

    public boolean scan(int tempCS , boolean presH2O, float grav ){
        //TODO
    }

    public int getPuissance(){
        return this.puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }
}
