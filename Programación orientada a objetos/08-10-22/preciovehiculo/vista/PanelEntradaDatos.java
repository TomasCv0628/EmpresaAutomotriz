package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    
    private JLabel lbNombre;
    private JLabel lbCarros;
    private JTextField tfNombre;
    private JTextField tfCarros;
    private JLabel lbImagen;
    private ImageIcon iImagen;

    public PanelEntradaDatos()
    {
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        /* 
        iImagen = new ImageIcon(getClass().getResource("/vista/impuestos.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,10,150,150);
        this.add(lbImagen);
        */
        //Creación y adición de etiquetas Color, PosX y PosY
        lbNombre = new JLabel("Color = ");
        lbNombre.setBounds(230,10,60,20);
        add(lbNombre);
        
        lbCarros = new JLabel("PosX = ");
        lbCarros.setBounds(230,40,60,20);
        add(lbCarros);
        
        //Creación y adición de campos de texto
        tfNombre = new JTextField("Azul");
        tfNombre.setBounds(300, 10, 60, 20);
        add(tfNombre);
        
        tfCarros = new JTextField("10");
        tfCarros.setBounds(300, 40, 60, 20);
        add(tfCarros);
        
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);

    }
    public String getNombre()
    {
        return tfNombre.getText();
    }
    public String getCarros()
    {
        return tfCarros.getText();
    }
    public void borrar()
    {
        tfNombre.setText("");
        tfCarros.setText("");
    }

}
