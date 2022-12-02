package projet;
import java.util.Scanner;

public class Tour{
    private int nbTours;

    public Tour(){
        this.nbTours=0;
    }

    public void plusTour(){
        this.nbTours+=1;
    }

    public void jouerTour(Univers univ, Astronaute asn){
        univ.moveAste();
        System.out.println("Postion de l'astronaute:" );
        asn.getPos().affichagePos();
        asn.seDeplacer();
        asn.reducO2();
        if(asn.getBouteilleO2().getO2actuel()<=0){
            System.out.println("Vous êtes mort car votre bouteille d'oxygène est vide !");
            asn.setEstVivant(false);
        }
        else{
            CorpsCeleste corps = univ.intersectionCorpsCeleste();
            this.plusTour();
            if(corps!=null){
                if(corps.estDangereux() == true){
                    asn.setEstVivant(false);
                }
                else{
                    if(corps.estVivable()==false){
                        System.out.println("Cette planète n'est pas vivable, vous avez néanmoins rechargé votre bouteille d'oxygène !");
                        asn.getBouteilleO2().setO2actuel(asn.getBouteilleO2().getcapaO2Max());
                    }
                    else{
                        asn.setTrouvePlanete(true);
                        System.out.println("Bravo ! Vous avez trouvé une planète vivable en "+ this.nbTours+" tour(s), il est temps de commencer votre nouvelle vie !");
                        System.out.println("Le corps céleste vivable que vous avez trouver est :");
                        corps.afficherCorpsCeleste();
                    }
                }
            }
            else{
                System.out.println("Vous n'avez rencontré aucun corps céleste lors de ce tour !");
            }
        } 
    }
}


