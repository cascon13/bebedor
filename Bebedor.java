
/**
 * Write a description of class Bebedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bebedor
{
    // instance variables - replace the example below with your own
    private double alcoholEnSangre;
    private double limite;
    private String nombre;

    /**
     * Constructor for objects of class Bebedor
     */
    public Bebedor(double limite, String nombre)
    {
        this.nombre = nombre;
        this.alcoholEnSangre = 0;
        this.limite = limite;
    }
    public double getAlcoholEnSangre()
    {
        return alcoholEnSangre;
    }
    
    public void beberCubata(Cubata copa)
    {
          
         if(alcoholEnSangre < limite)
         {
             alcoholEnSangre = alcoholEnSangre + copa.getAlcohol();
         }
         else
         {
             System.out.println ("No quiero beber mas ");
         }
    }
    public void getRespuesta ( String pregunta)
    {
        String respuesta ;
        if(alcoholEnSangre > limite || pregunta.contains(this.nombre))
        {
            respuesta = pregunta.toUpperCase();
        }
        else
        {
            
            if (pregunta.length()% 2  == 0 )
            {
                respuesta = " Si ";
            }
            else
            {
                respuesta = " No ";
            }
        }
        System.out.println (respuesta);
    }
    
}