public class Astronaute {
    public int reserveO2;
    public boolean estVivant;
    public Position pos;

    public Astronaute (int r, boolean eV, Position pos){
        this.reserveO2 = r;
        this.estVivant = eV;
        this.pos = pos;
    }

    //ArrayList<Item> Equipement = new ArrayList();
    //erreur compilation: créer classe Item pour résoudre?

    @Override
    public void seDeplacer(){
        //Position vect;
        //vect = methodeDemandeUtilisateur
        this.pos.additionnerPosition();
    }
    public boolean peutAtterrir(CorpsCeleste corps){

    }

    public int rechargerO2 (int reserveO2, Planete p1){
        if(p1.tauxO2 > 0 && !(p1.airNocif)){
            reserveO2 += p1.tauxO2;
        }
        else{
            System.out.println("Impossible de recharger la reserve d'O2...");
        }
        return reserveO2;
    }
    public void astroDeces (){
        //trouver conditions de deces
        //exemples:
        //reserveO2 == 0;
        //attaque par alien
        //etc...
        this.estVivant = false;
    }

    //les getters
    public int getReserveO2 (){
        return this.reserveO2;
    }
    public boolean getVivant (){
        return this.estVivant;
    }
    
}