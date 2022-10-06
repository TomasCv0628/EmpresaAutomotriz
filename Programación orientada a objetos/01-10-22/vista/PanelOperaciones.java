package vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    public JButton bImprimir;
    public JButton bAnnoI;
    public JButton bEdad;
    public JButton bSalario;
    
    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelOperaciones()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de los botones
        bImprimir = new JButton("Imprimir");
        bImprimir.setFont(new Font("Arial", BOLD, 12));
        bImprimir.setBounds(10,20,90,20);
        bImprimir.setActionCommand("imprimir");
        this.add(bImprimir);
        
        bEdad = new JButton("Borrar");
        bEdad.setFont(new Font("Arial", BOLD, 12));
        bEdad.setBounds(200,20,90,20);
        bEdad.setActionCommand("borrar");
        this.add(bEdad);

        
        bSalario = new JButton("Salir");
        bSalario.setFont(new Font("Arial", BOLD, 12));
        bSalario.setBounds(295,20,80,20);
        bSalario.setActionCommand("salir");
        this.add(bSalario);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
}