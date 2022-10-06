package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //------------------------
    //Atributos
    //------------------------
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lbNombre;
    private JLabel lbAñoI;
    private JLabel lbAñoN;
    private JLabel lbValor;
    private JLabel lbHoras;
    private JTextField tfNombre;
    private JTextField tfAñoI;
    private JTextField tfAñoN;
    private JTextField tfValor;
    private JTextField tfHoras;
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/empleado.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,10,150,150);
        add(lbImagen);
        
        //Creación y adición de etiquetas Color, PosX y PosY
        lbNombre = new JLabel("Nombre = ");
        lbNombre.setBounds(170,10,100,20);
        add(lbNombre);
        
        lbAñoI = new JLabel("Año de Ingreso = ");
        lbAñoI.setBounds(170,40,130,20);
        add(lbAñoI);
        
        lbAñoN = new JLabel("Año de nacimiento = ");
        lbAñoN.setBounds(170,70,130,20);
        add(lbAñoN);
        
        lbValor = new JLabel("Valor por hora");
        lbValor.setBounds(170,100,130,20);
        add(lbValor);

        lbHoras = new JLabel("Horas de trabajo = ");
        lbHoras.setBounds(170,130,130,20);
        add(lbHoras);
        
        //Creación y adición de campos de texto
        tfNombre = new JTextField();
        tfNombre.setBounds(300, 10, 60, 20);
        add(tfNombre);
        
        tfAñoI = new JTextField();
        tfAñoI.setBounds(300, 40, 60, 20);
        add(tfAñoI);
        
        tfAñoN = new JTextField();
        tfAñoN.setBounds(300, 70, 60, 20);
        add(tfAñoN);
        
        tfValor = new JTextField();
        tfValor.setBounds(300, 100, 60, 20);
        add(tfValor);

        tfHoras = new JTextField();
        tfHoras.setBounds(300, 130, 60, 20);
        add(tfHoras);
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String getNombre()
    {
        return tfNombre.getText();
    }
    
    public String getAñoI()
    {
        return tfAñoI.getText();
    }
    
    public String getAñoN()
    {
        return tfAñoN.getText();
    }
    public String getValor()
    {
        return tfValor.getText();
    }
    public String getHoras()
    {
        return tfHoras.getText();
    }
    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfNombre.setText("");
        tfAñoI.setText("");
        tfAñoN.setText("");
        tfHoras.setText("");
        tfValor.setText("");
    }
}