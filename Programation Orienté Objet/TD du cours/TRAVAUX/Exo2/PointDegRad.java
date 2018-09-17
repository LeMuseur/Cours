
/**
 * Décrivez votre classe PointDegRad ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class PointDegRad
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private double longitude;
    private double latitude;

    /**
     * Constructeur d'objets de classe PointDegRad
     */
    public PointDegRad()
    {
        longitude = 0;
        latitude = 0;
    }
    public PointDegRad(double longitude, double latitude)
    {
        this.longitude = longitude;
        this.latitude = latitude;
    }
    
    public void setLatitudeDegDec(double latitude )
    {
        this.latitude = latitude*Math.PI/180;
    }
    public double getLatitudeDegDec()
    {
        return this.latitude*180/Math.PI;
    }
    public void setLongitudeDegDec(double longitude )
    {
        this.longitude = longitude*Math.PI/180;
    }
    public double getLongitudeDegDec()
    {
        return this.longitude*180/Math.PI;
    }
    
    public void setLatitudeRad(double latitude )
    {
        this.latitude = latitude;
    }
    public double getLatitudeRad()
    {
        return this.latitude;
    }
    public void setLongitudeRag(double longitude )
    {
        this.longitude = longitude;
    }
    public double getLongitudeRad()
    {
        return this.longitude;
    }
    
    public void setLatitudeDegSexa(int degre , int min, int sec )
    {
        this.latitude = (degre+(min/60)+(sec/3600))*Math.PI/180;
    }
    public int[ ] getLatitudeDegSexa()
    {
        int [] LatitudeSexa = new int [3];
        double latitude = this.latitude*180/Math.PI;
        LatitudeSexa[0]=(int)Math.floor(latitude);//Deg
        LatitudeSexa[1]=(int)Math.floor((latitude-LatitudeSexa[0])*60);//Min
        LatitudeSexa[2]=(int)Math.floor((((latitude-LatitudeSexa[0])*60)-LatitudeSexa[1])*60);//Sec
        return LatitudeSexa;
    }
    public void setLongitudeDegSexa(int degre , int min, int sec )
    {
        this.longitude = (degre+(min/60)+(sec/3600))*Math.PI/180;
    }
    public int[ ] getLongitudeDegSexa()
    {
        int [] LongitudeSexa = new int [3];
        double longitude = this.longitude*180/Math.PI;
        LongitudeSexa[0]=(int)Math.floor(longitude);//Deg
        LongitudeSexa[1]=(int)Math.floor((longitude-LongitudeSexa[0])*60);//Min
        LongitudeSexa[2]=(int)Math.floor((((longitude-LongitudeSexa[0])*60)-LongitudeSexa[1])*60);//Sec
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
