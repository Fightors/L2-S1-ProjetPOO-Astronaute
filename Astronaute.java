import java.util.Scanner;

public class Astronaute {
    private int reserveO2;
    private boolean estVivant;
    private Position pos;

    public Astronaute (int r, boolean eV, Position pos){
        this.reserveO2 = r;
        this.estVivant = eV;
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

    public int rechargerO2 (int reserveO2, Planete p1){
        if(p1.getTauxO2() > 0 && !(p1.getAirNocif())){
            reserveO2 += p1.getTauxO2();
        }
        else{
            System.out.println("Impossible de recharger la reserve d'O2...");
        }
        return reserveO2;
    }
    public void astroDeces (Planete planete){
        //trouver conditions de deces
        //exemples:
        //reserveO2 == 0;
        //air nocif 
        //gravite >= 10
        if (reserveO2 == 0 || planete.getAirNocif() || planete.gravite >= 10 || planete.temperature >= 70){
            this.estVivant = false;
        } 
    }

    //les getters
    public int getReserveO2 (){
        return this.reserveO2;
    }
    public boolean getVivant (){
        return this.estVivant;
    }
    public Position getPos() {
        return pos;
    }
    
    //les setters
    public void setReserveO2(int reserveO2) {
        this.reserveO2 = reserveO2;
    }
    public void setPos(Position pos) {
        this.pos = pos;
    }
    public void setEstVivant(boolean estVivant) {
        this.estVivant = estVivant;
    }

}