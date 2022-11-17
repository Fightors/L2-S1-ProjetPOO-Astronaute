public class Etoile extends CorpsCeleste {
    //type d'étoile à ajouter?
    //comme attribut spécifique de Etoile

    public Etoile (int t, boolean perm, float d, float g, Position pos){
        super(t, perm, d, g, pos);
        perm = false;
        //this.attribut si autres attributs
    }
}