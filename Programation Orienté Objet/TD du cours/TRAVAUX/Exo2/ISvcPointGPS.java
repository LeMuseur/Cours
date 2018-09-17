
/**
 * Décrivez votre interface ISvcPointGPS ici.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 */

public interface ISvcPointGPS
{
    /**
     * Exemple d'entête de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y    le paramètre de cette méthode
     * @return        le résultat retourné par exempleDeMethode
     */
    public abstract void    setLatitudeDegDec(double latitude );
    public abstract double  getLatitudeDegDec();
    public abstract void    setLongitudeDegDec(double longitude );
    public abstract double  getLongitudeDegDec();
    public abstract void    setLatitudeRad(double latitude );
    public abstract double  getLatitudeRad();
    public abstract void    setLongitudeRag(double longitude );
    public abstract double  getLongitudeRad();
    public abstract void    setLatitudeDegSexa(int degre , int min, int sec );
    public abstract int[ ]  getLatitudeDegSexa();
    public abstract void    setLongitudeDegSexa(int degre , int min, int sec );
    public abstract int[ ]  getLongitudeDegSexa();
    /**int exempleDeMethode(int y);*/
}
