package projet;

public class Etoile extends CorpsCeleste {
    private double diamRayChaleur;

    public Etoile (int t, float d, float g, Position pos){
        super(t,false, d, g, pos);
        this.diamRayChaleur=this.getDiam()*1.5;
    }

    public boolean estDansRay(Astronaute man){
        return(man.getPos().getX()>=(this.getPos().getX()-(this.diamRayChaleur/2)) &&
            man.getPos().getX()<=(this.getPos().getX()+(this.diamRayChaleur/2)) &&
            man.getPos().getY()>=(this.getPos().getY()-(this.diamRayChaleur/2)) &&
            man.getPos().getY()<=(this.getPos().getY()+(this.diamRayChaleur/2)));
    }

    @Override
    public void afficherCorpsCeleste(){};
}