package projet;
import java.util.scanner;

public class Tour{
    private int nbTours;

    public Tour(){
        this.nbTours=0;
    }

    public plusTour(){
        this.nbTours+=1;
    }

    public jouerTour(Univers univ, Astronaute asn, boolean foundIt){
        asn.seDeplacer();
        CorpsCeleste corps = univ.intersection();
        this.plusTour();
        if(corps!=null){
            if(corps instanceof Asteroide || 
            (corps instanceof Etoile && corps.estDansRay(asn))){
                asn.setEstVivant(false);
            }
            else{
                asn.reducO2();
                if(asn.bouteilleO2.getO2actuel()<=0){
                    asn.setEstVivant(false);
                }
                else{
                    if(corps.getPermAtt() == true){
                        if(corps.estDangereux() == true){
                            System.out.println("Attention ! Danger de mort sur ce corps céleste !")
                        }
                        else{
                            if(corps instanceof Tellurique){
                                if(corps.getAirNocif == true){
                                    System.out.println("Attention ! Danger de mort sur ce corps céleste !");
                                    if(corps.getTauxO2()>0){
                                        asn.bouteilleO2.setO2actuel(asn.bouteilleO2.getcapaO2Max);
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
