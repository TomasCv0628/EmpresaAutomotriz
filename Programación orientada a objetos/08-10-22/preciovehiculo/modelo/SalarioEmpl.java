package modelo;

import java.util.ArrayList;

import vista.PanelResultados;

public class SalarioEmpl
{   
    private final int SALARIO_MIN = 1000000;
    private String nombre;
    private final int GAN_CARRO = 100000;
    private int precioCarro;
    private int ventasMes;
    

    public SalarioEmpl (String pNombre, int pPrecioCarro)
    {
        this.nombre = pNombre;
        this.precioCarro = pPrecioCarro;
    }
    public SalarioEmpl()
    {
        this.nombre = "";
        this.precioCarro = 0;
    }
    ArrayList<Integer> listaPrecios = new ArrayList<>();

    //ArrayList<String> listaNombres = new ArrayList<>();
    public void agregarDatos()
    {
        listaPrecios.add(precioCarro);
    }
    public int getPrecio()
    {
        return this.precioCarro;
    }

    public void calcularSalario()
    {
        double comision = 0;
        double salario = 0;

        for(int i = 0; i < listaPrecios.size();i++)
        {
            comision = (listaPrecios.get(i) * 20)/100;
        }
        salario = SALARIO_MIN + (GAN_CARRO*listaPrecios.size()) + comision;
        PanelResultados.mostrarResultado("El salario es de: " + salario);
    }


}