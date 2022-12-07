package projet;
import java.util.Scanner;

/**
* Classe representant l'Astronaute
* Implemente l'interface Deplacement
*/
public class Astronaute implements Deplacement{
    /**
    * Bouteille d'oxygene de l'Astronaute
    */
    private BouteilleO2 bouteilleO2;
    /**
    * Indique si vivant ou non
    */
    private boolean estVivant;
    /**
    * Position actuelle
    */
    private Position pos;
    /**
    * Le vaisseau de l'Astronaute
    */
    private Vaisseau vaisseau;
    /**
    * Indique si l'Astronaute a deja trouve une planete ou non
    */
    private boolean trouvePlanete ;


    /**
     * Constructeur d'une instance de Astronaute
     * Ses attributs sont determines :
     * soit par valeur entree (bouteilleO2, pos, vaisseau),
     * soit automatiquement a l'instanciation (estVivant, trouvePlanete)
     * 
     * @param b Bouteille de l'Astronaute
     * @param pos Position de l'Astronaute
     * @param vaisseau Vaisseau de l'Astronaute
     */
    public Astronaute (BouteilleO2 b, Position pos, Vaisseau vaisseau){
        this.bouteilleO2= b;
        this.estVivant = true;
        this.pos = pos;
        this.vaisseau = vaisseau;
        this.trouvePlanete = false;
    }
    
    /**
    * Procedure de deplacement de Astronaute
    * On demande a l'utilisateur de choisir une direction et une puissance de deplacement
    * Deplacement fait en fonction de la direction choisie et de la puissance du vaisseau
    * Aucune valeur n'est retournee, modification de l'attribut pos
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
    * Procedure de rechargement de BouteilleO2 lorsque Astronaute arrive sur une planete
    * Est enclenchee uniquement si les conditions de l'oxygene sont satisfaites (air non nocif et a teneur suffisante en oxygene)
    * Aucune valeur n'est retournee, modification de BouteilleO2
    *
    * @param p1 La planete analysee 
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
    * Procedure de reduction de la quantite de O2 dans bouteilleO2
    * Appellee a chaque deplacement de l'Astronaute
    * Aucune valeur retournee, quantite d'O2 modifiee
    */
    public void reducO2(){
        this.bouteilleO2.setO2actuel(this.bouteilleO2.getO2actuel()-5);
    }

    /**
    * Getter d'un attribut de Astronaute
    * @return estVivant   
    */
    public boolean getVivant (){
        return this.estVivant;
    }
     /**
    * Getter d'un attribut de Astronaute
    * @return pos
    */
    public Position getPos() {
        return this.pos;
    }
     /**
    * Getter d'un attribut de Astronaute
    * @return bouteilleO2 
    */
    public BouteilleO2 getBouteilleO2(){
        return this.bouteilleO2;
    }
     /**
    * Getter d'un attribut de Astronaute
    * @return vaisseau
    */
    public Vaisseau getVaisseau(){
        return this.vaisseau;
    }
     /**
    * Getter d'un attribut de Astronaute
    * @return trouvePlanete 
    */
    public boolean getTrouvePlanete(){
        return this.trouvePlanete;
    }
    
    /**
    * Setter d'un attribut de Astronaute
    *
    * @param pos Position de l'Astronaute
    */
    public void setPos(Position pos) {
        this.pos = pos;
    }
    /**
    * Setter d'un attribut de Astronaute
    *
    * @param estVivant Astronaute est vivant ou non
    */
    public void setEstVivant(boolean estVivant) {
        this.estVivant = estVivant;
    }
    /**
    * Setter d'un attribut de Astronaute
    *
    * @param estTrouve Astronaute a trouve une Planete ou non
    */
    public void setTrouvePlanete(boolean estTrouve){
        this.trouvePlanete = estTrouve;
    }

}