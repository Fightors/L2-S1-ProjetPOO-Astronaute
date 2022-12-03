package projet;

/**
* Classe très importante car détermine les positions et déplacements
* de tous les corps présents dans l'Univers
*/
public class Position {
    /**
    * Attributs de Position
    */
    private int x;
    private int y;

    /**
    * Constructeur de Position
    */
    public Position (int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
    * Getters des attributs x,y de Position
    *
    * @return int x
    * @return int y  
    */
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    /**
    * Procédure de modification de la Position
    * Aucune valeur retournée
    *
    * @param Position p1  
    */
    public void additionnerPosition(Position p1){
        this.x += p1.getX();
        this.y += p1.getY();
    }

    /**
    * Affichage de la Position
    */
    public void affichagePos(){
        System.out.println("pos X: " + this.x + ", pos Y: " + this.y);
    }
}