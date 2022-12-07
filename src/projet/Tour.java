package projet;

/**
 * Classe representant chaque Tour de la partie
 */
public class Tour{
    /**
     * Attribut qui determine la "duree" du jeu
     */
    private int nbTours;

    /**
     * Constructeur d'une instance Tour
     * De base le nombre de tours est initie a 0
     */
    public Tour(){
        this.nbTours=0;
    }

    /**
     * Ajoute un tour au nombre de tours passe
     */
    public void plusTour(){
        this.nbTours+=1;
    }


    /**
     * Cette methode fait se derouler l'integralite d'un tour et appelle toutes les methodes
     * pour le deplacement, la reduction de l'oxygene, le scan des CorpsCeleste alentours
     * Affiche dans le terminal des informations a chaque etape du tour
     * 
     * @param univ L'Univers de notre simulation qui va habiter notre Astronaute et nos CorpsCeleste
     * @param asn L'Astronaute qui reside dans notre Univers
     */
    public void jouerTour(Univers univ, Astronaute asn){
        univ.moveAste();
        System.out.println("Position de l'astronaute:" );
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
                        System.out.println("Le corps céleste vivable que vous avez trouvé est :");
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


