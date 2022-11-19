import java.util.scanner;

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
        
        this.pos.additionnerPosition();
    }

    public boolean peutAtterrir(CorpsCeleste corps){
        if (astronaute.pos.getX>=(corps.pos.getPos.getX-(corps.getDiam/2)) && 
            astronaute.pos.getX<=(corps.pos.getPos.getX+(corps.getDiam/2)) &&
            astronaute.pos.getY>=(corps.pos.getPos.getY-(corps.getDiam/2)) &&
            astronaute.pos.getY<=(corps.pos.getPos.getY+(corps.getDiam/2)) &&
            ){
                return true;
            }
        return false;
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
        //air nocif
        if (reserveO2 == 0 || Planete.airNocif){
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
    
}