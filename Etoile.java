public class Etoile extends CorpsCeleste {
    private double diamRayChaleur;

    public Etoile (int t, float d, float g, Position pos){
        super(t,false, d, g, pos);
        this.diamRayChaleur=this.getDiam()*1.5;
    }

    public boolean estDansRay(Astronaute man){
        return(man.pos.getX()>=(this.getPos().getX()-(this.diamRayChaleur/2)) &&
            man.pos.getX()<=(this.getPos().getX()+(this.diamRayChaleur/2)) &&
            man.pos.getY()>=(this.getPos().getY()-(this.diamRayChaleur/2)) &&
            man.pos.getY()<=(this.getPos().getY()+(this.diamRayChaleur/2)));
    }
}