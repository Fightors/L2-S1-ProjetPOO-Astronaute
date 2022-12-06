package projet;
import java.lang.Math.*;
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

    public static Univers universTest(){
        Vaisseau v1;
        v1 = new Vaisseau(50);
        
        BouteilleO2 bout = new BouteilleO2(100,70);

        CorpsCeleste p1,p2,p3,p4,p5,aste1,eto1;

        p1 = new Tellurique(60,40,1,new Position(100,250),80,false);
        p2 = new Tellurique(50,20,(float)0.7,new Position(400,200),80,true);
        p3 = new Tellurique(20,20,1,new Position(250,250),80,false);
        p4 = new Gazeuse(0,50,0,new Position(50,300),2);
        p5 = new Tellurique(-50,50,1,new Position(300,100),50,false);
        aste1 = new Asteroide(0,40,1,new Position(450,450),new Position(-20,-20));
        eto1 = new Etoile(500,50,50,new Position(200,250));

        ArrayList<CorpsCeleste> lC = new ArrayList<CorpsCeleste>();
        ArrayList<CorpsCeleste> lS;

        lC.add(p3);
        lC.add(p2);
        lC.add(p1);
        lC.add(aste1);
        lC.add(eto1);
        lC.add(p4);
        lC.add(p5);

            
        Astronaute Thomas = new Astronaute(bout,new Position(50,50),v1);
        
        Univers u = new Univers(Thomas,lC);
        return u;
    }

    //fonction qui va retourner un coprs celeste en verifiant si notre astronaute est dans un des rayons du corps celeste.
    public CorpsCeleste intersectionCorpsCeleste(){
        double distance;

        for(CorpsCeleste c : this.listeCorps){
            if( c instanceof Etoile){
                Etoile star = (Etoile)c;
                if(star.estDansRay(this.astronaute)){
                    return c;
                }
            }
            else{
                distance = Math.sqrt(Math.pow(c.getPos().getX() - this.astronaute.getPos().getX(),2) + Math.pow(c.getPos().getY() - this.astronaute.getPos().getY(),2));
                if(distance <= c.getDiam()/2){
                    return c;
                }
            }
        }  

        return null;
    }

    public void moveAste(){
        for(CorpsCeleste c : this.listeCorps){
            if( c instanceof Asteroide){
                Asteroide aste = (Asteroide)c;
                aste.seDeplacer();
            }
        }
    }

    //affichage tout les corps celeste dans l'univers
    public void affichage(){
        int i = 1;
        for(CorpsCeleste c : this.listeCorps){
            System.out.println("Corps celeste numero: " + i + " ,la temperature: " + c.getTemp() + "°C, avec diametre: " + c.getDiam() + " km, avec gravite: "
                             + c.getGrav() + ", a la position X: " + c.getPos().getX() + ", position Y: " + c.getPos().getY());
            i++;            
        }
    }

    public Astronaute getAstronaute() {
        return astronaute;
    }

    public void setAstronaute(Astronaute astronaute) {
        this.astronaute = astronaute;
    }

    public ArrayList<CorpsCeleste> getListeCorps() {
        return this.listeCorps;
    }

    public void setListeCorps(ArrayList<CorpsCeleste> listeCorps) {
        this.listeCorps = listeCorps;
    }
}