package controlador;

import modelo.Empleado;
import vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class Controlador implements ActionListener
{
    //----------------------------
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private Empleado model;
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Empleado pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();
        /*
        if(comando.equals("crear"))
        {   
            //Val/*idar datos entrada
            try
            {
                String nombre = venPrin.miPanelEntradaDatos.getNombre();
                int añoIngreso = Integer.parseInt(venPrin.miPanelEntradaDatos.getAñoI());
                int añoNacimiento = Integer.parseInt(venPrin.miPanelEntradaDatos.getAñoN());
                int horasTrabajo = Integer.parseInt(venPrin.miPanelEntradaDatos.getHoras());
                int valorHora = Integer.parseInt(venPrin.miPanelEntradaDatos.getValor());
                int salario= model.getSalario();
            
                //Creación del objeto tipo Carro
                
                model = new Empleado (nombre, añoNacimiento, añoIngreso,horasTrabajo, valorHora, salario);
                
                venPrin.miPanelResultado.mostrarResultado("Datos del empleado");
                venPrin.miPanelResultado.mostrarResultado("El nombre del empleado es " +model.getNombre());
                venPrin.miPanelResultado.mostrarResultado("Los años que lleva en la empresa son " + model.getAñoIngreso());
                venPrin.miPanelResultado.mostrarResultado("Su año de nacimiento es " + model.getAñoNacimiento());
                venPrin.miPanelResultado.mostrarResultado("Sus horas de trabajo son " + model.getHoras());
                venPrin.miPanelResultado.mostrarResultado("El valor de cada hora es " + model.getValor());
                venPrin.miPanelResultado.mostrarResultado("Su salario es " + model.getSalario());

                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error en datos de entrada", "Error", JOptionPane.ERROR_MESSAGE);
            }   
        }
        */
        if(comando.equals("imprimir"))
        {   
            this.model.setNombre(this.venPrin.miPanelEntradaDatos.getNombre());
            this.model.setHoras(Integer.parseInt(this.venPrin.miPanelEntradaDatos.getHoras()));
            venPrin.miPanelResultado.mostrarResultado("\nEl nombre del empleado es " + model.getNombre() + "\n Trabajo " + model.getHoras() + " horas " );
            
        }
        
        if(comando.equals("fechaIngreso"))
        {
            this.model.setAñoI(Integer.parseInt(this.venPrin.miPanelEntradaDatos.getAñoI()));
            model.pFechaIngreso();
            venPrin.miPanelResultado.mostrarResultado("\n El empleado ingreso a la empresa el año " + model.getAñoIngreso());
        }
        
        if(comando.equals("edad"))
        {
            this.model.setAñoN(Integer.parseInt(this.venPrin.miPanelEntradaDatos.getAñoN()));
            model.pEdad();
            venPrin.miPanelResultado.mostrarResultado("\n El empleado nacio el año " + model.getAñoNacimiento());
        }
        
        if(comando.equals("salario"))
        {
            this.model.setValor(Integer.parseInt(this.venPrin.miPanelEntradaDatos.getValor()));
            this.model.setHoras(Integer.parseInt(this.venPrin.miPanelEntradaDatos.getHoras()));
            model.hallarSalario();
            venPrin.miPanelResultado.mostrarResultado("\nEl salario del usuario es " + model.getSalario());
        }
    }    
}
