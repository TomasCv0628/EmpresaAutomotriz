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
        this.venPrin.miPanelOperaciones.bSalario.addActionListener(this);
        this.venPrin.miPanelOperaciones.bEdad.addActionListener(this);
        this.venPrin.miPanelOperaciones.bImprimir.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae) 
    {
        
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();

        if(comando.equals("imprimir"))
        {   
            this.model.setNombre(this.venPrin.miPanelEntradaDatos.getNombre());
            this.model.setHoras(Integer.parseInt(this.venPrin.miPanelEntradaDatos.getHoras()));
            this.model.setAnnoI(Integer.parseInt(this.venPrin.miPanelEntradaDatos.getAnnoI()));
            this.model.setAnnoN(Integer.parseInt(this.venPrin.miPanelEntradaDatos.getAnnoN()));
            this.model.setValor(Integer.parseInt(this.venPrin.miPanelEntradaDatos.getValor()));
            this.model.setHoras(Integer.parseInt(this.venPrin.miPanelEntradaDatos.getHoras()));
            this.model.pFechaIngreso();
            this.model.pEdad();
            this.model.hallarSalario();
            this.venPrin.miPanelResultado.mostrarResultado(this.model.getAnnoIn(), this.model.getAnnoNa(), this.model.getSalario(), this.model.getHoras(), this.model.getNombre());
            
        }
        if(comando.equals("borrar"))
        {
            JOptionPane.showMessageDialog(null, "Los valores se borraran ","Empleado", JOptionPane.WARNING_MESSAGE);
            this.venPrin.miPanelEntradaDatos.borrar();
            this.venPrin.miPanelResultado.borrar();
        }
        if(comando.equals("salir"))
        {
            JOptionPane.showMessageDialog(null, "El programa se cerrara ","Empleado", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }

    }    
}
