package projet;
    public class TestAstronaute{
        public static void main(String[] args){
            Vaisseau v1;
            v1 = new Vaisseau(5);
        
            BouteilleO2 bout = new BouteilleO2(1000,900);
            Astronaute astro = new Astronaute(bout,new Position(1,1),v1);
            System.out.println(" pos X :" + astro.getPos().getX() + " et pos Y " + astro.getPos().getY());
            astro.seDeplacer();
            System.out.println(" pos X :" + astro.getPos().getX() + " et pos Y " + astro.getPos().getY());
        }
    }