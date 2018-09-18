
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
        PointDegDec PDD = new PointDegDec(10.0525,10.0525);
        PointDegRad PDG = new PointDegRad(0.17544922305672997,0.17544922305672997);
        int TabLon[] = {10,3,9};
        int TabLat[] = {10,3,9};
        PointDegSexa PDS = new PointDegSexa(TabLon,TabLat);

        System.out.println("\nPoint Deg Dec"+PDD.ToString());
        System.out.println("\nPoint Deg Rad"+PDG.ToString());
        System.out.println("\nPoint Deg Sexa"+PDS.ToString());
    }
}
