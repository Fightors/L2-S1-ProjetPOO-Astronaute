import java.util.ArrayList;

public class Univers{
    private Astronaute astronaute;
    private ArrayList<CorpsCeleste> listeCorps;


    public Univers(Astronaute astro, ArrayList<CorpsCeleste> l_Corps){
        this.astronaute = astro;
        this.listeCorps = l_Corps;
    }

    public CorpsCeleste intersection(){
        // voir si intersection entre notre astronaute et tout les corps celestes
        for (CorpsCeleste corps : this.listeCorps){
            if(astronaute.pos.getX()>=(corps.getPos().getX()-(corps.getDiam()/2)) &&
            astronaute.pos.getX()<=(corps.getPos().getX()+(corps.getDiam()/2)) &&
            astronaute.pos.getY()>=(corps.getPos().getY()-(corps.getDiam()/2)) &&
            astronaute.pos.getY()<=(corps.getPos().getY()+(corps.getDiam()/2))
            ){
                return corps;
            }
        }
        return null;
    }
}