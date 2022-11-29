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

    public void jouerTour(Univers univ, Astronaute asn, boolean foundIt){
        asn.seDeplacer();
        CorpsCeleste corps = univ.intersectionCorpsCeleste();
        this.plusTour();
        if(corps!=null){
            Etoile star = (Etoile)corps;
            if(corps instanceof Asteroide || 
            (corps instanceof Etoile && star.estDansRay(asn))){
                asn.setEstVivant(false);
            }
            else{
                asn.reducO2();
                if(asn.getBouteilleO2().getO2actuel()<=0){
                    asn.setEstVivant(false);
                }
                else{
                    if(corps.getPermAtt() == true){
                        if(corps.estDangereux() == true){
                            System.out.println("Attention ! Danger de mort sur ce corps céleste !");
                        }
                        else{
                            if(corps instanceof Tellurique){
                                Tellurique tellu = (Tellurique)corps;
                                if(tellu.getAirNocif() == true){
                                    System.out.println("Attention ! Danger de mort sur ce corps céleste !");
                                    if(tellu.getTauxO2()>0){
                                        asn.getBouteilleO2().setO2actuel(asn.getBouteilleO2().getcapaO2Max());
                                    }
                                }
                                else{
                                    foundIt=true;
                                    System.out.println("Bravo ! Vous avez trouvé une planète vivable en "+ this.nbTours+", il est temps de commencer votre nouvelle vie !");
                                    System.out.println("Le corps céleste vivable que vous avez trouver est :");
                                    corps.afficherCorpsCeleste();
                                }
                            }
                        }
                    }
                }
            }
        }
        else{
            System.out.println("Vous n'avez rencontré aucun corps céleste lors de ce tour !");
        }
    }
}
