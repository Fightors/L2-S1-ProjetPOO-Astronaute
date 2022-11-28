package projet;

import java.util.Scanner;

public class Astronaute implements Deplacement{
    private BouteilleO2 bouteilleO2;
    private boolean estVivant;
    private Position pos;
    private Vaisseau vaisseau;

    public Astronaute (BouteilleO2 b, Position pos, Vaisseau vaisseau){
        this.bouteilleO2= b;
        this.estVivant = true;
        this.pos = pos;
        this.vaisseau = vaisseau;
    }
    
    @Override
    public void seDeplacer(){
        Scanner sc = new Scanner (System.in);
        char move;
        do{
            System.out.println("Indiquez une direction valide (N,S,E,W)");
            move = sc.next().charAt(0);
        }while (move!='N' && move!='S' && move!='E' && move!='W');
        sc.close();
        if(move == 'N'){
            Position nouvPos = new Position (0,vaisseau.getPuissance());
            this.pos.additionnerPosition(nouvPos);
        }
        else if(move == 'S'){
            Position nouvPos = new Position (0,-(vaisseau.getPuissance()));
            this.pos.additionnerPosition(nouvPos);
        }
        else if(move == 'E'){
            Position nouvPos = new Position (vaisseau.getPuissance(),0);
            this.pos.additionnerPosition(nouvPos);
        }
        if(move == 'W'){
            Position nouvPos = new Position (-(vaisseau.getPuissance()),0);
            this.pos.additionnerPosition(nouvPos);
        }
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
            this.bouteilleO2.setO2actuel(bouteilleO2.getcapaO2Max());
        }
        else{
            System.out.println("Impossible de recharger la reserve d'O2...");
        }
    }

    public void reducO2(){
        this.bouteilleO2.s02actuel(this.bouteilleO2.getO2actuel()-5);
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