package projet;

/**
* Classe tres importante car determine les positions et deplacements
* de tous les CorpsCeleste presents dans l'Univers
*/
public class Position {
    /**
     * Coordonnee x
     */
    private int x;
    /**
     * Coordonnee y
     */
    private int y;


    /**
     * Constructeur d'une instance Position
     * 
     * @param x Coordonnee x
     * @param y Coordonnee y
     */
    public Position (int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
    * Getter de l'attribut x de Position
    *
    * @return x
    */
    public int getX(){
        return this.x;
    }

    /**
     * Getter de l'attribut y de Position
     * 
     * @return y
     */
    public int getY(){
        return this.y;
    }

    /**
    * Procedure de modification de la Position
    * Aucune valeur retournee
    *
    * @param p1 La distance que nous allons parcourir (Position) 
    */
    public void additionnerPosition(Position p1){
        this.x += p1.getX();
        this.y += p1.getY();
    }

    /**
    * Affichage de la Position dans le terminal
    */
    public void affichagePos(){
        System.out.println("pos X: " + this.x + ", pos Y: " + this.y);
    }
}