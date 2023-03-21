package Hogar;

public class Vivienda 
{  
    private double precio; 
    private int numHabitaciones; 
    private double superficie;
    private boolean parking; 
    private String estado; 
    private String propietario; 
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    public Vivienda (double pre,int n, double s, boolean par, String e, String p)
    {
        this.precio = pre;
        this.numHabitaciones = n;
        this.superficie = s;
        this.parking = par;
        this.estado = e;
        this.propietario = p;
    }
    public void actualizarPrecio(int descuento)
    {
        this.precio = this.precio - descuento;
    }
    double getPrecio()
    {
         return this.precio;   
    }
    int getnumHabitaciones()
    {
         return this.numHabitaciones;   
    }
    double getsuperficie()
    {
         return this.superficie;   
    }
    boolean getparking()
    {
         return this.parking;   
    }    
    String getestado()
    {
         return this.estado;   
    }   
    String getpropietario()
    {
         return this.propietario;   
    }
    void setPrecio(double x)
    {
        this.precio = x;   
    }
    
    void setnumHabitaciones(int i)
    {
        this.numHabitaciones = i;   
    }
    
    void setsuperficie(double d)
    {
        this.superficie = d;   
    }
    
    void setparking(boolean k)
    {
        this.parking = k;   
    }
    
    void setestado(String h)
    {
        this.estado = h;   
    }
    
    void setpropietario(String j)
    {
        this.propietario = j;   
    }    
}
