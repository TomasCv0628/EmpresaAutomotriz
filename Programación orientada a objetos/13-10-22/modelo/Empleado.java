package modelo;

import java.util.ArrayList;

public class Empleado 
{
    private String nombre;
    private ArrayList<Integer> ventas = new ArrayList<>(); 
    private int salarioFinal;
    private final static int SALARIO_MIN = 1000000;
    private final static int COMISION_CARRO = 100000;

    public Empleado (String pEmpleado; ArrayList<Integer> ventas)
    {
        
    }
    public void setNombre(String pNombre)
    {
        this.nombre = pNombre;
    }
    public String getNombre()
    {
        return nombre;
    }
    public void agregarLista()
    {
        ventas.add();
    }
    public void calcularSalario()
    {
        int x = 0;
        for(int i = 0; i < ventas.size(); i++)
        {
            x = (ventas.get(i)* 2)/100;
        }
        salarioFinal = SALARIO_MIN + (COMISION_CARRO * ventas.size()) + x; 
    }
    public int getSalario()
    {
        return salarioFinal;
    }


}
