import java.util.ArrayList;

public class Univers{
    private Astronaute astronaute;
    private ArrayList<CorpsCeleste> listeCorps;


    /**
     * @param astronaute
     * @param listeCorps
     */
    public Univers(Astronaute astronaute, ArrayList<CorpsCeleste> listeCorps) {
        this.astronaute = astronaute;
        this.listeCorps = listeCorps;
    }

    /**
     * @return 
     */
    public CorpsCeleste intersection(){
        // voir si intersection entre notre astronaute et tout les corps celestes
        for (CorpsCeleste corps : listeCorps){
            if(astronaute.getPos().getX()>=(corps.getPos().getX()-(corps.getDiam()/2)) &&
            astronaute.getPos().getX()<=(corps.getPos().getX()+(corps.getDiam()/2)) &&
            astronaute.getPos().getY()>=(corps.getPos().getY()-(corps.getDiam()/2)) &&
            astronaute.getPos().getY()<=(corps.getPos().getY()+(corps.getDiam()/2))
            ){
                return corps;
            }
        }
    }

    public Astronaute getAstronaute() {
        return astronaute;
    }

    public void setAstronaute(Astronaute astronaute) {
        this.astronaute = astronaute;
    }

    public ArrayList<CorpsCeleste> getListeCorps() {
        return listeCorps;
    }

    public void setListeCorps(ArrayList<CorpsCeleste> listeCorps) {
        this.listeCorps = listeCorps;
    }
}