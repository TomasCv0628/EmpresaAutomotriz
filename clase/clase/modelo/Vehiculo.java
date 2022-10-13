package modelo;

public class Vehiculo
{

    private final static int ANIO_ACTUAL = 2022;
    private int modelo;
    private String ciudadMatricula;
    private double precio;

    public Vehiculo(int pModelo, double pPrecio, String pCiudadMatricula)
    {
        this.modelo = pModelo;
        this.precio = pPrecio;
        this.ciudadMatricula = pCiudadMatricula;
    }

    public double calcularImpuesto()
    {
        if(modelo == ANIO_ACTUAL)
        {
            return 0.1*precio;
        }
        else if((ANIO_ACTUAL - modelo) <= 5)
        {
            return 0.07 * precio;
        }
        else
        {
            return 0.03 * precio;
        }

    }
    public double calcularDescuento()
    {
        if(ciudadMatricula.toUpperCase().equals("SOCORRO"))
        {
            return 0.5 * calcularImpuesto();
        }
        else
        {

            return 0;
        }
    }
    public double calcularValorAPagar()
    {
        return calcularImpuesto() - calcularDescuento();
    }
    public static void main(String[] args) 
    {
        Vehiculo miCarro = new Vehiculo(2015,10000000,"SOCORRO");
        System.out.println("RECIBO IMPUESTO");
        System.out.println("Impueso: " + miCarro.calcularImpuesto());
        System.out.println("Descuento: " + miCarro.calcularDescuento());
        System.out.println("Valor a pagar: "  + miCarro.calcularValorAPagar());    
    }
}