package projet;

public class Gazeuse extends Planete {
    
    /**
    * Constructeur d'une instance de Gazeuse
    * Tous ses attributs sont créés grâce à sa classe-mère (Planete)
    */
    public Gazeuse(int temp, float dia, float grav, Position pos, int tO) {
        super(temp, dia, grav, pos, tO, true);
    }

    /**
    * Détermine la dangerosité de Gazeuse
    *
    * @return boolean estDangereux 
    */
    public boolean estDangereux(){
        return false;
    }

    /**
    * Une planète gazeuse ne permet pas la survie au long terme de Astronaute
    * Retourne toujours false
    *
    * @return boolean false 
    */
    public boolean estVivable(){
        return false;
    }

    /**
    * Gazeuse ne se déplace pas
    */
    public void seDeplacer(){

    }
}