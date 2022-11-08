public class Astronaute {
    public int reserveO2;
    public boolean estVivant;
    public Position pos;

    public Astronaute (int r, boolean eV, Position pos){
        this.reserveO2 = r;
        this.estVivant = eV;
        this.pos = pos;
    }

    ArrayList<Item> Equipement = new ArrayList();
}