
/**
 * Décrivez votre classe PointPolaire ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class PointPolaire
{
        /**
     * Constructeur d'objets de classe PointPolaire
     */
    public PointPolaire()
    {
        ro = 0;
        theta = 0;
    }

    private double ro;
    private double theta;
    
    /**
     * Constructeur d'objets de classe PointCartesien
     */
    public PointPolaire(double ro,double theta)
    {
        this.ro = ro;
        this.theta = theta;
    }
    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public double get_ro()
    {
        return this.ro;
    }
    public double get_theta()
    {
        return this.theta;
    }
    public double get_x()
    {
        return ro*Math.cos(this.theta)*Math.PI/180;
    }
    public double get_y()
    {
        return ro*Math.sin(this.theta)*Math.PI/180;
    }
    public void set_ro(double ro)
    {
        this.ro = ro;
    }
    public void set_theta(double theta)
    {
        this.theta = theta;
    }
    public void afficher()
    {
        System.out.println(ToStrgP()+ToStrgC());
               
    }
    public String ToStrgP()
    {
        return "\nRo = "+this.ro+" | Th = "+this.theta;
    }
    public String ToStrgC()
    {
        return "\nX = "+get_x()+" | y = "+get_y();
    }
}
