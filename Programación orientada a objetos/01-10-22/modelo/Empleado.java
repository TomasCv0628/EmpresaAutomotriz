package modelo;

public class Empleado
{
    private static final int SALARIO_MIN = 1000000; 
    private static final int AUX_TRANSPORTE = 117172; 
    private int annoNacimiento;
    private int annoIngreso;
    private String nombre;
    private int horasTrabajo;
    private int valorHora;
    private int salario;
    
    public static int getSalarioMin()
    {
        return SALARIO_MIN;
    }
    public void setAnnoN(int pAnnoN)
    {
        this.annoNacimiento = pAnnoN;
    }
    public void setAnnoI(int pAnnoI)
    {
        this.annoIngreso = pAnnoI;
    }
    public void setNombre(String pNombre)
    {
        this.nombre= pNombre;
    }
    public String getNombre()
    {
        return nombre;
    }
    public void setValor(int pValor)
    {
        this.valorHora = pValor;
    }
    public int getValor()
    {
        return valorHora;
    }
    public void setHoras(int pHoras)
    {
        this.horasTrabajo = pHoras;
    }
    public int getHoras()
    {
        return horasTrabajo;
    }
    public void pFechaIngreso()
    {
        int fI = 0;
        fI = 2022 - annoIngreso;
        annoIngreso = fI;
    }
    public void pEdad ()
    {
        int fN = 0;
        fN = 2022 - annoNacimiento;
        annoNacimiento = fN;
    }
    public int getAnnoIn()
    {
        return annoIngreso;
    }
    public int getAnnoNa()
    {
        return annoNacimiento;
    }
    public void hallarSalario()
    {
        int z = horasTrabajo * valorHora;

        if (z <2*SALARIO_MIN)
        {
            salario = z + AUX_TRANSPORTE;
        }
        else
        {
            salario = z;
        }
    }
    public int getSalario()
    {
        return salario;
    }

}
