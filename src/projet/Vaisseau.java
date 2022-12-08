package projet;
import java.util.ArrayList;

/**
* Classe representant le Vaisseau. 
* Sera equipe a l'Astronaute
*/
public class Vaisseau{
    /**
     * Puissance du Vaisseau, de combien il pourra se deplacer en un tour
     */
    private int puissance;

    /**
     * Constructeur d'une instance de Vaisseau
     * 
     * @param puissance Puissance du Vaisseau
     */
    public Vaisseau(int puissance) {
        this.puissance = puissance;
    }

    /**
     * Methode qui scan une zone autour du Vaisseau dans un rayon donne
     * 
     * @param u Univers a scanne
     * @param astro Astronaute qui fera le scan
     * @param rad Portee du scanner
     */
    public void scanner(Univers u, Astronaute astro, double rad){
        ArrayList<CorpsCeleste> ls = new ArrayList<CorpsCeleste>();
        double distance;

        for(CorpsCeleste c : u.getListeCorps()){
            distance = Math.sqrt(Math.pow(c.getPos().getX() - astro.getPos().getX(),2) + Math.pow(c.getPos().getY() - astro.getPos().getY(),2));
            
            if(distance <= rad){
                ls.add(c);
            }
        }         
        int i = 1;
        for(CorpsCeleste c : ls){
            System.out.println("Corps celeste numero: " + i + " ,la temperature: " + c.getTemp() + "°C, avec diametre: " + c.getDiam() + " km, avec gravite: "
            + c.getGrav() + ", a la position X: " + c.getPos().getX() + ", position Y: " + c.getPos().getY());
            i++;            
        }
    }
    
    /**
     * Getter d'un des attrivuts de Vaisseau
     * 
     * @return puissance
     */
    public int getPuissance(){
        return this.puissance;
    }

    /**
     * Setter d'un des attributs de Vaisseau
     * 
     * @param puissance La puissance du Vaisseau
     */
    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }
}
