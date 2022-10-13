package vista;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{

    public JButton bAgregar;
    public JButton bBorrar;
    public JButton bSalir;
    public JButton bSalario;

    public PanelOperaciones()
    {
        
        setLayout(null);
        setBackground(Color.WHITE);
        
        bAgregar = new JButton("Agregar");
        bAgregar.setFont(new Font("Arial", BOLD, 12));
        bAgregar.setBounds(10,20,70,20);
        bAgregar.setActionCommand("agregar");
        this.add(bAgregar);

        bSalario = new JButton("Salario");
        bSalario.setFont(new Font("Arial", BOLD, 12));
        bSalario.setBounds(85,20,70,20);
        bSalario.setActionCommand("agregar");
        this.add(bSalario);
    
        bSalir = new JButton("Borrar");
        bSalir.setFont(new Font("Arial", BOLD, 12));
        bSalir.setBounds(160,20,70,20);
        bSalir.setActionCommand("borrar");
        this.add(bSalir);

        bBorrar = new JButton("Salir");
        bBorrar.setFont(new Font("Arial", BOLD, 12));
        bBorrar.setBounds(235,20,70,20);
        bBorrar.setActionCommand("salir");
        this.add(bBorrar);

        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLACK);
        setBorder(borde);
    }
}
