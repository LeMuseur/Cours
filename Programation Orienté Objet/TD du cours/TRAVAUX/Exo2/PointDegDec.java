
/**
 * Décrivez votre classe PointDeg ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class PointDegDec implements ISvcPointGPS
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private double longitude;
    private double latitude;

    /**
     * Constructeur d'objets de classe PointDeg
     */
    public PointDegDec()
    {
        longitude = 0;
        latitude = 0;
    }

    public PointDegDec(double longitude, double latitude)
    {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public void setLatitudeDegDec(double latitude )
    {
        this.latitude = latitude;
    }

    public double getLatitudeDegDec()
    {
        return this.latitude;
    }

    public void setLongitudeDegDec(double longitude )
    {
        this.longitude = longitude;
    }

    public double getLongitudeDegDec()
    {
        return this.longitude;
    }

    public void setLatitudeRad(double latitude )
    {
        this.latitude = latitude*180./Math.PI;
    }

    public double getLatitudeRad()
    {
        return this.latitude*Math.PI/180.;
    }

    public void setLongitudeRag(double longitude )
    {
        this.longitude = longitude*180./Math.PI;
    }

    public double getLongitudeRad()
    {
        return this.longitude*Math.PI/180.;
    }

    public void setLatitudeDegSexa(int degre , int min, int sec )
    {
        this.latitude = degre+(min/60.)+(sec/3600.);
    }

    public int[ ] getLatitudeDegSexa()
    {
        int [] LatitudeSexa = new int [3];
        LatitudeSexa[0]=(int)Math.floor(this.latitude);//Deg
        LatitudeSexa[1]=(int)Math.floor((this.latitude-LatitudeSexa[0])*60.);//Min
        LatitudeSexa[2]=(int)Math.floor((((this.latitude-LatitudeSexa[0])*60.)-LatitudeSexa[1])*60.);//Sec
        return LatitudeSexa;
    }

    public void setLongitudeDegSexa(int degre , int min, int sec )
    {
        this.longitude = degre+(min/60.)+(sec/3600.);
    }

    public int[ ] getLongitudeDegSexa()
    {
        int [] LongitudeSexa = new int [3];
        LongitudeSexa[0]=(int)Math.floor(this.longitude);//Deg
        LongitudeSexa[1]=(int)Math.floor((this.longitude-LongitudeSexa[0])*60.);//Min
        LongitudeSexa[2]=(int)Math.floor((((this.longitude-LongitudeSexa[0])*60.)-LongitudeSexa[1])*60.);//Sec
        return LongitudeSexa;
    }
    public String ToString()
    {
        int[] TabLatSexa = new int[3];
        TabLatSexa = getLatitudeDegSexa();
        int[] TabLonSexa = new int[3];
        TabLonSexa = getLongitudeDegSexa();
        
        return "\n Get Latitude Deg Dec = "+getLatitudeDegDec()+"\n Get Latitude Deg Rad = "+getLatitudeRad()+"\n Get Latitude Deg Sexa = "+"Deg : "+TabLatSexa[0]+" | Min : "+TabLatSexa[1]+" | Sec : "+TabLatSexa[2]+"\n Get Longitude Deg Dec = "+getLongitudeDegDec()+"\n Get Longitude Deg Rad = "+getLongitudeRad()+"\n Get Longitude Deg Sexa = "+"Deg : "+TabLonSexa[0]+" | Min : "+TabLonSexa[1]+" | Sec : "+TabLonSexa[2];
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public void sampleMethod(int y)
    {
        // Insérez votre code ici
    }
}
