package Hogar;

public class Hogar 
{
    public static void main(String[] args) 
    {
        
      
        
    }
    
    public void imprimirVivienda(Vivienda v) 
    {
        Vivienda casa1 = new Vivienda(120000);
        
        System.out.println("Precio: " + casa1.getPrecio());
        System.out.println("Número de habitaciones: "+ casa1.getnumHabitaciones());
        System.out.println("Superficie en m2: " + casa1.getsuperficie());
        System.out.println("¿Dispone de parking?: " + casa1.getparking());
        System.out.println("Estado: "+ casa1.getestado());
        System.out.println("Propietario: "+ casa1.getpropietario());
    }

    
}
