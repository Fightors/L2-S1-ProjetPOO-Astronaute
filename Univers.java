public class Univers{
    private Astronaute astronaute;
    private ArrayList<CorpsCeleste> listeCorps;


    public Univers(Astronaute astro, ArrayList<CorpsCeleste> l_Corps){
        this.astronaute = astro;
        this.listeCorps = l_Corps;
    }

    public CorpsCeleste intersection(){
        //TODO voir si intersection entre notre astronaute et tout les corps celestes
    }
}