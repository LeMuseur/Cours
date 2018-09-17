
/**
 * Décrivez votre classe PointCartesien ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class PointCartesien
{

    private double x;
    private double y;
    
    /**
     * Constructeur d'objets de classe PointCartesien
     */
    public PointCartesien()
    {
        x = 0;
        y = 0;
    }
    public PointCartesien(double x,double y)
    {
        this.x = x;
        this.y = y;
    }
    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public double get_ro()
    {
        return Math.sqrt(this.x*this.x+this.y*this.y);
    }
    public double get_theta()
    {
        return Math.atan2(this.y,this.x)*180/Math.PI;
    }
    public double get_x()
    {
        return this.x;
    }
    public double get_y()
    {
        return this.y;
    }
    public void set_x(double x)
    {
        this.x = x;
    }
    public void set_y(double y)
    {
        this.y = y;
    }
    public void afficher()
    {
        System.out.println(ToStrgP()+ToStrgC());
               
    }
    public String ToStrgC()
    {
        return "\nX = "+this.x+" | Y = "+this.y;
    }
    public String ToStrgP()
    {
        return "\nRo = "+get_ro()+" | Th = "+get_theta();
    }
}
