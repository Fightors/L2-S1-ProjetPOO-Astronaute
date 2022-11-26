import java.util.Scanner;

public class Astronaute {
    private Bouteille02 bouteille02;
    private boolean estVivant;
    private Position pos;

    public Astronaute (Bouteille02 b, Position pos){
        this.bouteille02= b;
        this.estVivant = true;
        this.pos = pos;
    }
    
    @Override
    public void seDeplacer(){
        char direction;
        Scanner scan;
        scan =new Scanner (System.in);
        while(char!='N' && char!='S' && char!='E' && char!='W'){
            public char nextChar(Scanner scan, char c);
            System.out.println("Indiquez une direction (N,S,E,W)");
            char = scan.nextChar();
        }
        Position temPos;
        
        this.pos.additionnerPosition(temPos);
    }

    public boolean peutAtterrir(CorpsCeleste corps){
        if (this.pos.getX()>=(corps.getPos().getX()-(corps.getDiam()/2)) && 
            this.pos.getX()<=(corps.getPos().getX()+(corps.getDiam()/2)) &&
            this.pos.getY()>=(corps.getPos().getY()-(corps.getDiam()/2)) &&
            this.pos.getY()<=(corps.getPos().getY()+(corps.getDiam()/2))
            ){
                return true;
            }
        return false;
    }

    public void rechargerO2 (Planete p1){
        if(p1.getTauxO2() > 0 && !(p1.getAirNocif())){
            this.bouteille02.setO2actuel(bouteille02.getcapaO2Max());
        }
        else{
            System.out.println("Impossible de recharger la reserve d'O2...");
        }
    }

    //les getters
    public boolean getVivant (){
        return this.estVivant;
    }
    public Position getPos() {
        return this.pos;
    }
    
    //les setters
    public void setPos(Position pos) {
        this.pos = pos;
    }
    public void setEstVivant(boolean estVivant) {
        this.estVivant = estVivant;
    }

}