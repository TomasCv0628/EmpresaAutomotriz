package modelo;

public class Empleado
{
    private static final int SALARIO_MIN = 1000000; 
    private static final int AUX_TRANSPORTE = 117172; 
    private int añoNacimiento;
    private int añoIngreso;
    private String nombre;
    private int horasTrabajo;
    private int valorHora;
    private int salario;
    
    public Empleado(String pNombre, int pAñoN, int pAñoI, int pHoras, int pValor, int pSalario)
    {
        this.añoNacimiento = pAñoN;
        this.añoIngreso = pAñoI;
        this.nombre = pNombre;
        this.horasTrabajo = pHoras;
        this.valorHora = pValor;
        this.salario = pSalario; 
    }
    public Empleado()
    {
        this.añoNacimiento = 0;
        this.añoIngreso = 0;
        this.nombre = "";
        this.valorHora = 0;
        this.horasTrabajo = 0;
        this.salario = 0;
    }
    
    public static int getSalarioMin()
    {
        return SALARIO_MIN;
    }
    public int getAñoNacimiento()
    {
        return this.añoNacimiento;
    }
    public int getAñoIngreso()
    {
        return this.añoNacimiento;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public int getHoras()
    {
        return this.horasTrabajo;
    }
    public int getValor()
    {
        return this.valorHora;
    }
    public void setAñoN(int pAñoN)
    {
        this.añoNacimiento = pAñoN;
    }
    public void setAñoI(int pAñoI)
    {
        this.añoIngreso = pAñoI;
    }
    public void setNombre(String pNombre)
    {
        this.nombre= pNombre;
    }
    public void setValor(int pValor)
    {
        this.valorHora = pValor;
    }
    public void setHoras(int pHoras)
    {
        this.horasTrabajo = pHoras;
    }
    public void pFechaIngreso()
    {
        setAñoI(2022 - getAñoIngreso());
    }
    public void pEdad ()
    {
        setAñoN(2022 - getAñoNacimiento());
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
