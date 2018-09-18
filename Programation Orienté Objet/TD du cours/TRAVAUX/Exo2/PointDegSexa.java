
/**
 * Décrivez votre classe PointDegSexa ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class PointDegSexa implements ISvcPointGPS
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int[ ] longitude;
    private int[ ] latitude;

    /**
     * Constructeur d'objets de classe PointDegSexa
    
    public PointDegSexa()
    {
       this.longitude = new int [3];
       this.latitude = new int [3];
       this.longitude[0] = 0;
       this.longitude[1] = 0;
       this.longitude[2] = 0;
       this.latitude[0] = 0;
       this.latitude[1] = 0;
       this.latitude[2] = 0;
    }
    */
   
    public PointDegSexa(int [] longitude,int [] latitude)
    {
        this.longitude = new int [3];
        this.latitude = new int [3];
        this.longitude = longitude;
        this.latitude = latitude;
    }
    
    public void setLatitudeDegDec(double latitude )
    {
        this.latitude[0]=(int)Math.floor(latitude);//Deg
        this.latitude[1]=(int)Math.floor((latitude-this.latitude[0])*60);//Min
        this.latitude[2]=(int)Math.floor((((latitude-this.latitude[0])*60)-this.latitude[1])*60);//Sec
    }
    
    public double getLatitudeDegDec()
    {
        return this.latitude[0]+(this.latitude[1]/60.)+(this.latitude[2]/3600.);
    }
    
    public void setLongitudeDegDec(double longitude )
    {
        this.longitude[0]=(int)Math.floor(longitude);//Deg
        this.longitude[1]=(int)Math.floor((longitude-this.longitude[0])*60);//Min
        this.longitude[2]=(int)Math.floor((((longitude-this.longitude[0])*60)-this.longitude[1])*60);//Sec
    }
    
    public double getLongitudeDegDec()
    {
        return this.longitude[0]+(this.longitude[1]/60.)+(this.longitude[2]/3600.);
    }
    
    public void setLatitudeRad(double latitude )
    {
        double latitudeC = latitude*Math.PI/180;
        this.latitude[0]=(int)Math.floor(latitudeC);//Deg
        this.latitude[1]=(int)Math.floor((latitudeC-this.latitude[0])*60);//Min
        this.latitude[2]=(int)Math.floor((((latitudeC-this.latitude[0])*60)-this.latitude[1])*60);//Sec
    }
    
    public double getLatitudeRad()
    {
        return (this.latitude[0]+(this.latitude[1]/60.)+(this.latitude[2]/3600.))*Math.PI/180;
    }
    
    public void setLongitudeRag(double longitude )
    {
        double longitudeC = longitude*Math.PI/180;
        this.longitude[0]=(int)Math.floor(longitude);//Deg
        this.longitude[1]=(int)Math.floor((longitude-this.longitude[0])*60);//Min
        this.longitude[2]=(int)Math.floor((((longitude-this.longitude[0])*60)-this.longitude[1])*60);//Sec
    }
    
    public double getLongitudeRad()
    {
        return (this.longitude[0]+(this.longitude[1]/60.)+(this.longitude[2]/3600.))*Math.PI/180;
    }
    
    public void setLatitudeDegSexa(int degre , int min, int sec )
    {
        this.latitude[0] = degre;
        this.latitude[1] = min;
        this.latitude[2] = sec;
    }
    
    public int[ ] getLatitudeDegSexa()
    {
        return this.latitude;
    }
    
    public void setLongitudeDegSexa(int degre , int min, int sec )
    {
        this.longitude[0] = degre;
        this.longitude[1] = min;
        this.longitude[2] = sec;
    }
    
    public int[ ] getLongitudeDegSexa()
    {
        return this.longitude;
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
