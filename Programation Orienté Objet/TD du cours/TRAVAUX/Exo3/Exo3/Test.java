
/**
 * Décrivez votre classe Test ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Test
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int x;

    /**
     * Constructeur d'objets de classe Test
     */
    public Test()
    {
        // initialisation des variables d'instance
        x = 0;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public static void main()
    {
        PointCartesien pc1 = new PointCartesien(10,20);
        PointCartesien pc2 = new PointCartesien(30,40);
        PointPolaire pp1 = new PointPolaire(1,2);
        PointPolaire pp2 = new PointPolaire(3,4);

        System.out.println("Donne les coordonées sous forme polaire des point");
        System.out.println("\nPolaire"+pp1.ToStrgP()+pp2.ToStrgP());
        System.out.println("\nCartésien"+pc1.ToStrgP()+pc2.ToStrgP());

        System.out.println("Donne les coordonées sous forme carthésienne des point");
        System.out.println("\nPolaire"+pp1.ToStrgC()+pp2.ToStrgC());
        System.out.println("\nCartésien"+pc1.ToStrgC()+pc2.ToStrgC());

    }
}
