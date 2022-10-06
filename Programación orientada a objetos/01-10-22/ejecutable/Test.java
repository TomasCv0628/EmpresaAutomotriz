package ejecutable;

import controlador.Controlador;
import modelo.Empleado;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        Empleado miEmpleado = new Empleado();
        Controlador miControlador = new Controlador(miVentanaPrincipal, miEmpleado);

    }
}
