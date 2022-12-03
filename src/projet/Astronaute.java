package projet;

import java.util.Scanner;

public class Astronaute implements Deplacement{
    /**
    * Attributs de la classe Astronaute
    */
    private BouteilleO2 bouteilleO2;
    private boolean estVivant;
    private Position pos;
    private Vaisseau vaisseau;
    private boolean trouvePlanete ;

    /**
    * Constructeur d'une instance de Astronaute
    * Ses attributs sont déterminés
    * Soit par valeur entrée (bouteille02, pos, vaisseau)
    * Soit automatiquement (estVivant, trouvePlanete)
    */
    public Astronaute (BouteilleO2 b, Position pos, Vaisseau vaisseau){
        this.bouteilleO2= b;
        this.estVivant = true;
        this.pos = pos;
        this.vaisseau = vaisseau;
        this.trouvePlanete = false;
    }
    
    /**
    * Procédure de déplacement de Astronaute
    * On demande à l'utilisateur de choisir une direction & une puissance de déplacement
    * Déplacement fait en fonction de la direction choisie & de la puissance du vaisseau
    * Aucune valeur retournée, modification de l'attribut pos
    */
    @Override
    public void seDeplacer(){
        Scanner sc = new Scanner (System.in);
        char move;
        int power;
        do{
            System.out.println("Indiquez une direction valide (N,S,E,W)");
            move = sc.next().charAt(0);
        }while (move!='N' && move!='S' && move!='E' && move!='W');
        do{
            System.out.println("Indiquez une puissance entre 1 et "+ this.vaisseau.getPuissance());
            power = sc.nextInt();
        }while (power<= 0 || power > this.vaisseau.getPuissance());
        if(move == 'N'){
            Position nouvPos = new Position (0,power);
            this.pos.additionnerPosition(nouvPos);
        }
        else if(move == 'S'){
            Position nouvPos = new Position (0,-(power));
            this.pos.additionnerPosition(nouvPos);
        }
        else if(move == 'E'){
            Position nouvPos = new Position (power,0);
            this.pos.additionnerPosition(nouvPos);
        }
        else if(move == 'W'){
            Position nouvPos = new Position (-(power),0);
            this.pos.additionnerPosition(nouvPos);
        }
        move=' ';
        power=0;
    }

    /**
    * Procédure de rechargement de bouteille02 lorsque Astronaute sur une planète
    * Est enclenchée uniquement si les conditions de la planète sont validées
    * Aucune valeur retournée, modification de bouteille02
    *
    * @param p1 la planète analysée 
    */
    public void rechargerO2 (Planete p1){
        if(p1.getTauxO2() > 0 && !(p1.getAirNocif())){
            this.bouteilleO2.setO2actuel(bouteilleO2.getcapaO2Max());
        }
        else{
            System.out.println("Impossible de recharger la reserve d'O2...");
        }
    }

    /**
    * Procédure de réduction de la quantité de 02 dans bouteille02
    * Utilisée en fonction des déplacements que Astronaute effectue
    * Aucune valeur retournée
    */
    public void reducO2(){
        this.bouteilleO2.setO2actuel(this.bouteilleO2.getO2actuel()-5);
    }

    /**
    * Getters des attributs de Astronaute
    *
    * @return boolean estVivant
    * @return Position pos
    * @return Bouteille02 
    * @return Vaisseau
    * @return boolean trouvePlanete    
    */
    public boolean getVivant (){
        return this.estVivant;
    }
    public Position getPos() {
        return this.pos;
    }
    public BouteilleO2 getBouteilleO2(){
        return this.bouteilleO2;
    }
    public Vaisseau getVaisseau(){
        return this.vaisseau;
    }
    public boolean getTrouvePlanete(){
        return this.trouvePlanete;
    }
    
    /**
    * Setters des attributs de Astronaute
    * Pas de valeurs retournées, modifications de celles-ci
    */
    public void setPos(Position pos) {
        this.pos = pos;
    }
    public void setEstVivant(boolean estVivant) {
        this.estVivant = estVivant;
    }
    public void setTrouvePlanete(boolean estTrouve){
        this.trouvePlanete = estTrouve;
    }

}